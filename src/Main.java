public class Main {
    public static void main(String[] args) {
        BinaryTreeNode root = new BinaryTreeNode(1);
        BinaryTreeNode child3 = new BinaryTreeNode(3);
        BinaryTreeNode child5 = new BinaryTreeNode(5);
        BinaryTreeNode child8 = new BinaryTreeNode(8);
        BinaryTreeNode child9 = new BinaryTreeNode(9);
        BinaryTreeNode child7 = new BinaryTreeNode(7);
        BinaryTreeNode child15 = new BinaryTreeNode(15);
        BinaryTreeNode child32 = new BinaryTreeNode(32);

        root.setLeftChild(child3);
        root.setRightChild(child5);
        child5.setRightChild(child7);
        child3.setLeftChild(child8);
        child3.setRightChild(child9);
        child9.setRightChild(child32);
        child8.setLeftChild(child15);

        BinaryTreePrint binaryTreePrint = new BinaryTreePrint();
        binaryTreePrint.printTree(root);
    }
}
