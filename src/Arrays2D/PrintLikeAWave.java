package Arrays2D;

public class PrintLikeAWave {
    static void wavePrint(int mat[][]){
        int rowCount=mat.length;
        if(rowCount==0){
            System.out.println();
            return;
        }
        int colCount=mat[0].length;
        for(int j=0;j<colCount;j++){
            if(j%2==0){
                for(int i=0;i<rowCount;i++){
                    System.out.print(mat[i][j]+" ");
                }
            }else{
                for(int i=rowCount-1;i>=0;i--){
                    System.out.print(mat[i][j]+" ");
                }
            }
        }

    }
//1 2 3
//4 5 6
//7 8 9
    //1 4 7 8 5 2 3 6 9
    public static void main(String[] args) {
        int mat[][]={ {1,2,3,4},{5,6,7,8},{9,10,11,12}};
        wavePrint(mat);
    }
}
