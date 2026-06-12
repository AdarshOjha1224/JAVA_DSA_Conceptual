package Binary_Tree;

class Node{
    int data;
    Node left;
    Node right;

    public Node(int data){
        this.data = data;
    }
}


public class BinaryTree {

    Node root;

    public void insert(int data) {
        root = insertRec(root,data);
    }
    public Node insertRec(Node root, int data) {
        if(root==null) root = new Node(data);
        else if(data < root.data) root.left = insertRec(root.left,data);
        else root.right = insertRec(root.right,data);

        return root;
    }

    public void inOrder(){
        inOrderRec(root);
        System.out.println();
    }
    public void inOrderRec(Node root){
        if(root != null){
            inOrderRec(root.left);
            System.out.print(root.data + " ");
            inOrderRec(root.right);
        }
    }

    public void preOrder(){
        preOrderRec(root);
        System.out.println();
    }
    public void preOrderRec(Node root){
        if(root != null){
            System.out.print(root.data + " ");
            preOrderRec(root.left);
            preOrderRec(root.right);
        }
    }

    public void postOrder(){
        postOrderRec(root);
        System.out.println();
    }
    public void postOrderRec(Node root){
        if(root != null){
            postOrderRec(root.left);
            postOrderRec(root.right);
            System.out.print(root.data + " ");
        }
    }
}
