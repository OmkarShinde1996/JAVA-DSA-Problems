package Trees.BST;

import Trees.BinaryTree.BinaryTreeNode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//Given a binary search tree, you have to replace each node's data with the sum of all nodes which are
// greater or equal than it. You need to include the current node's data also.
//That is, if in given BST there is a node with data 5, you need to replace it with sum of its
// data (i.e. 5) and all nodes whose data is greater than or equal to 5.
public class ReplaceWithSumOfGreaterNodes {

    public static void printBinaryTreeLevelWise(BinaryTreeNode<Integer> root){
        Queue<BinaryTreeNode<Integer>> pendingNodes = new LinkedList<>();
        pendingNodes.add(root);
        while(!pendingNodes.isEmpty()){
            int n = pendingNodes.size();
            while(n>0) {
                BinaryTreeNode<Integer> front = pendingNodes.poll();
                System.out.print(front.data + " ");
                if (front.left != null) {
                    pendingNodes.add(front.left);
                }
                if(front.right != null){
                    pendingNodes.add(front.right);
                }
                n--;
            }
            System.out.println();
        }
    }
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

    public static void replaceWithLargerNodesSum(BinaryTreeNode<Integer> root) {
        if(root == null){
            return;
        }
        int ans = replace(root ,0);
    }
    public static int replace(BinaryTreeNode<Integer> root ,int sum){
        if(root == null){
            return 0;
        }
        int right = replace(root.right ,sum);
        int rootdata = root.data;
        root.data = root.data + right + sum;
        int left = replace(root.left ,root.data);
        return rootdata + right + left;
    }

    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = takeInputLevelWise();
        replaceWithLargerNodesSum(root);
        printBinaryTreeLevelWise(root);
    }
}
