package Arrays2D;

public class RowWiseSum {
    //here to find out the size of rows and columns use below
    //mat.length = it will give length of rows
    //mat[0].length = it will give length of columns in 2D Array
    public static void rowWiseSum(int[][] mat){
        for(int rowCount=0;rowCount<mat.length;rowCount++){
            int sum=0;
            for(int colCount=0;colCount<mat[rowCount].length;colCount++){
                sum=sum+mat[rowCount][colCount];
            }
            System.out.print(sum+" ");
        }
    }
    //4 5 3 2 6
    //7 5 3 8 9
    //20 32
    public static void main(String[] args) {
        int mat[][]={{4,5,3,2,6},{7,5,3,8,9},{1,2,3}};
        rowWiseSum(mat);
    }
}
