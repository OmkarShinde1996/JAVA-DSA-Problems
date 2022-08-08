package Arrays2D;

public class TotalSumOnTheBoundariesAndDiagonals {
    static void totalSum(int mat[][]){
        int N=mat.length;
        int requiredSum = 0;
        // Traverse arr[][]
        // Loop from i to N-1 for rows
        for (int i = 0; i < N; i++) {
            // Loop from j = N-1 for columns
            for (int j = 0; j < N; j++) {
                // Condition for diagonal
                // elements
                if (i == j || (i + j) == N - 1) {
                    requiredSum += mat[i][j];
                }
                // Condition for Boundary
                // elements
                else if (i == 0 || j == 0 || i == N - 1|| j == N - 1) {
                    requiredSum += mat[i][j];
                }
            }
        }
        // Print the final Sum
        System.out.println(requiredSum);
    }
    //273
    public static void main(String[] args) {
        int mat[][]={ {1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
        totalSum(mat);
    }
}
