// 시간초과 판정 추후 검토하기

package Algorithm;

import java.io.*;
import java.util.*;


public class Baek_j_14500 {

    public static int N;
    public static int M;
    public static int graph[][];
    public static int dx[] = {-1,1,0,0};
    public static int dy[] = {0,0,-1,1};

    public static void main (String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st_1 = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st_1.nextToken());
        M = Integer.parseInt(st_1.nextToken());
        graph = new int[501][501];



        for(int i = 1; i < N+1; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 1; j < M+1; j++){
                graph[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int max = 0;
        for(int i = 1; i < N+1; i++){
            for(int j = 1; j < M+1; j++){
                boolean vi[][] = new boolean[N+2][M+2]; // 이 부분에서 시간 초과 난것을 예상
                int value = dfs(i,j,1,0,vi);
                if(max < value){
                    max = value;
                }
                max = check(i,j,max);
            }
        }


        System.out.println(max);
    }

    public static int dfs(int x, int y,int cnt, int sum, boolean vi[][]){
        if(cnt == 4){
            return sum + graph[x][y];
        }
        vi[x][y] = true;

        int max = 0;
        int index_x = 0;
        int index_y = 0;
        for(int i = 0; i < 4; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];

            if(nx < 1 || nx >= N+1 || ny < 1 || ny >= M+1){
                continue;
            }
            if(max < graph[nx][ny] && !vi[nx][ny]){
                max = graph[nx][ny];
                index_x = nx;
                index_y = ny;
            }
        }

        sum += graph[x][y];
         return dfs(index_x,index_y,cnt+1, sum, vi);
    }

    //DFS로 나올수 없는 구조
    public static int check(int x, int y,int max){

        int mx = x-1;
        int px = x+1;
        int my = y-1;
        int py = y+1;

        max = Math.max(max,graph[x][y]+graph[mx][y]+graph[px][y]+graph[x][py]);
        max = Math.max(max,graph[x][y]+graph[mx][y]+graph[px][y]+graph[x][my]);
        max = Math.max(max,graph[x][y]+graph[x][my]+graph[x][py]+graph[px][y]);
        max = Math.max(max,graph[x][y]+graph[x][my]+graph[x][py]+graph[mx][y]);


        return max;

    }
}
