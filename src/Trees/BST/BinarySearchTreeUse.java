package Trees.BST;

public class BinarySearchTreeUse {
    public static void main(String[] args) {
        BinarySearchTree t = new BinarySearchTree();
        t.insert(4);
        t.insert(4);
        t.insert(4);
        t.insert(4);
        t.printTree();
        System.out.println(t.search(4));
        t.remove(4);
        t.printTree();
    }
}
