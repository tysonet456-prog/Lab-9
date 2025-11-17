package org.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

public class DijkstraSearch {
    public void dijkstraSearch(Graph graph, Node startNode, Node endNode){
        PriorityQueue<Node> q = new PriorityQueue<Node>();
        for(int i=0; i<graph.getNodes().size(); i++){
            graph.getNodes().get(i).setDistance(Double.POSITIVE_INFINITY);
            graph.getNodes().get(i).setPrevious(null);
            q.add(graph.getNodes().get(i));
        }
        startNode.setDistance(0);
        while(!q.isEmpty()){
            Node node = q.poll();
            for(int j=0; j<node.getConnectedList().size(); j++){
                Node nextNode = node.getConnectedList().get(j);
            }
        }

    }

}
