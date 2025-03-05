package graphs;

public class AdjacencyMatrix {

  public static void displayMatrix(int[][] mat) {
    for (int[] row : mat) {
        for (int val : row) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
  }
  public static void main(String[] args) {
    int[][] mat = {{ 0, 1, 0, 0 },
                  { 1, 0, 1, 0 },
                  { 0, 1, 0, 1 },
                  { 0, 0, 1, 0 } };
  
    displayMatrix(mat);
  
  
  }



}