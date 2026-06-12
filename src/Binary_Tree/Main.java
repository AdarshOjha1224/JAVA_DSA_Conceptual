package Binary_Tree;

public class Main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.insert(10);
        tree.insert(8);
        tree.insert(13);
        tree.insert(7);
        tree.insert(9);
        tree.insert(15);
        tree.insert(11);
        tree.insert(12);
        tree.insert(5);
        tree.insert(18);

        tree.inOrder(); // left,root,right
        tree.preOrder(); // root,left,right
        tree.postOrder(); // left,right,root
    }
}
