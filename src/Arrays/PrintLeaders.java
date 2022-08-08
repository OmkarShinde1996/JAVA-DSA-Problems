package Arrays;
//An element is leader if it is greater than all the elements to its right side. And the rightmost
// element is always a leader. For example in the array {16, 17, 4, 3, 5, 2}, leaders are 17, 5 and 2.
public class PrintLeaders {
    public static void leaders(int[] input) {
        int size=input.length;
        for (int i = 0; i < size; i++)
        {
            int j;
            for (j = i + 1; j < size; j++)
            {
                if (input[i] <=input[j])
                    break;
            }
            if (j == size) // the loop didn't break
                System.out.print(input[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[]={13,17,5,4,6};
        leaders(arr);
    }
}
