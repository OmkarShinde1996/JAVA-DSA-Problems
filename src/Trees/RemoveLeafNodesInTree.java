package Trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//Remove all leaf nodes from a given generic Tree. Leaf nodes are those nodes, which don't have any children.
//Note : Root will also be a leaf node if it doesn't have any child. You don't need to print the tree,
// just remove all leaf nodes and return the updated root.
public class RemoveLeafNodesInTree {
    public static void printTreeLevelWise(TreeNode<Integer> root){
        Queue<TreeNode<Integer>> pendingNodes = new LinkedList<>();
        pendingNodes.add(root);
        while(!pendingNodes.isEmpty()){
            int n = pendingNodes.size();
            while(n>0){
                TreeNode<Integer> frontNode = pendingNodes.peek();
                pendingNodes.poll();
                System.out.print(frontNode.data + " ");
                for(int i = 0;i < frontNode.children.size();i++){
                    pendingNodes.add(frontNode.children.get(i));
                }
                n--;
            }
            System.out.println();
        }
    }
    public static TreeNode<Integer> takeInputLevelWise(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter root data");
        int rootData = s.nextInt();
        Queue<TreeNode<Integer>> pendingNodes = new LinkedList<>();
        TreeNode<Integer> root = new TreeNode<>(rootData);
        pendingNodes.add(root);
        while(!pendingNodes.isEmpty()){
            TreeNode<Integer> frontNode = pendingNodes.poll();
            System.out.println("Enter number of children of " + frontNode.data);
            int numChildren = s.nextInt();
            for(int i = 0; i<numChildren; i++){
                System.out.println("Enter "+ i + "th child of " + frontNode.data);
                int child = s.nextInt();
                TreeNode<Integer> childNode = new TreeNode<>(child);
                frontNode.children.add(childNode);
                pendingNodes.add(childNode);
            }
        }
        return root;
    }

    public static TreeNode<Integer> removeLeafNodes(TreeNode<Integer> root) {
        if(root==null){ return null;}// if root is null return null
        if(root.children.size()==0){// if root itself is leaf return null
            return null;}
        // if root.children is a leaf node
        // then delete it from children vector
        for (int i = 0; i < root.children.size(); i++) {
            TreeNode child= root.children.get(i);
            // if it is  a leaf
            if (child.children.size() == 0) {
                // shifting the vector to left
                // after the point i
                for (int j = i; j < root.children.size() - 1; j++)
                    root.children.set(j, root.children.get(j + 1));
                // delete the last element
                root.children.remove(root.children.size()-1);
                i--;
            }
        }
        // Remove all leaf node
        // of children of root
        for (int i = 0;i < root.children.size();i++) {
            // call function for root.children
            root.children.set(i,removeLeafNodes(root.children.get(i)));
        }
        return root;
    }

    public static void main(String[] args) {
        TreeNode<Integer> root = takeInputLevelWise();
        TreeNode<Integer> newRoot = removeLeafNodes(root);
        printTreeLevelWise(newRoot);
    }
}
