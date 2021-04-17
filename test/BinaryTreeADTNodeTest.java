import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeADTNodeTest {

    private BinaryTreeNode treeNode;
    private int value;

    @BeforeEach
    void setUp(int nodeValue) {
        System.out.println("Test starts");
        treeNode = new BinaryTreeNode(nodeValue);
    }

    @AfterEach
    void tearDown() {
        System.out.println("Test ended");
    }

    @Test
    void getElement() {
        assertTrue(treeNode.getElement());
    }

    @Test
    void setElement() {
    }

    @Test
    void addLeftChild() {
    }

    @Test
    void addRightChild() {
    }

    @Test
    void getLeftChild() {
    }

    @Test
    void getRightChild() {
    }
}