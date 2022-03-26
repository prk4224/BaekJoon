package Algorithm;

import java.io.*;
import java.util.StringTokenizer;

public class Baek_j_13398_result {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int input[] = new int[N+1];
        int dp[][] = new int[N+1][2];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 1; i <= N; i++){
            input[i] = Integer.parseInt(st.nextToken());
        }
        br.close();

        dp[1][0] = 0;
        dp[1][1] = input[1];
        int max = dp[1][1];

        for (int i = 2; i <= N; i++) {
            dp[i][0] = Math.max(dp[i - 1][0] + input[i], dp[i - 1][1]);
            dp[i][1] = Math.max(dp[i - 1][1] + input[i], input[i]);
            max = Math.max(max, Math.max(dp[i][0], dp[i][1]));
        }

        bw.write(max + "");
        bw.flush();
        bw.close();
    }
}
