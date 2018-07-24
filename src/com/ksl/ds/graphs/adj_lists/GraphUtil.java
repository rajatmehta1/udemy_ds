package com.ksl.ds.graphs.adj_lists;

import java.util.ArrayList;
import java.util.List;

//https://java2blog.com/breadth-first-search-in-java/ ---- Sample graph from here
public class GraphUtil {

    public static void main(String[] args) {

    }


    public static List<Node> getVertices() {
        List<Node> nodes = new ArrayList<>();

            Node n1 = new Node("40");

            Node n2 = new Node("10");

            Node n3 = new Node("20");

            Node n4 = new Node("30");

            Node n5 = new Node("50");

            Node n6 = new Node("60");

            Node n7 = new Node("70");

                n1.addNeighbour(n3); n1.addNeighbour(n2);

                n2.addNeighbour(n4);

                n3.addNeighbour(n5); n3.addNeighbour(n6); n3.addNeighbour(n4); n3.addNeighbour(n2);

                n4.addNeighbour(n6);

                n5.addNeighbour(n7);
                n6.addNeighbour(n7);

                nodes.add(n1);
                nodes.add(n2);
                nodes.add(n3);
                nodes.add(n4);
                nodes.add(n5);
                nodes.add(n6);
                nodes.add(n7);

                return nodes;
    }



}
