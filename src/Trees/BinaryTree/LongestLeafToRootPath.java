package Trees.BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
//Given a binary tree, return the longest path from leaf to root. Longest means, a path which contain
// maximum number of nodes from leaf to root.
//Do it in O(n) time complexity
public class LongestLeafToRootPath {

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
    public static ArrayList<Integer> longestRootToLeafPath(BinaryTreeNode<Integer> root){
        if(root == null){
            ArrayList<Integer> output = new ArrayList<>();
            return output;
        }
        // Recursive call on root.right
        ArrayList<Integer> right = longestRootToLeafPath(root.right);
        // Recursive call on root.left
        ArrayList<Integer> left = longestRootToLeafPath(root.left);
        // Compare the size of the two ArrayList
        // and insert current node accordingly
        if(right.size() < left.size()){
            left.add(root.data);
        }else{
            right.add(root.data);
        }
        // Return the appropriate ArrayList
        return (left.size() >
                right.size() ? left :right);
    }

    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = takeInputLevelWise();
        ArrayList<Integer> list = longestRootToLeafPath(root);
        for(int i=0; i< list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
