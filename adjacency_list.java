

import java.util.ArrayList;
import java.util.LinkedList;

public class adjacency_list {
    public static void main(String[] args) {
        Graph g = new Graph();

        g.addNode(new Node('A'));
        g.addNode(new Node('B'));
        g.addNode(new Node('C'));
        g.addNode(new Node('D'));
        g.addNode(new Node('E'));

        g.addEdge(0,1);
        g.addEdge(1,2);
        g.addEdge(2,3);
        g.addEdge(3,0);
        g.addEdge(3,4);

        g.print();
    }
}


class Graph{
    ArrayList<LinkedList<Node>> al;

    public Graph() {
        al = new ArrayList<>();
    }

    public void addNode(Node node){
        LinkedList<Node> nl = new LinkedList<>();
        nl.add(node);
        al.add(nl);
    }
    public void addEdge(int s,int d){
        LinkedList<Node> nl = al.get(s);
        Node dest = al.get(d).get(0);
        nl.add(dest);
    }
    
    public void print(){
        for (LinkedList<Node> ll:al) {
            for (int i = 0;i<ll.size();i++){
                if (i<ll.size()-1){
                    System.out.print(ll.get(i).data+"--->");
                }
                else{
                    System.out.print(ll.get(i).data+".");
                }
            }
            System.out.println();

        }
    }

}

class Node{
    char data;
    public Node(char data) {
        this.data=data;
    }
    
}