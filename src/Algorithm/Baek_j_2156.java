package Algorithm;

import java.io.*;

public class Baek_j_2156 {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int input[] = new int[10001];
        int dp[] = new int[10001];

        for(int i = 1; i <= N; i++){
            input[i] = Integer.parseInt(br.readLine());
        }
        br.close();

        dp[1] = input[1];
        dp[2] = dp[1] + input[2];

        for(int i = 3; i <= N; i++){
            dp[i] =  Math.max(input[i] + input[i-1] + dp[i-3] , Math.max( input[i] + dp[i-2] , dp[i-1]));
            // i 값을 선택하는 경우 2가지와 선택안하는 경우 1가지 중 가장 큰 값
        }
        bw.write(dp[N] + "");
        bw.flush();
        bw.close();

    }
}
