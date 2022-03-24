package Algorithm;

import java.io.*;
import java.util.StringTokenizer;

public class Baek_j_1149 {
    static int dp[][];
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        dp = new int[N+1][3];


        for(int i =1; i <= N; i++){

            StringTokenizer st = new StringTokenizer(br.readLine());

            for(int j = 0; j < 3; j++){
                dp[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        br.close();


        for(int i = 2; i <= N; i++){

            dp[i][0] += Math.min(dp[i-1][1],dp[i-1][2]);
            dp[i][1] += Math.min(dp[i-1][0],dp[i-1][2]);
            dp[i][2] += Math.min(dp[i-1][0],dp[i-1][1]);

        }

        int result = Math.min(dp[N][0],Math.min(dp[N][1],dp[N][2]));
        bw.write(result + "");
        bw.flush();
        bw.close();
    }
}
