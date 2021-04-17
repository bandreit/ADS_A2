import com.sun.source.tree.BinaryTree;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BinaryTreeADTTest {

    private BinaryTreeADT binaryTree;
    private BinaryTreeNode root;
    private BinaryTreeNode child1;
    private BinaryTreeNode child2;
    private BinaryTreeNode child3;

    @BeforeEach
    void setUp() {
        binaryTree = new BinaryTreeADT();
    }

    @Test
    void getRoot() {
        BinaryTreeNode newBinTreeNode = new BinaryTreeNode(10);
        BinaryTreeADT binaryTreeWithRootInConstructor = new BinaryTreeADT(newBinTreeNode);
        assertEquals(binaryTreeWithRootInConstructor.getRoot().getElement(), newBinTreeNode.getElement());
    }

    @Test
    void setRoot() {
        BinaryTreeNode newBinTreeNode = new BinaryTreeNode(10);
        binaryTree.setRoot(newBinTreeNode);
        assertEquals(binaryTree.getRoot().getElement(), newBinTreeNode.getElement());
    }

    @Test
    void isEmptyNoElements() {
        assertTrue(binaryTree.isEmpty());
    }

    @Test
    void isEmptyWithElements() {
        initializeTestTree();
        assertFalse(binaryTree.isEmpty());
    }

    @Test
    void sizeZero() {
        assertEquals(0, binaryTree.size());
    }

    @Test
    void sizeOne() {
        BinaryTreeNode root = new BinaryTreeNode(0);
        root.addRightChild(child1);
        assertEquals(1, binaryTree.size());
    }

    @Test
    void sizeMany() {
        initializeTestTree();
        assertEquals(4, binaryTree.size());
    }

    @Test
    void doesNotContainElement()
    {
        assertFalse(binaryTree.contains(69));
    }

    @Test
    void doesContainElement()
    {
        initializeTestTree();
        assertFalse(binaryTree.contains(1));
    }

    @Test
    void heightNoNodes()
    {
        assertEquals(0, binaryTree.height());
    }

    @Test
    void heightOneLevel()
    {
        BinaryTreeNode root = new BinaryTreeNode(0);
        BinaryTreeNode child1 = new BinaryTreeNode(1);
        root.addRightChild(child1);
        assertEquals(1, binaryTree.height());
    }

    @Test
    void heightManyLevel()
    {
        initializeTestTree();
        BinaryTreeNode newChild1 = new BinaryTreeNode(4);
        BinaryTreeNode newChild2 = new BinaryTreeNode(5);
        BinaryTreeNode newChild3 = new BinaryTreeNode(6);
        newChild1.addLeftChild(newChild2);
        newChild2.addRightChild(newChild3);
        root.addLeftChild(newChild1);
        assertEquals(3, binaryTree.height());
    }

    void initializeTestTree() {
        BinaryTreeNode root = new BinaryTreeNode(0);
        BinaryTreeNode child1 = new BinaryTreeNode(1);
        BinaryTreeNode child2 = new BinaryTreeNode(2);
        BinaryTreeNode child3 = new BinaryTreeNode(3);
        binaryTree.setRoot(root);
        root.addRightChild(child1);
        child1.addRightChild(child2);
        child1.addLeftChild(child3);
    }
}
