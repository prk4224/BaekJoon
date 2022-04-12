package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek_j_10971 {
    static int N;
    static int input[][];
    static int min = Integer.MAX_VALUE;
    static boolean vi[];
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        input = new int[N][N];
        vi = new boolean[N];
        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j < N; j++){
                input[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int i = 0; i < N; i++){
            dfs(0,0,i,i);
        }

        System.out.println(min);

    }

    public static void dfs(int dep,int sum,int start,int i){
        if( N == dep && start == i){
            min = Math.min(sum,min);
            return;
        }
        for(int j = 0; j < N; j++){
            if(!vi[i] && input[i][j] > 0){
                vi[i] = true;
                sum += input[i][j];
                dfs(dep+1,sum, start,j);
                vi[i] = false;
                sum -= input[i][j];
            }
        }
    }
}
