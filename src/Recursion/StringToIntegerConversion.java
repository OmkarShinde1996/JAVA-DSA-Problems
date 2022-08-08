package Recursion;

public class StringToIntegerConversion {
    public static int convertStringToInt(String input){

        // If the number represented as a string
        // contains only a single digit
        // then returns its value
        if (input.length() == 1)
            return (input.charAt(0) - '0');

        // Recursive call for the sub-string
        // starting at the second character
        double y = convertStringToInt(input.substring(1));

        // First digit of the number
        double x = input.charAt(0) - '0';

        // First digit multiplied by the
        // appropriate power of 10 and then
        // add the recursive result
        // For example, xy = ((x * 10) + y)
        x = x * Math.pow(10, input.length() - 1) + y;
        return (int)(x);
    }
    //123
    public static void main(String[] args) {
        String str = "00123";
        System.out.print(convertStringToInt(str));
    }
}
