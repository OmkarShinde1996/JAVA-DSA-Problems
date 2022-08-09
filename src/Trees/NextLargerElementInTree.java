package Trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
//Given a generic tree and an integer n. Find and return the node with next larger element in
// the Tree i.e. find a node with value just greater than n.
//18
//10 3 20 30 40 2 40 50 0 0 0 0

//20
public class NextLargerElementInTree {
    static TreeNode<Integer> res;
    public static TreeNode<Integer> findNextLargerNode(TreeNode<Integer> root, int n){
        // resultant node
        res = null;
        // calling helper function
        helper(root, n);
        return res;
    }
    public static void helper(TreeNode<Integer> root, int n){
        if (root == null)
            return;
        // if root is less than res but
        // greater than x, update res
        if (root.data > n)
            if ((res == null || (res).data > root.data))
                res = root;

        // Number of children of root
        int numChildren = root.children.size();

        // Recur calling for every child
        for (int i = 0; i < numChildren; i++)
            helper(root.children.get(i), n);
        return;
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
        System.out.println(findNextLargerNode(root,80).data);
    }
}
