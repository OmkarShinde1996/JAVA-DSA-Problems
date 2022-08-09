package Trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class SecondLargestElementInTree {
    public static TreeNode<Integer> largest;
    public static TreeNode<Integer> secondLargest;
    public static TreeNode<Integer> findSecondLargest(TreeNode<Integer> root){
        // Initialising the pointers to a node with value negative infinity
        largest = new TreeNode<>(Integer.MIN_VALUE);
        secondLargest = largest;

        helper(root);
        return secondLargest;
    }

    public static void helper(TreeNode<Integer> root){
        // Base Case
        if (root == null) {
            return;
        }
        // Check if root's data is larger than current largest node's data
        if (root.data > largest.data) {
            secondLargest = largest;
            largest = root;
        } else if (root.data > secondLargest.data && root.data != largest.data)
            secondLargest = root;
        // recursively find second largest in children
        for (TreeNode<Integer> child: root.children)
            helper(child);
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
        System.out.println(findSecondLargest(root).data);
    }
}
