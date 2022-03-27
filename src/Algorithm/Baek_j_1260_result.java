package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Baek_j_1260_result {

    public static int map[][];
    public static boolean visited[];
    public static int input[];

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

         input = new int[3];

        for(int i = 0; i < 3; i++){
            input[i] = Integer.parseInt(st.nextToken());
        }
        map = new int[input[0]+1][input[0]+1];

        // 모든 배열 0으로 초기화
        for(int i =0; i < input[0]+1; i++){
            Arrays.fill(map[i],0);
        }

        for(int i = 0; i < input[1]; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            map[a][b] = 1;
            map[b][a] = 1;
        }
        visited = new boolean[input[0]+1];

        dfs(input[2]);
        System.out.println();
        Arrays.fill(visited, false);
        bfs(input[2]);
    }

    public static void dfs(int start){
        visited[start]  = true;
        System.out.print(start+ " ");

        for(int i = 1; i < input[0]+1; i++){

            if(map[start][i] ==1 && !visited[i]){
                visited[i] = true;
                dfs(i);
            }
        }
    }

    public static void bfs(int start){
        Queue<Integer> q = new LinkedList<>();
        q.offer(start);
        visited[start] = true;

        while (!q.isEmpty()){
            int x = q.poll();
            System.out.print(x + " ");

            for(int i = 1; i < input[0]+1; i++){

                if(map[x][i] == 1 && !visited[i]){
                    visited[i] = true;
                    q.offer(i);
                }
            }
        }
    }
}
