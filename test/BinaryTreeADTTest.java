import com.sun.source.tree.BinaryTree;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class BinaryTreeADTTest {

    private BinaryTreeADT binaryTree;
    private BinaryTreeNode root;

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
        binaryTree.setRoot(root);
        assertEquals(1, binaryTree.size());
    }

    @Test
    void sizeMany() {
        initializeTestTree();
        assertEquals(4, binaryTree.size());
    }

    @Test
    void doesNotContainElement() {
        assertFalse(binaryTree.contains(69));
    }

    @Test
    void doesContainElement() {
        initializeTestTree();
        assertTrue(binaryTree.contains(1));
    }

    @Test
    void heightNoNodes() {
        assertEquals(-1, binaryTree.height());
    }

    @Test
    void heightOneLevel() {
        BinaryTreeNode root = new BinaryTreeNode(0);
        BinaryTreeNode child1 = new BinaryTreeNode(1);
        root.addRightChild(child1);
        binaryTree.setRoot(root);
        assertEquals(1, binaryTree.height());
    }

    @Test
    void heightManyLevel() {
        initializeTestTree();
        BinaryTreeNode newChild1 = new BinaryTreeNode(4);
        BinaryTreeNode newChild2 = new BinaryTreeNode(5);
        BinaryTreeNode newChild3 = new BinaryTreeNode(6);
        newChild1.addLeftChild(newChild2);
        newChild2.addRightChild(newChild3);
        root.addLeftChild(newChild1);
        binaryTree.setRoot(root);
        assertEquals(3, binaryTree.height());
    }

    @Test
    void inorder() {
        initializeTestBinarySearchTree();
        ArrayList<Integer> inordered = new ArrayList<>(Arrays.asList(4, 5, 7, 9, 13, 14, 15, 17, 18, 20, 21, 22, 23));
        ArrayList<Integer> actualInorder = binaryTree.inOrder();
        assertEquals(inordered, actualInorder);
    }

    @Test
    void preorder() {
        initializeTestBinarySearchTree();
        ArrayList<Integer> preordered = new ArrayList<>(Arrays.asList(13, 5, 4, 7, 9, 20, 15, 14, 17, 18, 22, 21, 23));
        ArrayList<Integer> actualPreorder = binaryTree.preOrder();
        assertEquals(preordered, actualPreorder);
    }

    @Test
    void postorder() {
        initializeTestBinarySearchTree();
        ArrayList<Integer> postordered = new ArrayList<>(Arrays.asList(4, 9, 7, 5, 14, 18, 17, 15, 21, 23, 22, 20, 13));
        ArrayList<Integer> actualPostorder = binaryTree.postOrder();
        assertEquals(postordered, actualPostorder);
    }

    @Test
    void levelorder() {
        initializeTestBinarySearchTree();
        ArrayList<Integer> levelordered = new ArrayList<>(Arrays.asList(13, 5, 20, 4, 7, 15, 22, 9, 14, 17, 21, 23, 18));
        ArrayList<Integer> actualLevelordered = binaryTree.levelOrder();
        assertEquals(levelordered, actualLevelordered);
    }

    void initializeTestTree() {
        root = new BinaryTreeNode(0);
        BinaryTreeNode child1 = new BinaryTreeNode(1);
        BinaryTreeNode child2 = new BinaryTreeNode(2);
        BinaryTreeNode child3 = new BinaryTreeNode(3);
        binaryTree.setRoot(root);
        root.addRightChild(child1);
        child1.addRightChild(child2);
        child1.addLeftChild(child3);
    }

    void initializeTestBinarySearchTree() {
        BinaryTreeNode binaryTreeNodeForBST13 = new BinaryTreeNode(13);
        BinaryTreeNode binaryTreeNodeForBST5 = new BinaryTreeNode(5);
        BinaryTreeNode binaryTreeNodeForBST7 = new BinaryTreeNode(7);
        BinaryTreeNode binaryTreeNodeForBST4 = new BinaryTreeNode(4);
        BinaryTreeNode binaryTreeNodeForBST9 = new BinaryTreeNode(9);
        BinaryTreeNode binaryTreeNodeForBST20 = new BinaryTreeNode(20);
        BinaryTreeNode binaryTreeNodeForBST15 = new BinaryTreeNode(15);
        BinaryTreeNode binaryTreeNodeForBST14 = new BinaryTreeNode(14);
        BinaryTreeNode binaryTreeNodeForBST17 = new BinaryTreeNode(17);
        BinaryTreeNode binaryTreeNodeForBST18 = new BinaryTreeNode(18);
        BinaryTreeNode binaryTreeNodeForBST21 = new BinaryTreeNode(21);
        BinaryTreeNode binaryTreeNodeForBST22 = new BinaryTreeNode(22);
        BinaryTreeNode binaryTreeNodeForBST23 = new BinaryTreeNode(23);

        // root
        binaryTree.setRoot(binaryTreeNodeForBST13);

        // left part
        binaryTreeNodeForBST13.addLeftChild(binaryTreeNodeForBST5);
        binaryTreeNodeForBST5.addLeftChild(binaryTreeNodeForBST4);
        binaryTreeNodeForBST5.addRightChild(binaryTreeNodeForBST7);
        binaryTreeNodeForBST7.addRightChild(binaryTreeNodeForBST9);

        // right part
        binaryTreeNodeForBST13.addRightChild(binaryTreeNodeForBST20);
        binaryTreeNodeForBST20.addRightChild(binaryTreeNodeForBST22);
        binaryTreeNodeForBST22.addRightChild(binaryTreeNodeForBST23);
        binaryTreeNodeForBST22.addLeftChild(binaryTreeNodeForBST21);
        binaryTreeNodeForBST20.addLeftChild(binaryTreeNodeForBST15);
        binaryTreeNodeForBST15.addLeftChild(binaryTreeNodeForBST14);
        binaryTreeNodeForBST15.addRightChild(binaryTreeNodeForBST17);
        binaryTreeNodeForBST17.addRightChild(binaryTreeNodeForBST18);
    }
}
