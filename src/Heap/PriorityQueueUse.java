package Heap;

public class PriorityQueueUse {
    public static void main(String[] args) throws PriorityQueueException {
        //Min Heap Priority queue
        Priority_Queue queue = new Priority_Queue();
        int[] arr = {5,1,9,2,0};
        for(int i=0; i<arr.length;i++){
            queue.insert(arr[i]);//for insertion time complexity will be O(n log n)
        }
        while(!queue.isEmpty()){
            System.out.print(queue.removeMin()+" ");//for deletion time complexity will be O(n log n)
        }
        System.out.println();

        //Max Heap Priority queue
        MaxPriorityQueue queue1 = new MaxPriorityQueue();
        int[] arr1 = {5,1,9,2,0};
        for(int i=0; i<arr1.length;i++){
            queue1.insert(arr1[i]);//for insertion time complexity will be O(n log n)
        }
        while(!queue1.isEmpty()){
            System.out.print(queue1.removeMax()+" ");//for deletion time complexity will be O(n log n)
        }
        System.out.println();
    }
}

//Overall time complexity for Heap sort will be O(n log n)
//Space complexity will be O(n)
