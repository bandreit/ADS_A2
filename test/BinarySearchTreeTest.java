import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class BinarySearchTreeTest {

    private BinarySearchTree binaryTree;
    private BinaryTreeNode root;

    @BeforeEach
    void setUp() {
        binaryTree = new BinarySearchTree();
    }

    @Test
    void insertOne() {
        binaryTree.insert(0);
        assertEquals(1, binaryTree.size());
    }

    @Test
    void insertZero() {
        binaryTree.insert(0);
        binaryTree.insert(0);
        assertEquals(1, binaryTree.size());
    }

    @Test
    void insertMany() {
        binaryTree.insert(2);
        binaryTree.insert(1);
        binaryTree.insert(3);
        assertEquals(3, binaryTree.size());
    }
}
