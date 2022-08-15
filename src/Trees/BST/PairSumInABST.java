package Trees.BST;


import Trees.BinaryTree.BinaryTreeNode;

import java.util.*;

//Given a binary search tree and an integer S, find pair of nodes in the BST which sum to S.
// You can use extra space of the order of O(log n).
public class PairSumInABST {
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

    //With less time complexity
//    public static void printNodesSumToS(BinaryTreeNode<Integer> root, int s) {
//        if(root == null){
//            return;
//        }
//        Queue<BinaryTreeNode<Integer>> pendingNodes = new LinkedList<>();
//        ArrayList<Integer> list = new ArrayList<>();
//        pendingNodes.add(root);
//        while (!pendingNodes.isEmpty()) {
//            BinaryTreeNode<Integer> frontNode = null;
//            int counter = pendingNodes.size();
//            for (int i = 0; i < counter; i++) {
//                frontNode = pendingNodes.remove();
//                list.add(frontNode.data);
//                if (frontNode.left != null) {
//                    pendingNodes.add(frontNode.left);
//                }
//                if (frontNode.right != null) {
//                    pendingNodes.add(frontNode.right);
//                }
//            }
//        }
//        for (int i = 0; i < list.size(); i++) {
//            for (int j = 0; j != i && j < list.size(); j++) {
//                if (list.get(i) + list.get(j) == s) {
//                    if (list.get(i) < list.get(j)) {
//                        System.out.println(list.get(i) + " " + list.get(j));
//                    } else {
//                        System.out.println(list.get(j) + " " + list.get(i));
//                    }
//                }
//            }
//        }
//    }

    //With Better time complexity
    public static void printNodesSumToS1(BinaryTreeNode<Integer> root, int s) {
        ArrayList<Integer> output = new ArrayList<>();
        convertBTtoArr(root, output);
        int i = 0, j = output.size()-1;
        while (i < j) {
            if (output.get(i) + output.get(j) == s) {
                System.out.println(output.get(i) + " " + output.get(j));
                i++;
                j--;
            } else if (output.get(i) + output.get(j) > s) {
                j--;
            } else {
                i++;
            }
        }
    }

    public static void convertBTtoArr(BinaryTreeNode<Integer> root , ArrayList<Integer> output){
        if(root==null)
            return;

        convertBTtoArr(root.left,output);
        output.add(root.data);
        convertBTtoArr(root.right,output);
    }

    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = takeInputLevelWise();
        //printNodesSumToS(root, 12);
        printNodesSumToS1(root, 12);
    }
}
