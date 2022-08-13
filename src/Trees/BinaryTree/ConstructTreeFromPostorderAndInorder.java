package Trees.BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class ConstructTreeFromPostorderAndInorder {
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
    public static BinaryTreeNode<Integer> buildTree(int[] postOrder, int[] inOrder) {
        BinaryTreeNode<Integer> root = helper(postOrder,inOrder,0, postOrder.length-1, 0, inOrder.length-1);
        return root;
    }

    public static BinaryTreeNode<Integer> helper(int[] postOrder, int[] inOrder, int pos, int poe, int ins, int ine) {
        if(ins > ine){
            return null;
        }
        int current = postOrder[poe];
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
        int leftPos = pos;
        int leftPoe = pos + index - ins -1;
        int rightIns = index+1;
        int rightIne = ine;
        int rightPos = pos + index - ins;
        int rightPoe = poe-1;
        node.left = helper(postOrder,inOrder,leftPos,leftPoe,leftIns,leftIne);
        node.right = helper(postOrder,inOrder,rightPos,rightPoe,rightIns,rightIne);
        return node;
    }

    public static void main(String[] args) {
        int[] postOrder = {4,5,2,6,7,3,1};
        int[] inOrder = {4,2,5,1,6,3,7};
        BinaryTreeNode<Integer> root = buildTree(postOrder,inOrder);
        printBinaryTreeLevelWise(root);
    }
}
