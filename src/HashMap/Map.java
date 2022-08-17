package HashMap;

import java.util.ArrayList;

public class Map<K,V> {
    ArrayList<MapNode<K,V>> bucket;
    int size;
    int numBuckets;

    public Map() {
        numBuckets = 5;
        bucket = new ArrayList<>();
        for(int i=0; i<numBuckets; i++){
            bucket.add(null);
        }
    }

    //Hashing function
    private int getBucketIndex(K key){
        int hashCode = key.hashCode();//hashCode() method is already defined in Object class
        return hashCode % numBuckets;
    }

    public double loadFactor(){
        return (1.0*size)/numBuckets;
    }
    //Rehashing function
    private void rehash(){
        System.out.println("Rehashing buckets : " + numBuckets + " size " + size);
        ArrayList<MapNode<K,V>> temp = bucket;
        bucket = new ArrayList<>();
        for(int i=0; i<2*numBuckets; i++){
            bucket.add(null);
        }
        size = 0;
        numBuckets *= 2;
        for(int i=0; i< temp.size(); i++){
            MapNode<K,V> head = temp.get(i);
            while(head != null){
                K key = head.key;
                V value = head.value;
                insert(key,value);
                head = head.next;
            }
        }
    }
    //Insertion
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
        size++;
        newNode.next = head;
        bucket.set(bucketIndex,newNode);
        double loadFactor = (1.0*size)/numBuckets;
        if(loadFactor > 0.7){
            rehash();
        }
    }
    //getValue
    public V getValue(K key){
        int bucketIndex = getBucketIndex(key);
        MapNode<K,V> head = bucket.get(bucketIndex);
        while(head != null){
            if(head.key.equals(key)){
                return head.value;
            }
            head = head.next;
        }
        return null;
    }
    //Delete
    public V removeKey(K key){
        int bucketIndex = getBucketIndex(key);
        MapNode<K,V> head = bucket.get(bucketIndex);
        MapNode<K,V> previousNode = null;
        while(head != null){
            if(head.key.equals(key)){
                size--;
                if(previousNode == null){
                    bucket.set(bucketIndex,head.next);
                }else {
                    previousNode.next = head.next;
                }
                return head.value;
            }
            previousNode = head;
            head = head.next;
        }
        return null;
    }
    //size
    public int size(){
        return size;
    }
}
