//Pseudo Code
import java.util.*;
import java.io.*;
public class DFS {
    public ArrayList<Integer> Graph(int V, ArrayList.<ArrayList<Integer>> adj) {
        ArrayList<Integer> dfsarray = new ArrayList<>();
        boolean visited[] = new boolean[V+1];
        for(int i=1;i<=V;i++)
        {
            if(visited[i]==false)
            {
                dfs(i,visited,adj,dfsarray);
            }
        }
        return dfsarray;
    }
    public void dfs(int node, boolean visited[],ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> dfsarray )
    {
        dfsarray.add(node);
        visited[node] = true;
        for(Integer x:adj.get(node)){
            if(visited[x]==false)
            {
                dfs(x,visited,adj,dfsarray);
            }
        }
    }
}
