package Trees.BST;

import Trees.BinaryTree.BinaryTreeNode;

public class BinarySearchTree {
    private static BinaryTreeNode<Integer> root;

    //Time Complexity = O(n)
    public void insert(int data) {
        root=insertHelper(root,data);
    }
    private static BinaryTreeNode<Integer> insertHelper(BinaryTreeNode<Integer> root,int data){
        if(root==null){
            BinaryTreeNode<Integer> node= new BinaryTreeNode<>(data);
            return node;
        }
        if(data>root.data){
            root.right=insertHelper(root.right,data);
        }else if(data<=root.data){
            root.left=insertHelper(root.left,data);
        }
        return root;
    }

    //Time Complexity = O(n)
    public void remove(int data) {
        root= deleteHelper(root,data);
    }
    private static BinaryTreeNode<Integer> deleteHelper(BinaryTreeNode<Integer> root,int data){
        if(root==null)
            return null;
        if(data < root.data){
            root.left = deleteHelper(root.left, data);
            return root;
        }else if(data > root.data){
            root.right = deleteHelper(root.right, data);
            return root;
        }else {
            if(root.left==null && root.right==null){
                return null;
            }else if(root.left!=null && root.right==null){
                return root.left;
            }else if(root.left==null && root.right!=null){
                return root.right;
            }else{
                BinaryTreeNode<Integer> minNode = root.right;
                while(minNode.left != null){
                    minNode = minNode.left;
                }
                root.data = minNode.data;
                root.right = deleteHelper(root.right,minNode.data);
                return root;
            }
        }

    }

    public void printTree() {
        printHelper(root);
        return;
    }
    private static void printHelper(BinaryTreeNode<Integer> root){
        if(root == null){
            return;
        }
        String toBePrinted = root.data+ ":";
        if(root.left!=null){
            toBePrinted += "L:" + root.left.data + ",";
        }
        if(root.right!=null){
            toBePrinted += "R:" + root.right.data;
        }
        System.out.println(toBePrinted);
        printHelper(root.left);
        printHelper(root.right);
    }

    //Time Complexity = O(n)
    public boolean search(int data) {
        return hasDataHelper(data, root);
    }
    private static boolean hasDataHelper(int data, BinaryTreeNode<Integer> root){
        if(root == null){return false;}
        if(root.data == data){
            return true;
        }else if(data > root.data) {
            return hasDataHelper(data, root.right);
        }else{
            return hasDataHelper(data, root.left);
        }
    }
}
