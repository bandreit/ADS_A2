import java.util.ArrayList;

public class BinaryTreeADT {

    BinaryTreeNode root;

    public BinaryTreeADT(BinaryTreeNode root) {
        this.root = root;
    }

    public BinaryTreeADT() {
        this.root = null;
    }

    public BinaryTreeNode getRoot() {
        return root;
    }

    public void setRoot(BinaryTreeNode root) {
        this.root = root;
    }

    public boolean isEmpty() {
        if (getRoot() == null)
            return true;
        else return false;
    }

    public int size() {
        return size(root);
    }

    private int size(BinaryTreeNode node) {
        if (node == null)
            return 0;
        else
            return (size(node.getLeftChild()) + 1 + size(node.getRightChild()));
    }

    public boolean contains(int element) {
        BinaryTreeNode current = getRoot();

        if (current == null)
            return false;

        if (current.getElement() == element || current.getRightChild().getElement() == element || current.getLeftChild().getElement() == element)
            return true;

        else {

            while (current.getElement() != element) {

                if (current.getElement() < element && current.getRightChild() != null) {
                    current = current.getRightChild();
                    System.out.println(current.getElement());
                }

                if (current.getElement() > element && current.getLeftChild() != null) {
                    current = current.getLeftChild();
                    System.out.println(current.getElement());
                }


                if (current.getRightChild() != null && current.getRightChild().getElement() == element) {
                    return true;
                }
                if (current.getLeftChild() != null && current.getLeftChild().getElement() == element) {
                    return true;
                }

                if (current.getElement() != element && current.getRightChild() == null && current.getLeftChild() == null)
                    return false;

            }
            return true;
        }
    }


    public ArrayList<Integer> inOrder() {
        return inOrder(root);
    }

    private ArrayList<Integer> inOrder(BinaryTreeNode node){
        ArrayList<Integer> tree = new ArrayList<>();

        inOrderRecursive(node, tree);

        return tree;
    }

    private void inOrderRecursive(BinaryTreeNode node, ArrayList<Integer> tree) {
        if (node == null)
            return;

        inOrderRecursive(node.getLeftChild(), tree);
        tree.add(node.getElement());
        inOrderRecursive(node.getRightChild(), tree);
    }

    public ArrayList<Integer> preOrder() {
        ArrayList<Integer> tree = new ArrayList<>();
        preOrder(root, tree);

        return tree;
    }

    private void preOrder(BinaryTreeNode node,  ArrayList<Integer> tree ) {
        if (node == null)
            return;

        tree.add(node.getElement());
        preOrder(node.getLeftChild(), tree);
        preOrder(node.getRightChild(), tree);
    }

    public ArrayList<Integer> postOrder() {
        ArrayList<Integer> tree = new ArrayList<>();
        postOrder(root,tree);

        return tree;
    }

    private ArrayList<Integer> postOrder(BinaryTreeNode node,  ArrayList<Integer> tree) {


        if (node == null)
            return null;

        postOrder(node.getLeftChild(), tree);
        postOrder(node.getRightChild(), tree);
        tree.add(node.getElement());

        return tree;
    }

    public ArrayList<Integer> levelOrder() {
        return levelOrder(root);
    }

    private ArrayList<Integer> levelOrder(BinaryTreeNode node) {
        ArrayList<Integer> ordered = new ArrayList<>();
        int h = height() + 1;
        for (int i = 1; i <= h; i++)
           givenLevel(node, i, ordered);
        return ordered;
    }

    private ArrayList<Integer> givenLevel(BinaryTreeNode root, int level, ArrayList<Integer> ordered){


        if (root == null)
            return null;
        if (level == 1)
            ordered.add(root.getElement());
        else if (level > 1)
        {
            givenLevel(root.getLeftChild(), level-1, ordered);
            givenLevel(root.getRightChild(), level-1, ordered);
        }
        return ordered;
    }

    public int height() {
        return height(root);
    }

    private int height(BinaryTreeNode node){
        if (node == null)
            return -1;
        else
        {
            int lDepth = height(node.getLeftChild());
            int rDepth = height(node.getRightChild());
            if (lDepth > rDepth)
                return (lDepth + 1);
            else
                return (rDepth + 1);
        }
    }
}
