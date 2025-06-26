import java.util.Arrays;
class digksatra {
    public static void shortestPath(int v, int[][] cost, int[] dist, int n) {
        boolean[] s = new boolean[n];
        Arrays.fill(dist, Integer.MAX_VALUE); 
        dist[v] = 0; 
        for (int i = 0; i < n - 1; i++) {
            
            int u = -1;
            int minDist = Integer.MAX_VALUE;
            for (int j = 0; j < n; j++) {
                if (!s[j] && dist[j] < minDist) {
                    u = j;
                    minDist = dist[j];
                }
            }
            s[u] = true;

            // Update distance of adjacent vertices
            for (int j = 0; j < n; j++) {
                if (!s[j] && cost[u][j] != 0 && dist[u] != Integer.MAX_VALUE && dist[u] + cost[u][j] < dist[j]) {
                    dist[j] = dist[u] + cost[u][j];
                }
            }
        }
    }
    public static void main(String[] args) {
        int n = 5; 
        int[][] cost = {
            {0, 10, 0, 30, 100},
            {10, 0, 50, 0, 0},
            {0, 50, 0, 20, 10},
            {30, 0, 20, 0, 60},
            {100, 0, 10, 60, 0}
        };
        int[] dist = new int[n];

        int source = 0; 
        shortestPath(source, cost, dist, n);

        System.out.println("Vertex\tDistance from Source");
        for (int i = 0; i < n; i++) {
            System.out.println(i + "\t\t" + dist[i]);
        }
    }
}
