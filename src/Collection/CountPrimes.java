package Collection;

public class CountPrimes {
    public static int countPrimes(int n) {
        boolean[] notPrime = new boolean[n];
        if (n <= 2) return 0;
        int ans = 1;
        for( int i = 3; i < n ; i+=2) {
            if(!notPrime[i]) {
                ans++;
                for( int j = 2; i*j < n; j++) {
                    notPrime[i*j] = true;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int n=10;
        System.out.println(countPrimes(n));
    }
}
