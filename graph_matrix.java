
import java.util.ArrayList;

public class graph_matrix {
    public static void main(String[] args) {
        Graph g = new Graph(5);

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
    int size;
    int[][] gm;
    ArrayList<Node> nodes;

    public Graph (int size){
        this.size=size;
        gm = new int[size][size];
        nodes = new ArrayList<>();
    }

    public void addNode(Node node){
        nodes.add(node);
    }

    public void addEdge(int s, int t){
        gm[s][t]=1;
    }

    public void print(){
        System.out.print("  ");
        for (Node i: nodes){
            System.out.print(i.data+" ");
        }
        System.out.println();

        for (int i=0;i<size;i++){
            System.out.print(nodes.get(i).data+" ");
            for (int j=0;j<size;j++){
                System.out.print(gm[i][j]+" ");
            }
            System.out.println();
        }
    }
    
    

}

class Node{
    char data;
    Node(char  data){
        this.data=data;
    }
}
