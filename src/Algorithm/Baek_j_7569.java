package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Baek_j_7569 {
    public static int N;
    public static int M;
    public static int H;
    public static int map[][][];
    public static int dx[] = {-1, 0, 1, 0, 0, 0};
    public static int dy[] = {0, 1, 0, -1, 0, 0};
    public static int dz[] = {0, 0,  0, 0,-1, 1};
    public static Queue<Integer> qx = new LinkedList<>();
    public static Queue<Integer> qy = new LinkedList<>();
    public static Queue<Integer> qz = new LinkedList<>();


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        H = Integer.parseInt(st.nextToken());

        map = new int[H][N][M];

        for(int h = 0; h < H; h++) {
            for (int i = 0; i < N; i++) {
                StringTokenizer st1 = new StringTokenizer(br.readLine());
                for (int j = 0; j < M; j++) {
                    map[h][i][j] = Integer.parseInt(st1.nextToken());
                    if (map[h][i][j] == 1) {
                        qx.offer(i);
                        qy.offer(j);
                        qz.offer(h);
                    }
                }
            }
        }
        System.out.print(bfs());
    }

    public static int bfs() {

        while (!qx.isEmpty() && !qy.isEmpty() && !qz.isEmpty()) {
            int x = qx.poll();
            int y = qy.poll();
            int z = qz.poll();

            for (int i = 0; i < 6; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                int nz = z + dz[i];

                if (nx < 0 || nx >= N || ny < 0 || ny >= M || nz < 0 || nz >= H) {
                    continue;
                }
                if (map[nz][nx][ny] == -1) {
                    continue;
                }
                if (map[nz][nx][ny] == 0) {
                    map[nz][nx][ny] = map[z][x][y] + 1;
                    qx.offer(nx);
                    qy.offer(ny);
                    qz.offer(nz);
                }
            }
        }
        int result = Integer.MIN_VALUE;

        for(int h = 0; h < H; h++) {
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {

                    if (map[h][i][j] == 0) {
                        return -1;
                    }
                    result = Math.max(result, map[h][i][j]);
                }
            }
        }
        if (result == 1) {
            return 0;
        }
        return result - 1;
    }
}

