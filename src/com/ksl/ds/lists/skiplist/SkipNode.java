package com.ksl.ds.lists.skiplist;

public class SkipNode {
    public int data;
    public SkipNode next;
    public SkipNode prev;
    public SkipNode down;
    public SkipNode up;

    public SkipNode() {

    }

    public SkipNode(int data, SkipNode prev, SkipNode next, SkipNode up, SkipNode down) {
        this.data = data;
        this.prev = prev;
        this.next = next;
        this.up = up;
        this.down = down;
    }

    public SkipNode getDown() {
        return down;
    }

    public SkipNode getNext() {
        return next;
    }
    
    public int getData() {
        return this.data;
    }

    public SkipNode getPrev() {
        return prev;
    }

    public SkipNode getUp() {
        return up;
    }
}