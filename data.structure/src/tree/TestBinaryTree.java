package data.structure.src.tree;

/**
 * Author: ehang
 * Date:   19-4-28
 * Desc:
 */
public class TestBinaryTree {

    public static void main(String[] args) {
        BinaryTreeNode root = new BinaryTreeNode(1);

        BinaryTreeNode node1 = new BinaryTreeNode(2);
        BinaryTreeNode node2 = new BinaryTreeNode(3);
        BinaryTreeNode node3 = new BinaryTreeNode(4);
        BinaryTreeNode node4 = new BinaryTreeNode(5);
        BinaryTreeNode node5 = new BinaryTreeNode(6);

        root.left = node1;
        root.right = node2;
        node1.left = node3;
        node1.right = node4;
        node2.right = node5;

        BinaryTree tree = new BinaryTree();
        tree.printTree(root);

        System.out.println(tree.BFS(root));
        System.out.println(tree.DFS(root));
    }
}
