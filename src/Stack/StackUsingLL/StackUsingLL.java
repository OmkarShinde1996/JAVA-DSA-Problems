package Stack.StackUsingLL;

import Stack.StackUsingArray.StackEmptyException;

public class StackUsingLL<T> {
    private Node<T> head;
    private int size;

    StackUsingLL(){
        head = null;
        size = 0;
    }
    int size(){
        return size;
    } // O(1)

    T top() throws StackEmptyException {
        if(size()==0){
            throw new StackEmptyException();
        }
        return head.data;
    } // O(1)

    boolean isEmpty(){
        return size()==0;
    } // O(1)

    void push(T ele){
        Node<T> newNode = new Node<>(ele);
        newNode.next = head;
        head = newNode;
        size++;
    } // O(1)

    T pop() throws StackEmptyException {
        if(size()==0){
            throw new StackEmptyException();
        }
        T temp = head.data;
        head=head.next;
        size--;
        return temp;
    } // O(1)

}
