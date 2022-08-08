package Stack;

import Stack.StackUsingArray.StackEmptyException;
import Stack.StackUsingLL.StackUsingLL;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueues {
    Queue<Integer> q1,q2;
    public StackUsingQueues() {
        q1=new LinkedList<>();
        q2=new LinkedList<>();
    }

    public void push(int x) {
        q1.add(x);
    }

    public int pop() {
        if(q1.size()==0)return -1;
        int count=1;
        int temp=q1.size();
        while(count<=temp-1)
        {
            q2.add(q1.poll());
            count++;
        }
        int num=q1.poll();
        while(!q2.isEmpty())
        {
            q1.add(q2.poll());
        }
        return num;
    }

    public int top() {
        if(q1.size()==0)return -1;
        int count=1;
        int temp=q1.size();
        while(count<=temp-1)
        {
            q2.add(q1.poll());
            count++;
        }
        int num=q1.poll();
        while(!q2.isEmpty())
        {
            q1.add(q2.poll());
        }
        q1.add(num);
        return num;
    }

    public boolean isEmpty() {
        return q1.size()==0;
    }

    public static void main(String[] args) {
        StackUsingQueues stack = new StackUsingQueues();
        for(int i =1; i<=5; i++){
            stack.push(i);
        }

        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
}
