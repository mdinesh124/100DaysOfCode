//Pseudo Code

import java.util.*;
import java.io.*;
class BFS
{
  public ArrayList<Integer> bfs(int V, ArrayList<ArrayList<Integer>> adj)
  {
      ArrayList<Integer> bfs = new ArrayList<Integer>();
      boolean visited[] = new boolean[V+1];
      for(int i = 1;i<= V;i++)
      {
          if(visited[i]==false)
          {
              Queue<Integer> q = new LinkedList<>();
              q.add(i);
              visited[i] = true;

              while(!q.isEmpty())
              {
                  Integer node = q.poll();
                  bfs.add(node);
                  for(Integer x: adj.get(node)){
                      if(visited[x] == false)
                      {
                          visited[x] = true;
                          q.add(x);
                      }
                  }
              }

          }
      }
      return bfs;
  }  
  public static void main(String[] args) {
      
  }
}
