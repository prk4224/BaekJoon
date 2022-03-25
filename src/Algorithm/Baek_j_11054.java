package Algorithm;

import java.io.*;
import java.util.StringTokenizer;

public class Baek_j_11054 {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int input[] = new int[N+1];
        int dp[][] = new int[N+1][2];
        int result[] = new int[N+1];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 1; i <=N; i++){
            input[i] = Integer.parseInt(st.nextToken());
        }
        br.close();

        for(int i = 1; i <=N; i++){
            dp[i][0] = 1;
            for(int j = 1; j <=i; j++){
                if(input[i] > input[j]) {
                    dp[i][0] = Math.max(dp[j][0]+1,dp[i][0]);
                }
            }
        }

        for(int i = N; i >= 1; i--){
            dp[i][1] = 0;
            for(int j = N; j >= i; j--){
                if(input[i] > input[j]){
                    dp[i][1] = Math.max(dp[j][1] + 1, dp[i][1]);
                }
            }
            result[i] = dp[i][0] + dp[i][1];
        }

        int max = result[1];
        for(int i = 1; i <=N; i++){
            max = Math.max(max, result[i]);
        }



        bw.write(max +"");
        bw.flush();
        bw.close();

    }
}
