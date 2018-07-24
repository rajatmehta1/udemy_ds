package com.ksl.ds.graphs.adj_lists;

import java.util.ArrayList;

public class Node {

    private String name;
    private ArrayList<Node> neighbours;
    private boolean visited;


    public Node(String name) {
        this.name = name;
        neighbours = new ArrayList<>();
    }

    public void addNeighbour(Node n) {
        this.neighbours.add(n);
    }

    public ArrayList<Node> getNeighbours() {
        return neighbours;
    }

    public String getName() {
        return name;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

}
