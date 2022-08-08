package Recursion;

public class CountZeros {
    public static int count=0;
    public static int countZerosRec(int input){
        if(input/10==0 && input%10==0){
            return 1;
        }else if(input/10==0){
            return 0;
        }

        if(input%10==0){
            count++;
            countZerosRec(input/10);
        }else{
            countZerosRec(input/10);
        }
        return count;
    }
    //0=1
    //1=0
    //00012309=1
    //100099=3
    //1000=3
    public static void main(String[] args) {
        int n=109;
        System.out.print(countZerosRec(n));
        //System.out.print(1000%10);
    }
}
