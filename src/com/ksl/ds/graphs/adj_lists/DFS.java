package com.ksl.ds.graphs.adj_lists;

import com.sun.corba.se.impl.orbutil.graph.Graph;

import java.util.List;
import java.util.Stack;

public class DFS {

    public static void main(String[] args) {
        List<Node> vertices = GraphUtil.getVertices();
        DFS d = new DFS();
            vertices.get(0).setVisited(true);
            d.depthFirstSearch(vertices.get(0));
    }

    public void depthFirstSearch(Node source) {
        System.out.println(source.getName() + ",");
        source.setVisited(true);
        for(Node n: source.getNeighbours()) {
            if(!n.isVisited()) depthFirstSearch(n);
        }
    }



    public void dfsUsingStack(Node source) {
        Stack<Node> s = new Stack<>();
            source.setVisited(true);
        System.out.println(source.getName() + ",");

        for(Node n: source.getNeighbours()) {
            if(!n.isVisited()) {
                depthFirstSearch(n);
            }
        }
    }
}
