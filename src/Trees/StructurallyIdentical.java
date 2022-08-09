package Trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class StructurallyIdentical {

    public static boolean checkIdentical(TreeNode<Integer> root1, TreeNode<Integer> root2){
        if(root1==null&&root2==null){
            return true;
        }
        if(root1.data!=root2.data){
            return false;
        }
        int childCount1 = root1.children.size();
        int childCount2 = root2.children.size();
        if(childCount1!=childCount2){
            return false;
        }
        for(int i=0;i<childCount1;i++){
            if(!checkIdentical(root1.children.get(i),root2.children.get(i))){
                return false;
            }
        }
        return true;
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
        TreeNode<Integer> root1 = takeInputLevelWise();
        TreeNode<Integer> root2 = takeInputLevelWise();
        System.out.println(checkIdentical(root1,root2));
    }
}
