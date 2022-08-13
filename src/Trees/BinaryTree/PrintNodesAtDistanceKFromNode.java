package Trees.BinaryTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class PrintNodesAtDistanceKFromNode {

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
    public static void nodesAtDistanceK(BinaryTreeNode<Integer> root, int node, int k) {
        int x = helper(root, node, k);
    }

    public static int helper(BinaryTreeNode<Integer> root, int node, int k){
        if(root == null){
            return -1;
        }
        if(root.data == node){
            printAtDepthK(root,k);
            return 0;
        }
        int ld = helper(root.left, node, k);
        int rd;
        if(ld == -1){
            rd = helper(root.right, node,k);
            if(rd == -1){
                return -1;
            }else if(rd + 1 == k){
                System.out.println(root.data+" ");
                return k;
            }else{
                printAtDepthK(root.left,k-rd-2);
                return rd+1;
            }
        }else if(ld + 1 == k){
            System.out.println(root.data+" ");
            return k;
        }else{
            printAtDepthK(root.right,k-ld-2);
            return ld+1;
        }
    }
    public static void printAtDepthK(BinaryTreeNode<Integer> root,int depth){
        if(root == null){
            return;
        }
        if(depth == 0 && root != null){
            System.out.println(root.data+" ");
            return;
        }
        printAtDepthK(root.left,depth-1);
        printAtDepthK(root.right,depth-1);
    }

    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = takeInputLevelWise();
        nodesAtDistanceK(root,3,3);
    }
}
