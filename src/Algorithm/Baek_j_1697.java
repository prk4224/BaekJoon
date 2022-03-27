package Algorithm;

import java.io.*;
import java.util.*;
import java.lang.*;

public class Baek_j_1697 {

    public static int start;
    public static int end;
    public static int graph[];
    public static int dp[] = {- 1, 1, 2 };

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        start = Integer.parseInt(st.nextToken());
        end = Integer.parseInt(st.nextToken());


        System.out.println(bfs(start));
    }

    public static int bfs(int x) {
        graph = new int[100_001];
        Arrays.fill(graph,-1);

        Queue<Integer> q = new LinkedList<>();
        graph[x] = 0;
        q.offer(x);


        while (graph[end] == -1) {
            int temp = q.poll();

            for (int i = 0; i < 3; i++) {

                if(i == 2){
                    int nx = temp * dp[i];

                    if(nx < 0 || nx >100000) continue;
                    if(graph[nx] != -1) continue;

                    graph[nx] = graph[temp] + 1;
                    q.offer(nx);

                }
                else {
                    int nx = temp + dp[i];

                    if(nx < 0 || nx >100000) continue;
                    if(graph[nx] != -1) continue;

                    graph[nx] = graph[temp] + 1;
                    q.offer(nx);

                }
            }
        }
        return graph[end];
    }
}
