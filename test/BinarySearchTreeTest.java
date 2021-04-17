import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class BinarySearchTreeTest {

    private BinarySearchTree binaryTree;
//    private BinaryTreeNode root;

    @BeforeEach
    void setUp() {
        binaryTree = new BinarySearchTree();
    }

    @Test
    void insertOne() {
        binaryTree.insert(0);
        binaryTree.size();
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
        binaryTree.insert(5);
        binaryTree.insert(7);
        binaryTree.insert(8);
        binaryTree.insert(2);
        binaryTree.insert(1);
        binaryTree.insert(3);
        binaryTree.insert(10);
        assertEquals(7, binaryTree.size());
    }

    @Test
    void removeZero() {
        binaryTree.insert(2);
        binaryTree.removeElement(0);
        assertEquals(1, binaryTree.size());
    }

    @Test
    void removeOne() {
        binaryTree.insert(2);
        binaryTree.removeElement(2);
        assertEquals(0, binaryTree.size());
    }

    @Test
    void removeMany() {
        insertValuesIntoTree();
        assertEquals(8, binaryTree.size());
    }

    @Test
    void findMax(){
        insertValuesIntoTree();
        assertEquals(binaryTree.findMax(), 23);
    }

    @Test
    void findMin(){
        insertValuesIntoTree();
        assertEquals(binaryTree.findMin(), 3);
    }

    private void insertValuesIntoTree() {
        binaryTree.insert(12);
        binaryTree.insert(9);
        binaryTree.insert(6);
        binaryTree.insert(16);
        binaryTree.insert(17);
        binaryTree.insert(3);
        binaryTree.insert(22);
        binaryTree.insert(23);
        binaryTree.insert(4);
        binaryTree.insert(10);
        binaryTree.removeElement(10);
        binaryTree.removeElement(4);
    }
}
