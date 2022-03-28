package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Baek_j_7562 {

    public static int dx[] = {1, 2, 2, 1, -1, -2, -2, -1};
    public static int dy[] = {2, 1, -1, -2, -2, -1, 1, 2};
    public static int graph[][];
    public static int N;
    public static int end_x;
    public static int end_y;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            N = Integer.parseInt(br.readLine()); // 체스판의 크기


            StringTokenizer st1 = new StringTokenizer(br.readLine());
            int start_x = Integer.parseInt(st1.nextToken());
            int start_y = Integer.parseInt(st1.nextToken());

            StringTokenizer st2 = new StringTokenizer(br.readLine());
            end_x = Integer.parseInt(st2.nextToken());
            end_y = Integer.parseInt(st2.nextToken());

            System.out.println(bfs(start_x, start_y));
        }

    }

    public static int bfs(int x, int y) {
        graph = new int[N][N];

        if(x == end_x && y == end_y){
            return 0;
        }

        Queue<Integer> qx = new LinkedList<>();
        Queue<Integer> qy = new LinkedList<>();

        qx.offer(x);
        qy.offer(y);

        while (graph[end_x][end_y] == 0) {
            int tx = qx.poll();
            int ty = qy.poll();

            for (int i = 0; i < 8; i++) {
                int nx = tx + dx[i];
                int ny = ty + dy[i];

                if (nx < 0 || nx >= N || ny < 0 || ny >= N) {
                    continue;
                }

                if (graph[nx][ny] != 0) {
                    continue;
                }

                graph[nx][ny] = graph[tx][ty] + 1;
                qx.offer(nx);
                qy.offer(ny);
            }
        }
        return graph[end_x][end_y];
    }
}
