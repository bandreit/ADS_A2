import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeADTNodeTest {

    private BinaryTreeNode treeNode;

    @BeforeEach
    void setUp() {
        System.out.println("Test starts");
        treeNode = new BinaryTreeNode(10);
    }

    @AfterEach
    void tearDown() {
        System.out.println("Test ended");
    }

    @Test
    void getElement() {
        assertEquals(treeNode.getElement(),10);
    }

    @Test
    void setElement() {
        treeNode.setElement(15);
        assertEquals(15,treeNode.getElement());
    }

    @Test
    void addLeftChild() {
        BinaryTreeNode child5 = new BinaryTreeNode(5);
        treeNode.addLeftChild(child5);
        assertEquals(5,treeNode.getLeftChild().getElement());
    }

    @Test
    void addRightChild() {
        BinaryTreeNode child3 = new BinaryTreeNode(3);
        treeNode.addRightChild(child3);
        assertEquals(3,treeNode.getRightChild().getElement());
    }

    @Test
    void getLeftChild() {
        BinaryTreeNode child5 = new BinaryTreeNode(5);
        treeNode.addLeftChild(child5);
        assertEquals(5,treeNode.getLeftChild().getElement());
    }

    @Test
    void getRightChild() {
        BinaryTreeNode child3 = new BinaryTreeNode(3);
        treeNode.addRightChild(child3);
        assertEquals(3,treeNode.getRightChild().getElement());
    }
}