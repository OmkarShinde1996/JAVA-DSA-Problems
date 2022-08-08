package Collection;

import java.util.Arrays;

public class PrintingArray {
    public static void main(String[] args) {
        String str[] = {"omkar","aniket","rohan","amol"};

        //1st way of printing Array
        for (int i=0; i< str.length;i++){
            System.out.println(str[i]);
        }
        System.out.println("=====================================");
        //2nd way of printing Array
        for(String str1:str){
            System.out.println(str1);
        }
        System.out.println("=====================================");
        //3rd way of printing Array
        System.out.println(Arrays.toString(str));
    }
}
