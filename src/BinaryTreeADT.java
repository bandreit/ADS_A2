import java.util.ArrayList;

public class BinaryTreeADT {

    private BinaryTreeNode root;

    public BinaryTreeADT(BinaryTreeNode root) {
        this.root = root;
    }

    public BinaryTreeADT() {
        this.root = null;
    }

    public BinaryTreeNode getRoot() {
        return null;
    }

    public void setRoot(BinaryTreeNode root) {
        this.root = root;
    }

    public boolean isEmpty() {
        return true;
    }

    public int size() {
        return 0;
    }

    public boolean contains(int element) {
        return false;
    }

    public ArrayList<Integer> inOrder() {
        return null;
    }

    public ArrayList<Integer> preOrder() {
        return null;
    }

    public ArrayList<Integer> postOrder() {
        return null;
    }

    public ArrayList<Integer> levelOrder() {
        return null;
    }

    public int height() {
        return 0;
    }
}