import java.util.Iterator;
import java.util.LinkedList;

public class DepthFirstSearch {


    //Adjacent List Representation
    private LinkedList<Integer> adj[];
    private int V; //No. of Vertices

    @SuppressWarnings("unchecked") void DepthFirstSearch(int v) {
        V = v;
        adj = new LinkedList[v]; //Every index of the array is a linked list of size v
        for(int i = 0; i < v; ++i) {
            adj[i] = new LinkedList<>();
        }
    }

    void addEdge (int v, int w) {
        adj[v].add(w); //add w to v's list
    }

    void DFSUtill (int v, boolean visited[]) {
        //Mark the current node as visited and print it
        visited[v] = true;
        System.out.println(v + " ");

        Iterator<Integer> i = adj[v].listIterator();
        while (i.hasNext())
        {
            int n = i.next();
            if (!visited[n])
                DFSUtill(n, visited);
        }
    }

    void DFS (int v) {
        boolean visited[] = new boolean[V];
        DFSUtill(v, visited);
    }

    public static void main(String[] args) {
        DepthFirstSearch g = new DepthFirstSearch();
        g.DepthFirstSearch(4); //set up the adj list

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        System.out.println(
                "Following is Depth First Traversal "
                        + "(starting from vertex 2)");

        g.DFS(2); //start from vertex 2
    }
}
