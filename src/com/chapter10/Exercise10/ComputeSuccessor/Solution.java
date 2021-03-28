package com.chapter10.Exercise10.ComputeSuccessor;

import com.chapter10.BinaryTreeNode;

public class Solution {
    public static BinaryTree<Integer>  findSuccessor(BinaryTree<Integer> node) {
        BinaryTree<Integer> iter = node;
        // case 1
        if (iter.right != null) {
            // find the left most element is node's right subtree
            iter = iter.right;
            while (iter.left != null) {
                iter = iter.left;
            }
            return iter;
        }
        // case 2
        while (iter.parent != null && iter.parent.right == iter) {
            iter = iter.parent;
        }
        return iter.parent;
    }


    public static void main(String[] args) {

    }
}

class BinaryTree<T> {
    BinaryTree<T> left, right, parent;
}
