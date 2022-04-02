package Algorithm;

import java.io.*;
import java.util.*;

public class Baek_j_18290 {

    public static int N;
    public static int M;
    public static int K;
    public static int graph[][];
    public static int max = -10000;
    public static boolean vi[][];
    public static int dx[] = {-1, 1, 0, 0};
    public static int dy[] = {0, 0, -1, 1};


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        graph = new int[N][M];
        vi = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            StringTokenizer st1 = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                graph[i][j] = Integer.parseInt(st1.nextToken());
            }
        }

        br.close();

        dfs(0, 0, 0, 0);

        bw.write(max + "");
        bw.flush();
        bw.close();


    }

    public static void dfs(int x, int y, int dep, int sum) {

        if (dep == K) {
            max = Math.max(max, sum);
            return;
        }


        for (int i = x; i < N; i++) {
            for (int j = (i == x ? y : 0); j < M; j++) {
                if (check(i,j)) {
                    vi[i][j] = true;
                    dfs(i, j, dep + 1, sum + graph[i][j]);
                    vi[i][j] = false;

                }
            }
        }
        return;
    }

    public static boolean check(int x, int y) {

        if (vi[x][y]) {
            return false;
        } else {
            for (int k = 0; k < 4; k++) {
                int nx = x + dx[k];
                int ny = y + dy[k];
                if (nx < 0 || nx >= N || ny < 0 || ny >= M) {
                    continue;
                }
                if(vi[nx][ny]) return false;

            }
            return true;
        }
    }
}
