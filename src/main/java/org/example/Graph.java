package org.example;

import java.util.ArrayList;

public class Graph {
    private ArrayList<Node> nodes;
    private ArrayList<String> names;
    public Graph(){
        nodes = new ArrayList<>();
        names = new ArrayList<>();
    }
    public void addNode(Node node){
        nodes.add(node);
        names.add(node.getName());
    }
    public ArrayList<Node> getNodes(){
        return nodes;
    }
    public Node stringToNode(String name){
        Node node = null;
        for(int i=0; i<names.size();i++){
            if(name == names.get(i)){
                node = nodes.get(i);
            }
        }
        return node;
    }
    public ArrayList<String> getNames(){
        return names;
    }
}
