package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baek_j_2606 {
    public static int map[][];
    public static boolean visited[];
    public static int cut = 0;
    public static int N;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        visited = new boolean[N+1];
        map = new int[N+1][N+1];

        for(int i = 0; i < N+1; i++){
            Arrays.fill(map[i],0);
        }

        for(int i = 0; i <M; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            map[a][b] = 1;
            map[b][a] = 1;
        }
        dfs(1);
        System.out.print(cut-1);
    }

    public static void dfs(int start){
        visited[start] = true;
        cut++;

        for(int i = 1; i < N+1; i++){
            if(map[start][i] == 1 && !visited[i] ){
                dfs(i);
            }
        }
    }
}
