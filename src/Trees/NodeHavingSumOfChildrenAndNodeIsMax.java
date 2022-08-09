package Trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class NodeHavingSumOfChildrenAndNodeIsMax {
    public static int maxSum;
    public static TreeNode<Integer> resNode;
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
    public static TreeNode<Integer> maxSumNode(TreeNode<Integer> root){
        maxSum=0;
        helper(root);
        return resNode;
    }
    public static void helper(TreeNode<Integer> root){
        if(root==null){
            return;
        }
        int currSum = root.data;
        int count = root.children.size();
        for (int i = 0; i < count; i++){
            currSum += root.children.get(i).data;
            helper(root.children.get(i));
        }
        if (currSum > maxSum){
            resNode = root;
            maxSum = currSum;
        }
        return;
    }

    public static void main(String[] args) {
        TreeNode<Integer> root = takeInputLevelWise();
        System.out.println(maxSumNode(root).data);
    }
}
