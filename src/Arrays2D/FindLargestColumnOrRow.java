package Arrays2D;

public class FindLargestColumnOrRow {
    public static void findLargest(int mat[][]){
        //for largest row
        int largestRowCount = Integer.MIN_VALUE;
        int largestRow =0;
        int largestRowrows = mat.length;//0
        if(largestRowrows==0){
            System.out.print("row"+" "+largestRow+" "+Integer.MIN_VALUE);
            return;
        }
        int largestRowcols = mat[0].length;
        for(int i=0;i<largestRowrows;i++){
            int sum=0;
            for(int j=0;j<largestRowcols;j++){
                sum=sum+mat[i][j];
            }
            if(sum > largestRowCount){
                largestRowCount = sum;
                largestRow=i;
            }
        }

        //for largest column
        int largestColCount = Integer.MIN_VALUE;
        int largestCol =0;
        int largestColrows = mat.length;
        int largestColcols = mat[0].length;
        for(int j = 0; j < largestColcols; j++){
            int sum = 0;
            for(int i = 0; i < largestColrows; i++){
                sum = sum + mat[i][j];
            }
            if(sum > largestColCount){
                largestColCount = sum;
                largestCol=j;
            }
        }
        if (largestRowCount>largestColCount){
            System.out.print("row"+" "+largestRow+" "+largestRowCount);
        }else if(largestRowCount<largestColCount){
            System.out.print("column"+" "+largestCol+" "+largestColCount);
        }else if(largestRowCount==0){
            System.out.print("row"+" "+largestRow+" "+Integer.MIN_VALUE);
        }else{
            System.out.print("row"+" "+largestRow+" "+largestRowCount);
        }

    }
    public static void main(String[] args) {
        int mat[][]={};
        findLargest(mat);
    }
}
