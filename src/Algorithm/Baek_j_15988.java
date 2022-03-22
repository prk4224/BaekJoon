package Algorithm;

import java.io.*;

public class Baek_j_15988 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long MOD = 1_000_000_009;
        int M = Integer.parseInt(br.readLine());

        long dp[] = new long[1_000_001];

        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;

        for (int i = 4; i <= 1_000_000; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2] + dp[i - 3])%MOD;
        }

        for(int j = 0; j < M; j++) {
            int N = Integer.parseInt(br.readLine());

            bw.write(dp[N] + "\n");
            bw.flush();
        }

        br.close();
        bw.close();
    }
}
