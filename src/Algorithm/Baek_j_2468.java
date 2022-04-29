package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek_j_2468 {
    static int input[][];
    static boolean vi[][];
    static int N;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        input = new int[N][N];
        int max = 0;

        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j < N; j++){
                input[i][j] = Integer.parseInt(st.nextToken());
                if(input[i][j] >= max) max = input[i][j];
            }
        }


        int hei = 0;
        int maxCnt = 0;

        while(hei < max){
            int result = 0;
            vi = new boolean[N][N];
            for(int i = 0; i < N; i++){
                for(int j = 0; j < N; j++){
                    if(!vi[i][j] && input[i][j] > hei) {
                        result++;
                        dfs(i,j,hei);
                    }
                }
            }
            if(maxCnt <= result) maxCnt = result;
            hei++;
        }


        System.out.println(maxCnt);

    }

    public static void dfs(int x, int y, int hei){

        if(x < 0 || x >= N || y < 0 || y >= N){
            return;
        }

        if(input[x][y] > hei && !vi[x][y]){
            vi[x][y] = true;

            dfs(x-1,y,hei);
            dfs(x+1,y,hei);
            dfs(x,y-1,hei);
            dfs(x,y+1,hei);
        }
        return;
    }
}
