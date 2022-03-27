package Algorithm;

import java.io.*;
import java.util.*;

public class Baek_j_1260 {
    public static ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
    public static boolean visited[];
    public static void main (String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int input[] = new int[3];

        for(int i = 0; i < 3; i++){
            input[i] = Integer.parseInt(st.nextToken());
        }

        visited = new boolean[input[0]+1];

        for(int i = 0; i < input[0]+1; i++){
            // 그래프 초기화
            graph.add(new ArrayList<Integer>());
        }

        for(int i = 0; i < input[1]; i++){
            StringTokenizer st_1 = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st_1.nextToken());
            int b = Integer.parseInt(st_1.nextToken());

            graph.get(a).add(b);
            graph.get(b).add(a);
        }
        br.close();

        dfs(input[2]);
        System.out.println();
        Arrays.fill(visited, false);
        bfs(input[2]);
    }
    public static void dfs(int start){
        visited[start] = true;
        System.out.print(start + " ");

        for(int i = 0; i <graph.get(start).size(); i++){
            int y = graph.get(start).get(i);

            if(!visited[y]){
                dfs(y);
            }
        }
    }

    public static void bfs(int start){
        Queue<Integer> q = new LinkedList<>();

        q.offer(start);
        visited[start] = true;

        while(!q.isEmpty()){
            int x = q.poll();
            System.out.print(x + " ");

            for(int i = 0; i < graph.get(x).size(); i++){

                int y = graph.get(x).get(i);

                if(!visited[y]){
                    q.offer(y);
                    visited[y] = true;
                }
            }
        }

    }
}
