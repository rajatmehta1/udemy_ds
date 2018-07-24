package com.ksl.ds.tree;

public class TreeUtil {


    public static BinTreeNode getBinTree() {
        //leaf
        BinTreeNode leaf1 = new BinTreeNode(null, null, 20);
        BinTreeNode leaf2 = new BinTreeNode(null, null, 30);

        BinTreeNode nodeLeft = new BinTreeNode(leaf1, leaf2, 25);


        BinTreeNode leaf3 = new BinTreeNode(null, null, 60);
        BinTreeNode leaf4 = new BinTreeNode(null, null, 100);

        BinTreeNode nodeRight = new BinTreeNode(leaf3, leaf4, 75);

        BinTreeNode root = new BinTreeNode(nodeLeft, nodeRight, 50);

        return root;

    }


    public static BinTreeNode getBinTree2() {
        //leaf
        BinTreeNode leaf1 = new BinTreeNode(null, null, 4);
        BinTreeNode leaf2 = new BinTreeNode(null, null, 5);

        BinTreeNode nodeLeft = new BinTreeNode(leaf1, leaf2, 2);


        BinTreeNode nodeRight = new BinTreeNode(null, null, 3);

        BinTreeNode root = new BinTreeNode(nodeLeft, nodeRight, 1);

        return root;

    }

}
