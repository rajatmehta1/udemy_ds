package com.ksl.ds.tree;

public class TreeTraversalRecursive {


    //always sorts the nodes
    // Left - Root - Right
    public void inOrder(BinTreeNode btree) {
        if(null == btree)
            return;
        inOrder(btree.left);
            System.out.print(btree.data + " ,");
        inOrder(btree.right);
    }

    //Root - Left - Right
    public void preOrder(BinTreeNode btree) {
        if(null == btree)
            return;
        System.out.print(btree.data + " ,");
        preOrder(btree.left);
        preOrder(btree.right);
    }

    // Left - Right - Root
    public void postOrder(BinTreeNode btree) {
        if(null == btree)
            return;
        postOrder(btree.left);
        postOrder(btree.right);
        System.out.print(btree.data + " ,");
    }

    public static void main(String[] args) {
        BinTreeNode bt = TreeUtil.getBinTree2();
        TreeTraversalRecursive tt = new TreeTraversalRecursive();
        System.out.println(
                "inorder"
        );
            tt.inOrder(bt);

        System.out.println("\npre order");
            tt.preOrder(bt);

        System.out.println("\npost order");
            tt.postOrder(bt);
    }

}
