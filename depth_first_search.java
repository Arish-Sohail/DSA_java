
public class depth_first_search {
    public static void main(String[] args) {
        GraphDFS g = new GraphDFS(5);

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
        g.depthFirstSearch(1);
    }
}

class GraphDFS extends Graph{

    public GraphDFS(int size) {
        super(size);
    }

    public void depthFirstSearch(int s){
        boolean[] v = new boolean[size];
        dfsHelper(s,v);

    }
    public void dfsHelper(int s,boolean[] v){
        if (v[s]){
            return;
        }
        else{
            v[s]=true;
            System.out.println(nodes.get(s).data+"--");
        }
        for (int i=0;i<gm[s].length;i++){
            if (gm[s][i]==1){
                dfsHelper(i, v);
            }
            
        }
        return;
    }

}


