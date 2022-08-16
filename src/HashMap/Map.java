package HashMap;

import java.util.ArrayList;

public class Map<K,V> {
    ArrayList<MapNode<K,V>> bucket;
    int size;
    int numBuckets;

    public Map() {
        numBuckets = 20;
        bucket = new ArrayList<>();
        for(int i=0; i<20; i++){
            bucket.add(null);
        }
    }

    //Hashing function
    private int getBucketIndex(K key){
        int hashCode = key.hashCode();//hashCode() method is already defined in Object class
        return hashCode % numBuckets;
    }

    public void insert(K key, V value){
        int bucketIndex = getBucketIndex(key);
        MapNode<K,V> head = bucket.get(bucketIndex);
        while(head != null){
            if(head.key.equals(key)){
                head.value = value;
                return;
            }
            head = head.next;
        }
        head = bucket.get(bucketIndex);
        MapNode<K,V> newNode = new MapNode<>(key,value);
        newNode.next = head;
        bucket.set(bucketIndex,newNode);
    }
}
