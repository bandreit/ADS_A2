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

    public int size(BinaryTreeNode node) {
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
        return height(root);
    }

    public int height(BinaryTreeNode node){
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
