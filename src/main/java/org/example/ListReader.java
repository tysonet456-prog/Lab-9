package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ListReader {
    private Graph graph;
    public ListReader(String filePath){
        graph = new Graph();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))){
            String line;
            while ((line = reader.readLine()) != null) {
                String[] tokens = line.split(" ");
                String floatString = tokens[2] + "f";
                float weight = Float.parseFloat(floatString);
                if(graph.getNames().contains(tokens[0])){
                    for(int i=0; i<graph.getNames().size(); i++){
                        if(graph.getNodes().get(i).getName() == tokens[0]){



                            graph.getNodes().get(i).addConnectedNode(new Node(tokens[1]), weight);

                        }
                    }

                }
                else{
                    if(graph.getNames().contains(tokens[1])){
                        graph.addNode(new Node(tokens[0], graph.returnNode(tokens[1]), weight));
                    }
                    else{
                        Node node = new Node(tokens[1]);
                        graph.addNode(new Node(tokens[0], node, weight));
                    }

                }

            }
        }
        catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
    public ArrayList<String> displayNodes() {
        return graph.getNames();
    }
    public Graph getGraph(){
        return graph;
    }
}