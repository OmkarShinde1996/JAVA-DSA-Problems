package Trees.BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class ConstructTreeFromPreorderAndInorder {

    public static void printBinaryTreeLevelWise(BinaryTreeNode<Integer> root){
        Queue<BinaryTreeNode<Integer>> pendingNodes = new LinkedList<>();
        pendingNodes.add(root);
        while(!pendingNodes.isEmpty()){
            BinaryTreeNode<Integer> front = pendingNodes.poll();
            String toBePrinted = front.data+ ":";
            if(front.left != null){
                toBePrinted += "L" + front.left.data + ",";
                pendingNodes.add(front.left);
            }
            if(front.right !=null){
                toBePrinted += "R" + front.right.data;
                pendingNodes.add(front.right);
            }
            System.out.println(toBePrinted);
        }
    }
    public static BinaryTreeNode<Integer> buildTree(int[] preOrder, int[] inOrder) {
        BinaryTreeNode<Integer> root = helper(preOrder,inOrder,0, preOrder.length-1, 0, inOrder.length-1);
        return root;
    }

    public static BinaryTreeNode<Integer> helper(int[] preOrder, int[] inOrder, int prs, int pre, int ins, int ine) {
        if(ins > ine){
            return null;
        }
        int current = preOrder[prs];
        BinaryTreeNode<Integer> node = new BinaryTreeNode<>(current);
        int index = -1;
        for(int i = ins; i<=ine;i++){
            if(inOrder[i]==current){
                index = i;
                break;
            }
        }
        if(index == -1){
            return null;
        }
        int leftIns = ins;
        int leftIne = index-1;
        int leftPrs = prs+1;
        int leftPre = leftIne - leftIns + leftPrs;
        int rightIns = index+1;
        int rightIne = ine;
        int rightPrs = leftPre+1;
        int rightPre = pre;
        node.left = helper(preOrder,inOrder,leftPrs,leftPre,leftIns,leftIne);
        node.right = helper(preOrder,inOrder,rightPrs,rightPre,rightIns,rightIne);
        return node;
    }

    public static void main(String[] args) {
        int[] preOrder = {1,2,4,5,3,6,7};
        int[] inOrder = {4,2,5,1,6,3,7};
        BinaryTreeNode<Integer> root = buildTree(preOrder,inOrder);
        printBinaryTreeLevelWise(root);
    }
}
