package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Baek_j_7576 {
    public static int N;
    public static int M;
    public static int map[][];
    public static int cut = 0;
    public static int dx[] = {-1,1,0,0};
    public static int dy[] = {0,0,-1,1};
    public static Queue<Integer> qx = new LinkedList<>();
    public static Queue<Integer> qy = new LinkedList<>();


    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());

        map = new int[N][M];

        for(int i = 0; i < N; i++){
            StringTokenizer st1 = new StringTokenizer( br.readLine());
            for(int j = 0; j < M; j++){
                map[i][j] = Integer.parseInt(st1.nextToken());
                if(map[i][j] == 1){
                    qx.offer(i);
                    qy.offer(j);
                }
            }
        }
        System.out.print(bfs());
    }
    public static int  bfs(){

        while(!qx.isEmpty() && !qy.isEmpty()) {
            int x = qx.poll();
            int y = qy.poll();

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if(nx < 0 || nx >= N || ny < 0 || ny >= M){
                    continue;
                }
                if(map[nx][ny] == -1){
                    continue;
                }
                if(map[nx][ny] == 0){
                    map[nx][ny] = map[x][y] + 1;
                    qx.offer(nx);
                    qy.offer(ny);
                }
            }
        }
        int result = Integer.MIN_VALUE;

        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){

                if(map[i][j] ==0 ){
                    return -1;
                }
                result = Math.max(result, map[i][j]);
            }
        }
        if(result == 1){
            return 0;
        }
        return result - 1;
    }
}
