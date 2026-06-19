import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class bredth_first_search {
    public static void main(String[] args) {
        GraphBFS g = new GraphBFS(5);

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
        g.addEdge(0, 3);
        
        g.print();
        g.bredthFirstSearch(0);
    }
}

class GraphBFS extends Graph{
    public GraphBFS(int size){
        super(size);
    }

    public void bredthFirstSearch(int s){
        Queue<Integer> queue = new LinkedList<>();
        boolean[] v = new boolean[size];

        queue.offer(s);
        v[s]=true;

        while (queue.size()!=0){
            s=queue.poll();
            System.out.println(nodes.get(s).data+"--");

            for (int i=0; i<gm[s].length;i++){
                if (gm[s][i]==1 && !v[i]){
                    queue.offer(i);
                    v[i]=true;
                }
            }
        }


    }
}
