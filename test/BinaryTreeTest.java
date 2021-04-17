import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BinaryTreeTest {

    private BinaryTree binaryTree;

    @BeforeEach
    void setUp() {
        binaryTree = new BinaryTree();
    }

    @Test
    void getRoot() {
        BinaryTreeNode newBinTreeNode = new BinaryTreeNode(0);
        assertEquals(binaryTree.getRoot().getElement(), newBinTreeNode.getElement());
    }
}
