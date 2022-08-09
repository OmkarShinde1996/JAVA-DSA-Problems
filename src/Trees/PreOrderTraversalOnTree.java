package Trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class PreOrderTraversalOnTree {


    public static void preOrderPrint(TreeNode<Integer> root){
        if(root==null){return;}
        System.out.print(root.data+" ");
        for(int i=0; i<root.children.size();i++){
            preOrderPrint(root.children.get(i));
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
    public static void main(String[] args) {
        TreeNode<Integer> root = takeInputLevelWise();
        preOrderPrint(root);
    }
}
