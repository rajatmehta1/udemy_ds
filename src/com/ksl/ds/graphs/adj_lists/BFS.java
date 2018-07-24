package com.ksl.ds.graphs.adj_lists;

import java.util.*;

public class BFS {


    public static void main(String[] args) {
        List<Node> nodes = GraphUtil.getVertices();
        BFS bfs = new BFS();
            bfs.breadFirstSearch(nodes.get(0));
    }


    public void breadFirstSearch(Node source) {

        HashMap<String, String> visitedMap = new HashMap<>();
        Queue<Node> q = new LinkedList<>();
            q.add(source);
            source.setVisited(true);

        while(!q.isEmpty()) {
            Node n = q.remove();
            System.out.println(n.getName() + ",");
            for(int i = 0 ; i < n.getNeighbours().size() ; i++) {
                Node newNode = n.getNeighbours().get(i);
                if(!newNode.isVisited()) {
                    q.add(newNode);
                    newNode.setVisited(true);
                }
            }
        }


    }





}
