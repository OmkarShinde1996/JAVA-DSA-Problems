package Collection;

public class ReverseNumber {
    public static void main(String[] args) {
        int i = 121;
        int result=0;
        while(i!=0){
            int a = i%10;
            result=result*10+a;
            i=i/10;
        }
        System.out.println(result);
    }
}
