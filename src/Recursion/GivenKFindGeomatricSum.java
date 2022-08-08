package Recursion;

public class GivenKFindGeomatricSum {
    public static double findGeometricSum(int k){
        if(k==0){
            return 1;
        }
        double ans = 1/(double)Math.pow(2, k);
        return findGeometricSum(k - 1)+ans;
    }

    public static void main(String[] args) {
        int n=4;
        System.out.print(findGeometricSum(n));
    }
}
