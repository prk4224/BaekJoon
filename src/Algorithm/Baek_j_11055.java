package Algorithm;

import java.io.*;
import java.util.StringTokenizer;

public class Baek_j_11055 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int input[] = new int[N+1];

        for(int i = 1; i <= N; i++){
            input[i] = Integer.parseInt(st.nextToken());
        }

        br.close();
        int dp[] = new int[N+1];

        for(int i = 1; i <=N; i++){
            dp[i] = input[i];

            for(int j = 1; j < i; j++){
                if(input[i] > input[j] ){
                    dp[i] = Math.max(dp[j]+input[i], dp[i]);
                }
            }

        }

        int max = 0;

        for(int i = 1; i <= N; i++){
            max = Math.max(max,dp[i]);
        }

        bw.write(max +"");
        bw.flush();
        bw.close();
    }
}
