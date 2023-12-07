
public class MainShortestPath {
	public class FloydWarshall {

	    private static final int INF = Integer.MAX_VALUE; // Infinity value for non-existent edges

	    public static void floydWarshall(int[][] graph) {
	        int V = graph.length;

	        // Initialize the distance matrix with the graph values
	        int[][] dist = new int[V][V];
	        int[][] inter = new int[V][V];
	        for (int i = 0; i < V; i++) {
	            for (int j = 0; j < V; j++) {
	                dist[i][j] = graph[i][j];
	                inter[i][j] = -1; 
	            }
	        }
	       

	        // Update the distance matrix by checking all intermediate vertices
	        for (int k = 0; k < V; k++) {
	            for (int i = 0; i < V; i++) {
	                for (int j = 0; j < V; j++) {
	                    if (dist[i][k] != INF && dist[k][j] != INF 
	                    		&& dist[i][k] + dist[k][j] < dist[i][j]) {
	                        dist[i][j] = dist[i][k] + dist[k][j];
	                        inter[i][j] = k;
	                    }
	                }
	            }
	        }

	        // Print the shortest distances between every pair of vertices
	        for (int i = 0; i < V; i++) {
	            for (int j = 0; j < V; j++) {
	                if (dist[i][j] == INF) {
	                    System.out.print("INF ");
	                } else {
	                    System.out.println(i+"->"+j+":"+dist[i][j] + " ");
	                    path(i, j, inter);
	                }
	            }
	            System.out.println();
	        }
	    }
	    static void path(int i, int j, int[][] inter) {
	    	if(inter[i][j] == -1) {System.out.println(i +" " +j); 
	    	return;}
	    	path(i, inter[i][j], inter);
	    	path(inter[i][j], j, inter);
	    }

	    public static void main(String[] args) {
	        int[][] graph = {
	                {0, 5, INF, 10},
	                {INF, 0, 3, INF},
	                {INF, INF, 0, 1},
	                {INF, INF, INF, 0}
	        };

	        floydWarshall(graph);
	    }
	}

}
