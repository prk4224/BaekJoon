package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek_j_1389 {

    static int input[][];
    static boolean vi[];
    static int N;
    static int cnt;

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        int nodeCnt = Integer.parseInt(st.nextToken());

        input = new int[N+1][N+1];
        vi = new boolean[N+1];
        int result[] = new int[N];

        for(int i = 0; i < nodeCnt; i++){
            st = new StringTokenizer(br.readLine());

            int num1 = Integer.parseInt(st.nextToken());
            int num2 = Integer.parseInt(st.nextToken());

            input[num1][num2] = 1;
            input[num2][num1] = 1;

        }

    }
    public static void dfs(int start, int dep){

        if(dep == N) {
            return;
        }

        for(int i = 0; i < N; i++){

        }


    }
}
