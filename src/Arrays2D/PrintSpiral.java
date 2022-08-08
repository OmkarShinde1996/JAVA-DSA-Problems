package Arrays2D;

public class PrintSpiral {
    static void spiralPrint(int mat[][]) {
        int rowStart=0;
        int rowEnd=mat.length;
        int colStart=0;
        int colEnd=mat[0].length;

        while(rowStart<rowEnd && colStart<colEnd){
            for(int i=colStart;i<colEnd;++i){
                System.out.print(mat[rowStart][i]+" ");
            }
            rowStart++;
            for(int i=rowStart;i<rowEnd;++i){
                System.out.print(mat[i][colEnd-1]+" ");
            }
            colEnd--;
            if(rowStart<rowEnd){
                for(int i=colEnd-1;i>=colStart;--i){
                    System.out.print(mat[rowEnd-1][i]+" ");
                }
                rowEnd--;
            }
            if(colStart<colEnd){
                for(int i=rowEnd-1;i>=rowStart;--i){
                    System.out.print(mat[i][colStart]+" ");
                }
                colStart++;
            }
        }
    }
    //1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10
    public static void main(String[] args) {
        int mat[][]={ {1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        spiralPrint(mat);
        //System.out.println(3%2);
    }
}
