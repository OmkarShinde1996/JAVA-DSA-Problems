package Trees.BinaryTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class MinimumAndMaximumInTheBinaryTree {
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

    public static PairOfMinMax<Integer, Integer> getMinAndMax(BinaryTreeNode<Integer> root) {
        PairOfMinMax<Integer, Integer> m = new PairOfMinMax<>(Integer.MAX_VALUE,Integer.MIN_VALUE);
        if(root == null){
            return m;
        }
        PairOfMinMax<Integer, Integer> leftAns = getMinAndMax(root.left);
        PairOfMinMax<Integer, Integer> rightAns = getMinAndMax(root.right);
        m.minimum = Math.min(root.data, Math.min(leftAns.minimum, rightAns.minimum));
        m.maximum = Math.max(root.data, Math.max(leftAns.maximum, rightAns.maximum));
        return m;
    }

    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = takeInputLevelWise();
        System.out.println("Minimum is : "+getMinAndMax(root).minimum);
        System.out.println("Maximum is : "+getMinAndMax(root).maximum);
    }
}
