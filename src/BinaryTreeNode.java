public class BinaryTreeNode {

    private int value;
    private BinaryTreeNode leftChild;
    private BinaryTreeNode rightChild;

    public BinaryTreeNode(int nodeValue) {
        value = nodeValue;
        leftChild = null;
        rightChild = null;
    }

    public int getElement() {
        return value;
    }

    public void setElement(int value) {
        this.value = value;
    }

    public void addLeftChild(BinaryTreeNode leftChild) {
        this.leftChild = leftChild;
    }

    public void addRightChild(BinaryTreeNode rightChild) {
        this.rightChild = rightChild;
    }

    public BinaryTreeNode getLeftChild() {
        return leftChild;
    }

    public BinaryTreeNode getRightChild() {
        return rightChild;
    }
}
