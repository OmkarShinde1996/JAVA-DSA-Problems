package Trees.BinaryTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CountNodesGreaterThanX {
    public static BinaryTreeNode<Integer> takeInputLevelWise(){
        Scanner s = new Scanner(System.in);
        Queue<BinaryTreeNode<Integer>> pendingNodes = new LinkedList<>();
        System.out.println("Enter root data");
        int rootData = s.nextInt();
        if(rootData == -1){
            return null;
        }
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);
        pendingNodes.add(root);
        while(!pendingNodes.isEmpty()){
            BinaryTreeNode<Integer> front = pendingNodes.remove();
            System.out.println("Enter left child of "+front.data);
            int leftChild = s.nextInt();
            if(leftChild != -1){
                BinaryTreeNode<Integer> child = new BinaryTreeNode<>(leftChild);
                pendingNodes.add(child);
                front.left = child;
            }
            System.out.println("Enter right child of "+front.data);
            int rightChild = s.nextInt();
            if(rightChild != -1){
                BinaryTreeNode<Integer> child = new BinaryTreeNode<>(rightChild);
                pendingNodes.add(child);
                front.right = child;
            }
        }
        return root;
    }


    public static int countNodesGreaterThanX(BinaryTreeNode<Integer> root, int x) {
        if(root == null){
            return 0;
        }
        int count =0;
        int leftCount = countNodesGreaterThanX(root.left, x);
        int rightCount = countNodesGreaterThanX(root.right, x);
        if(root.data > x){
           return count = leftCount + rightCount +1;
        }else {
            return count = leftCount + rightCount;
        }
    }

    public static int largestNodeData(BinaryTreeNode<Integer> root){
        if(root == null){
            return -1;
        }
        int largestLeft = largestNodeData(root.left);
        int largestRight = largestNodeData(root.right);
        return Math.max(root.data, Math.max(largestLeft,largestRight));
    }

    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = takeInputLevelWise();
        System.out.println(countNodesGreaterThanX(root,2));
    }
}
