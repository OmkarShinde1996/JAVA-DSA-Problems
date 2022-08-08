package Collection;

//Fibonacci series is nothing but addition of previous 2 numbers {0,1,1,2,3,5,8}
public class FibonacciSeriesExample {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int c;
        System.out.println(a);
        System.out.println(b);
        for (int i =0; i < 5; i++){
            c=a+b;
            System.out.println(c);
            a=b;
            b=c;
        }
    }
}
