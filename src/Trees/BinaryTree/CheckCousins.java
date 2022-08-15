package Trees.BinaryTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
//Given the binary Tree and two nodes say ‘p’ and ‘q’. Determine whether the two nodes are cousins
// of each other or not. Two nodes are said to be cousins of each other if they are at same level of the Binary Tree and have different parents.
//Do it in O(n).
public class CheckCousins {
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

    public static boolean isCousin(BinaryTreeNode<Integer> root, int p, int q) {
        int xDepth = getDepth(root, p);
        int yDepth = getDepth(root, q);
        return xDepth == yDepth && getParent(root,p,0) != getParent(root,q,0);
    }
    public static int getDepth(BinaryTreeNode<Integer> root, int target) {
        if(root == null) {
            return 0;
        }
        if(root.data == target) {
            return 1;
        } else {
            int left = getDepth(root.left, target);
            if(left != 0) {
                return left+1;
            }
            int right = getDepth(root.right, target);
            if(right != 0) {
                return right+1;
            }
        }
        return 0;
    }

    public static int getParent(BinaryTreeNode<Integer> root, int target, int parentVal) {
        if(root == null) {
            return 0;
        }
        if(root.data == target) {
            return parentVal;
        }
        int parent = getParent(root.left, target, root.data);
        int parent2 = getParent(root.right, target, root.data);
        return Math.max(parent, parent2);
    }

    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = takeInputLevelWise();
        System.out.println(isCousin(root,2, 4));
    }
}
