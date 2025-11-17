package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Graph file to read from: ");
        String filePath = scanner.next();
        ListReader listReader = new ListReader(filePath);
        System.out.println();
        System.out.print("List of Nodes: " + listReader.displayNodes());
        System.out.println();
        System.out.print("Node to star at: ");
        String node = scanner.next();
        Graph graph = listReader.getGraph();
        Node startNode = graph.stringToNode(node);
        DijkstraSearch dSearch = new DijkstraSearch();
        for(int i=0; i<graph.getNodes().size(); i++){
            dSearch.dijkstraSearch(graph, startNode, graph.getNodes().get(i));
        }

    }
}