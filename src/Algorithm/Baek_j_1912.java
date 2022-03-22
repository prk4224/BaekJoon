package Algorithm;

import java.io.*;
import java.util.StringTokenizer;

public class Baek_j_1912 {
    static Integer dp[];
    static  int input[];
    static int max;
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        input = new int[N+1];
        dp = new Integer[N+1];

        for(int i = 1; i <= N; i++){
            input[i] = Integer.parseInt(st.nextToken());
        }

        dp[1] = input[1];
        max = input[1];

        recur(N);

        bw.write(max + "");
        bw.flush();
        bw.close();
    }

    static int recur(int N){

        if(dp[N] == null){
            dp[N] = Math.max(recur(N-1) + input[N],input[N]);

            max = Math.max(dp[N],max);
        }
        return dp[N];
    }
}
