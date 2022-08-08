package Recursion;
//Print the steps to complete Tower of Hanoi
public class TowerOfHnoi {
    public static void towerOfHanoi(int disks, char source, char auxiliary, char destination) {
        if(disks==0){
            return;
        }
        //Sequence of method parameter is as per original method
        towerOfHanoi(disks-1,source,destination,auxiliary);
        System.out.println(source+" "+destination);
        //Sequence of method parameter is as per original method
        towerOfHanoi(disks-1,auxiliary,source,destination);

    }
    //a b
    //a c
    //b c
    public static void main(String[] args) {
        int n=2;
        towerOfHanoi(n,'a','b','c');
    }
}
