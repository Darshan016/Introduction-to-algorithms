package org.example.BinaryTree;

public class BinarySearchTree {
    protected TreeNode root;

    public TreeNode insert(TreeNode root, int value) {
        if (root == null) {
            root = new TreeNode(value);
            return root;
        }
        if (value < root.data) {
            root.left = insert(root.left, value);
        } else {
            root.right = insert(root.right, value);
        }
        return root;
    }

    public void insert(int value) {
        root = insert(root, value);
    }

    public void inOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public TreeNode search(int value) {
        return search(root, value);
    }

    public TreeNode search(TreeNode root, int value) {
        if (root == null || root.data == value) {
            return root;
        }
        if (value < root.data) {
            return search(root.left, value);
        } else {
            return search(root.right, value);
        }
    }
}
