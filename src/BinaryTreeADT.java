import java.util.ArrayList;

public class BinaryTreeADT {

    BinaryTreeNode root;

    public BinaryTreeNode getRoot(){
        return root;
    }

    public void setRoot(BinaryTreeNode root){
        this.root = root;
    }

    public boolean isEmpty(){
        if (getRoot() == null)
        return true;
        else return false;
    }

    public int size() {
        return  size(root);
    }

    public int size(BinaryTreeNode node) {
        if (node == null)
            return 0;
        else
            return (size(node.getLeftChild()) + 1 + size(node.getRightChild()));
    }

    public boolean contains(int element)
    {
        if (getRoot() == null)
            return false;
        if (getRoot().getElement() == element || getRoot().getRightChild().getElement() == element || getRoot().getLeftChild().getElement() == element)
            return true;
        else {
            while (getRoot().getElement() != element) {
                if (getRoot().getElement() < element && getRoot().getRightChild() != null) {

                }
            }
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

    public int height(){
        return 0;
    }
}
