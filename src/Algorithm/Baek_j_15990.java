package Algorithm;

import java.io.*;

public class Baek_j_15990 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long dp[][] = new long[100_001][4];

        dp[1][1] = 1; // 1을 만드는 방볍
        dp[2][2] = 1; // 2를 만드는 방법
        dp[3][1] = 1; // 3을 만드는 방법 1+2
        dp[3][2] = 1; // 3을 만드는 방법 2+1
        dp[3][3] = 1; // 3을 만드는 방법 3

        for(int i = 4; i <= 100_000; i++){
            dp[i][1] = (dp[i-1][2] + dp[i-1][3]) % 1_000_000_009;
            dp[i][2] = (dp[i-2][1] + dp[i-2][3]) % 1_000_000_009;
            dp[i][3] = (dp[i-3][1] + dp[i-3][2]) % 1_000_000_009;
        }

        
        long N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++){
            int num = Integer.parseInt(br.readLine());

            long result = dp[num][1] + dp[num][2] + dp[num][3];
            bw.write(result%1_000_000_009 + "\n");
            bw.flush();

        }
        br.close();
        bw.close();
    }
}
