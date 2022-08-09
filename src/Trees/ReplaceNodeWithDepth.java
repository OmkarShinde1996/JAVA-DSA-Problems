package Trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//In a given Generic Tree, replace each node with its depth value. You need to just update the
// data of each node, no need to return or print anything.
//10 3 20 30 40 2 40 50 0 0 0 0
//0
//1 1 1
//2 2
public class ReplaceNodeWithDepth {

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
    public static void replaceWithDepthValue(TreeNode<Integer> root){
        replaceWithDepthValue(root,0);
        return;
    }

    public static void replaceWithDepthValue(TreeNode<Integer> root,int depth){
        if(root==null){
            return;
        }
        root.data=depth;
        for(int i=0;i<root.children.size();i++){
            replaceWithDepthValue(root.children.get(i),depth+1);
        }
    }

    public static void main(String[] args) {
        TreeNode<Integer> root = takeInputLevelWise();
        replaceWithDepthValue(root);
        printTreeLevelWise(root);
    }
}
