package graphs;

public class DFS {
  public static void main(String[] args) {
    int[][] mat = {{ 0, 1, 0, 1, 0 },
                  { 1, 0, 1, 0, 1 },
                  { 0, 1, 0, 0, 0 },
                  { 1, 0, 0, 0, 0 },
                  { 0, 1, 0, 0, 0 } };
    dfs(mat, new boolean[mat.length], 0);
  }

  private static void dfs(int[][] graph, boolean[] visited, int node) {
    visited[node] = true;

    System.out.println("Node: " + node);

    for(int i = 0; i < graph.length; i++) {
      if(graph[node][i] == 1 && !visited[i]) {
        dfs(graph, visited, i);
      }
    }

  }

}
