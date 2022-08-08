package Collection;

import java.util.ArrayList;
import java.util.Arrays;

public class AddingElementInArray {
    public static void main(String[] args) {
        int i=10;
        int j;
        Integer arr[]={1,2,3,4,5,6,7,8,9,10};
        // print the original array
        System.out.println("Initial array is : "+ Arrays.toString(arr));
        // element to be added
        int x = 11;
        // call the method to add x in arr
        arr=add(i,arr,x);
        // print the updated array
        System.out.println("After adding element using ArrayList in Array is : "+Arrays.toString(arr));
        arr=addx(i,arr,x);

        System.out.println("After adding element using array in Array is : "+Arrays.toString(arr));
    }
    // Function to add x in arr
    public static Integer[] add(int i, Integer arr[], int x){
        // create a new ArrayList
        ArrayList<Integer> addx = new ArrayList<Integer>(Arrays.asList(arr));
        // Add the new element
        addx.add(x);
        // Convert the Arraylist back to array
        arr = addx.toArray(arr);
        // return the array
        return arr;
    }
    public static Integer[] addx(int i, Integer arr[], int x){
        Integer j;
        Integer arr1[] = new Integer[i+1];
        for(j=0; j< i; j++){
            arr1[j] = arr[j];
            arr1[i] = x;
        }
        return arr1;
    }
}
