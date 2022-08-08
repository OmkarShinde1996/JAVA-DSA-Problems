package Strings;

public class CompressedString {
    public static String getCompressedString(String str){
        if (str.length() == 0)
        {
            return "";
        }
        String output = "";
        output =output+str.charAt(0);
        int count = 1;
        for (int i = 1; i < str.length(); i++)
        {
            if (str.charAt(i) == str.charAt(i-1))
            {
                count++;

                if (i == str.length() - 1)
                {
                    output =output+ count;
                }
            }
            else
            {
                if (count > 1)
                {
                    output =output+ count;
                    output =output+ str.charAt(i);
                }
                else
                {
                    output =output+ str.charAt(i);
                }
                count = 1;
            }
        }
        return output;
    }
    //a3b2c2dsa
    public static void main(String[] args) {
        String str= "aaabbccdsa";
        System.out.print(getCompressedString(str));
    }
}
