package org.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

public class DijkstraSearch {
    public ArrayList<Node> dijkstraSearch(Graph graph, Node startNode, Node endNode){
        ArrayList<Node> path = new ArrayList<>();
        PriorityQueue<Node> q = new PriorityQueue<Node>();
        for(int i=0; i<graph.getNodes().size(); i++){
            graph.getNodes().get(i).setDistance(Double.POSITIVE_INFINITY);
            graph.getNodes().get(i).setPrevious(null);

        }
        q.add(startNode);
        startNode.setDistance(0);
        while(!q.isEmpty()){
            Node node = q.poll();
            node.setVisited(true);
            for(int j=0; j<node.getConnectedList().size(); j++){
                Node nextNode = node.getConnectedList().get(j);
                if(nextNode.isVisited() == false){
                nextNode.setDistance(node.getWeight(j));
                q.add(nextNode);}
            }
        }
        return path;

    }
    public double pathDistance(ArrayList<Node> path){
        double distance = 0;
        for(int i=0;i<path.size(); i++){
            distance += path.get(i).getDistance();
        }
        return distance;
    }


}
