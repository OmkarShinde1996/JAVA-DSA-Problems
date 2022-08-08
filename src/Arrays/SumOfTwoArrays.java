package Arrays;

public class SumOfTwoArrays {
    public static void sumOfTwoArrays(int arr1[], int arr2[], int output[]){
        int carry=0;
        int num;
        int k;
        int i = arr1.length-1;
        int j = arr2.length-1;
        int l = output.length-1;
        while(i>=0 && j>=0){
            num = arr1[i]+arr2[j]+carry;
            carry=num/10;
            k=num%10;
            output[l]=k;
            i--;
            j--;
            l--;
        }
        while(i>=0){
            num = arr1[i]+carry;
            k = num % 10;
            carry = num/10;
            output[l] = k;
            l--;
            i--;
        }
        while(j>=0){
            num = arr2[j]+carry;
            k = num % 10;
            carry = num/10;
            output[l] = k;
            l--;
            j--;
        }
        if(carry!=0){
            output[l] = carry;
        }

    }
    //{0,0,8,0}
    public static void main(String[] args) {
        int arr1[] = {9,7,6,1};
        int arr2[] = {4,5,9};
        int max;
        if(arr1.length> arr2.length){
            max=arr1.length;
        }else if (arr1.length< arr2.length){
            max=arr2.length;
        }else{
            max=arr1.length;
        }

        int output[] = new int[max+1];
        sumOfTwoArrays(arr1,arr2,output);
        for(int i = 0; i<output.length;i++){
            System.out.print(output[i]+" ");
        }

    }
}
