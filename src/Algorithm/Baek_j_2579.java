package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek_j_2579 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int input[] = new int[N+1];
        int dp[] = new int[N+1];

        for(int i = 1; i <= N; i++){
            input[i] = Integer.parseInt(br.readLine());
        }

        dp[1] = input[1];

        if(N >= 2) dp[2] = input[1]+input[2];

        for(int i = 3; i <= N; i++){
            dp[i] = Math.max(dp[i-2],dp[i-3]+input[i-1]) + input[i];
        }

        System.out.println(dp[N]);

        
    }
}
