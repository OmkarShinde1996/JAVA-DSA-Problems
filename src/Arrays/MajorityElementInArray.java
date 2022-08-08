package Arrays;

public class MajorityElementInArray {
    static int majorityElement(int a[], int size)
    {
        int count=0,ele=0;
        for(int i=0;i<size;i++){
            if(count==0){
                ele=a[i];
            }
            if(ele==a[i]){
                count++;
            }else{
                count--;
            }
        }
        count=0;
        for(int i=0;i<size;i++){
            if(ele==a[i]){
                count++;
            }
        }
        if(count>size/2){
            return ele;
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[]={3,1,3,3,2} ;
        System.out.print(majorityElement(arr,5));
    }
}
