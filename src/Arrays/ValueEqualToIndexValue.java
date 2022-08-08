package Arrays;

import java.util.ArrayList;

public class ValueEqualToIndexValue {
    public static ArrayList<Integer> valueEqualToIndex(int arr[], int n) {
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=0;i< arr.length;i++){
            if(arr[i]==i+1){
                al.add(arr[i]);
            }
        }
        return al;
    }
    public static void main(String[] args) {
        int arr[]={2};
        int n=arr.length;
        ArrayList<Integer> al = valueEqualToIndex(arr,n);
        for(int i=0;i<al.size();i++){
            System.out.println(al.get(i));
        }
    }
}
