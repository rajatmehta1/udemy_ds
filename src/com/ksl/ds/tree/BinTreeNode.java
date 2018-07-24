package com.ksl.ds.tree;

/*
 * For simplicity data is
 */
public class BinTreeNode {
    public int data;
    public BinTreeNode left; //purposefully creating public for simplicity in creating dummy instances
    public BinTreeNode right;


    public BinTreeNode(BinTreeNode left, BinTreeNode right, int data) {
        this.left = left;
        this.right = right;
        this.data = data;
    }


    public BinTreeNode getLeft() {
        return left;
    }


    public BinTreeNode getRight() {
        return right;
    }


    public int getData() {
        return data;
    }


}
