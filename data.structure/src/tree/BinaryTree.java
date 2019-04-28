package data.structure.src.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Author: ehang
 * Date:   19-4-28
 * Desc:
 */
public class BinaryTree
    implements Tree {

    public void printTree(BinaryTreeNode root) {
        if (root == null) return ;

        Queue<BinaryTreeNode> queue = new LinkedList<>();
        int curLevelCount = 1;
        int nextLevelCount = 0;
        queue.offer(root);

        while (!queue.isEmpty()) {
            if (curLevelCount > 0) {
                BinaryTreeNode curNode = queue.remove();
                if (curNode.left != null) {
                    ++nextLevelCount;
                    queue.offer(curNode.left);
                }
                if (curNode.right != null) {
                    ++nextLevelCount;
                    queue.offer(curNode.right);
                }
                curLevelCount--;
                System.out.print(curNode.val + "\t");
            } else {
                System.out.println();
                curLevelCount = nextLevelCount;
                nextLevelCount = 0;
            }
        }
        System.out.println();
    }

    public String DFS(BinaryTreeNode root) {
        if (root == null) return "";

        StringBuffer res = new StringBuffer();
        Stack<BinaryTreeNode> stack = new Stack<>();
        stack.push(root);

        while (!stack.empty()) {
            BinaryTreeNode curNode = stack.pop();

            if (!curNode.passed) {
                res.append(curNode.val + " ");
                curNode.passed = true;
                stack.push(curNode);
                if (curNode.left != null) {
                    stack.push(curNode.left);
                }
            } else {
                if (curNode.right != null) {
                    stack.push(curNode.right);
                }
            }
        }

        return res.toString();
    }

    public String BFS(BinaryTreeNode root) {
        if (root == null) return "";

        Queue<BinaryTreeNode> queue = new LinkedList<>();
        queue.offer(root);
        StringBuffer res = new StringBuffer();

        while (!queue.isEmpty()) {
            BinaryTreeNode curNode = queue.remove();
            res.append(curNode.val + " ");
            if (curNode.left != null) {
                queue.offer(curNode.left);
            }
            if (curNode.right != null) {
                queue.offer(curNode.right);
            }
        }

        return res.toString();
    }

    public static BinaryTreeNode buildBinaryTree(String preOrder, String midOrder) {
        return null;
    }
}

