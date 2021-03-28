package com.chapter10;

public class InitializeBinaryTree {
    public static BinaryTreeNode<String> initLargeTree() {
        BinaryTreeNode<String> root = new BinaryTreeNode<>("A");
        root.left = new BinaryTreeNode<>("B");
        root.left.left = new BinaryTreeNode<>("C");
        root.left.left.left = new BinaryTreeNode<>("D");
        root.left.left.right = new BinaryTreeNode<>("E");
        root.left.right = new BinaryTreeNode<>("F");
        root.left.right.right = new BinaryTreeNode<>("G");
        root.left.right.right.left = new BinaryTreeNode<>("H");
        root.right = new BinaryTreeNode<>("I");
        root.right.right = new BinaryTreeNode<>("O");
        root.right.right.right = new BinaryTreeNode<>("P");
        root.right.left = new BinaryTreeNode<>("J");
        root.right.left.right = new BinaryTreeNode<>("K");
        root.right.left.right.left = new BinaryTreeNode<>("L");
        root.right.left.right.right = new BinaryTreeNode<>("N");
        root.right.left.right.left.right = new BinaryTreeNode<>("M");
        return root;
    }

    public static BinaryTreeNode<String> initSimpleBinaryTree() {
        BinaryTreeNode<String> root = new BinaryTreeNode<>("A");
        root.left = new BinaryTreeNode<>("B");
        root.right = new BinaryTreeNode<>("E");
        root.left.left = new BinaryTreeNode<>("C");
        root.left.right = new BinaryTreeNode<>("D");
        root.right.left = new BinaryTreeNode<>("F");
        root.right.right = new BinaryTreeNode<>("G");
        return root;
    }
}
