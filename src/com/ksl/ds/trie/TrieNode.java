package com.ksl.ds.trie;

import sun.text.normalizer.Trie;

import java.util.HashMap;

public class TrieNode {
    char c;
    HashMap<Character,String> childrenMap;

    public TrieNode() {

    }

    public char getC() {
        return c;
    }

    public void setC(char c) {
        this.c = c;
    }

    public HashMap<Character, String> getChildrenMap() {
        return childrenMap;
    }

    public void setChildrenMap(HashMap<Character, String> childrenMap) {
        this.childrenMap = childrenMap;
    }
}
