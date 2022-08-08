package Arrays2D;

public class LargestColSum {
    public static int largestColSum(int input[][]){
        int largest = Integer.MIN_VALUE;
        int rows = input.length;
        int cols = input[0].length;
        for(int j = 0; j < cols; j++){
            int sum = 0;
            for(int i = 0; i < rows; i++){
                sum = sum + input[i][j];
            }
            if(sum > largest){
                largest = sum;
            }
        }
        return largest;
    }
    //4,5,3,2,6
    //7,5,3,8,9
    //1,2,3,4,5
    //20
    public static void main(String[] args) {
        int mat[][]={{4,5,3,2,6},{7,5,3,8,9},{1,2,3,4,5}};
        System.out.println("Largest col sum "+ largestColSum(mat));
    }
}
