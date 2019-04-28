package data.structure.src.tree;

/**
 * Author: ehang
 * Date:   19-4-28
 * Desc:
 */
public class BinaryTreeNode {
    int val;
    boolean passed;

    BinaryTreeNode left;
    BinaryTreeNode right;

    BinaryTreeNode(int x) {
        this.val = x;
        left = null;
        right = null;
        passed = false;
    }
}
