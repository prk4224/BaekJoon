package Algorithm;

import java.io.*;
import java.util.StringTokenizer;

public class Baek_j_2225 {
    static long dp[][];
    static final long MOD = 1_000_000_000;
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        dp = new long[201][201];

        for(int i = 1; i <= K; i++){
            dp[i][0] = 1;
        }

        for(int i = 1; i <=K; i++){

            for(int j = 1; j <= N; j++){
                dp[i][j] = (dp[i][j-1] + dp[i-1][j]) % MOD;
            }
        }
        bw.write(dp[N][K] + "");
        bw.flush();
        bw.close();

    }
}
