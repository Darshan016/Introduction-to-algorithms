package org.example.BinaryTree;

public class BinaryTree {
    protected TreeNode root;

    public void createBinaryTree() {
        TreeNode first = new TreeNode(1);
        TreeNode second = new TreeNode(1);
        TreeNode third = new TreeNode(1);
        TreeNode fourth = new TreeNode(1);
        TreeNode fifth = new TreeNode(1);

        root = first;
        first.left = second;
        first.right = third;
        second.left = fourth;
        second.right = fifth;
    }
}
