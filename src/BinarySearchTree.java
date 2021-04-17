public class BinarySearchTree extends BinaryTreeADT{

    private BinaryTreeNode root;

    public BinarySearchTree() {
    }

    public BinarySearchTree(BinaryTreeNode root) {
        this.root = root;
    }

    public void insert(int element) {

    }

    public void removeElement(int element) {
        root = deleteRec(root, element);
    }

    BinaryTreeNode deleteRec(BinaryTreeNode root, int element)
    {
        BinaryTreeNode rootLeftChild =  root.getLeftChild();
        BinaryTreeNode rootRightChild =  root.getRightChild();

        if (root == null)
            return null;

        if (element < root.getElement())
            rootLeftChild = deleteRec(root.getLeftChild(), element);
        else if (element > root.getElement())
            rootRightChild = deleteRec(root.getRightChild(), element);

        else {
            if (root.getLeftChild() == null)
                return root.getRightChild();
            else if (root.getRightChild() == null)
                return root.getLeftChild();

            root.setElement(findMin());

            rootRightChild = deleteRec(root.getRightChild(), root.getElement()  );
        }
        return root;
    }

    public int findMin() {
        if (root == null)
            return -1;

        while (root.getLeftChild() != null)
            root = root.getLeftChild();

        return root.getElement();
    }

    public int findMax() {
        if (root == null)
            return -1;

        while (root.getRightChild() != null)
            root = root.getRightChild();

        return root.getElement();
    }

    public void rebalance() {

    }
}
