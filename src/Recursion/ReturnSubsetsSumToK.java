package Recursion;

public class ReturnSubsetsSumToK {
    public static int[][] helper(int input[], int k,int si) {
        if(si==input.length)
        {
            if(k==0)
                return new int[1][0];
            else
                return new int[0][0];
        }
        int op1[][]=helper(input,k-input[si],si+1);////////////
        int op2[][]=helper(input,k,si+1);
        int output[][]=new int[op1.length+op2.length][];////////////////
        int l=0;
        for(int i=0;i<op2.length;i++){
            output[i]=new int[op2[i].length];
            for(int j=0;j<op2[i].length;j++)
                output[l][j]=op2[i][j];////////
            l++;
        }
        for(int i=0;i<op1.length;i++){
            output[i+l]=new int[op1[i].length+1];
            output[i+l][0]=input[si];
            for(int j=1;j<=op1[i].length;j++){
                output[i+l][j]=op1[i][j-1];
            }}
        return output;
    }

    public static int[][] subsetsSumK(int input[], int k){
        return helper(input,k,0);
    }
    public static void main(String[] args) {
        int[] input = {5,12,3,17,1,18,15,3,17};
        int output[][] = subsetsSumK(input,6);
        for(int i = 0; i < output.length; i++) {
            for(int j = 0; j < output[i].length; j++) {
                System.out.print(output[i][j] + " ");
            }
            System.out.println();
        }
    }
}
