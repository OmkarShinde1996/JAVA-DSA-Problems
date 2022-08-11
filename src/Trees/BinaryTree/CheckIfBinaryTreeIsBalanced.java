package Trees.BinaryTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CheckIfBinaryTreeIsBalanced {

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

    //Time Complexity = O(n^2)
    public static int height(BinaryTreeNode<Integer> root){
        if(root == null){
            return 0;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        return 1 + Math.max(leftHeight, rightHeight);
    }

    public static boolean isBalanced(BinaryTreeNode<Integer> root){
        if(root == null){
            return true;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        if(Math.abs(leftHeight - rightHeight) > 1){
            return false;
        }
        boolean isLeftBalanced = isBalanced(root.left);
        boolean isRightBalanced = isBalanced(root.right);
        return isLeftBalanced && isRightBalanced;
    }

    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = takeInputLevelWise();
        System.out.println(isBalanced(root));
    }
}
