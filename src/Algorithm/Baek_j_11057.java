package Algorithm;

import java.io.*;

public class Baek_j_11057 {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        long dp[][] = new long[N+1][11];

        for(int i = 1; i <= 10; i++){
            dp[1][i] = i;
        }

        for(int i = 2; i <= N; i++){
            for(int j = 1; j <= 10; j++){

                dp[i][j] = (dp[i-1][j] + dp[i][j-1])%10007;
            }
        }

//        for(int i = 2; i <= N; i++){
//            long value = dp[i-1][0];
//            for(int j = 1; j <= 10; j++){
//                dp[i][0] += value%10007 ;
//                dp[i][j] = value ;
//                value = value - dp[i-1][j];
//
//            }
//        }
        bw.write(dp[N][10] + "");
        bw.flush();
        bw.close();

    }
}
