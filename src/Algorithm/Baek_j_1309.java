package Algorithm;

import java.io.*;

public class Baek_j_1309 {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
         // 사자의 최대 마리수
        br.close();

        long dp[] = new long[N+1];
        dp[0] = 1;
        dp[1] = 3;
        for(int i = 2; i <= N; i++){
            dp[i] = (dp[i-1]*2 + dp[i-2])%9901;
        }

        bw.write(dp[N] +"");
        bw.flush();
        bw.close();
    }
}
