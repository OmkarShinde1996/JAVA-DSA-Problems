package Trees.BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
//For a given Binary Tree of type integer and a number K, print out all root-to-leaf paths where the
// sum of all the node data along the path is equal to K.
public class PathSumRootToLeaf {

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
    public static void rootToLeafPathsSumToK(BinaryTreeNode<Integer> root, int k) {
        ArrayList<Integer> path = new ArrayList<>();
        rootToLeafPathsSumToK(root, path, k);
    }

    public static void rootToLeafPathsSumToK(BinaryTreeNode<Integer> root,ArrayList<Integer> path, int k) {
        if(root == null){return;}
        k=k-root.data;
        path.add(root.data);
        if(root.left == null && root.right == null){
            if(k==0){
                for(int i=0;i< path.size();i++){
                    System.out.print(path.get(i)+" ");
                }
                System.out.println();
            }
            path.remove(path.size()-1);
            return;
        }
        rootToLeafPathsSumToK(root.left,path,k);
        rootToLeafPathsSumToK(root.right,path,k);
        path.remove(path.size()-1);
    }

    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = takeInputLevelWise();
        rootToLeafPathsSumToK(root, 13);
    }
}
