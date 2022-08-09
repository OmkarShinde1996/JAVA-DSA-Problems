package Trees;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//Given a generic tree and an integer x, check if x is present in the given tree or not.
// Return true if x is present, return false otherwise.
public class TreeContainsX {
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

    public static boolean checkIfContainsX(TreeNode<Integer> root, int x){
        if(root==null){
            return false;
        }
        if(root.data==x){
            return true;
        }
        for(TreeNode<Integer> child : root.children){
            boolean findInChild = checkIfContainsX(child, x);
            if(findInChild){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        TreeNode<Integer> root = takeInputLevelWise();
        System.out.println(checkIfContainsX(root,40));
        printTreeLevelWise(root);
    }
}
