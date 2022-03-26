package Algorithm;

import java.io.*;
import java.util.StringTokenizer;

public class Baek_j_13398 {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int input[] = new int[N+1];
        int dp[] = new int[N+1];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 1; i <= N; i++){
            input[i] = Integer.parseInt(st.nextToken());
        }
        br.close();

        dp[1] = input[1];
        int max = input[1];
        int num = 0;

        for (int i = 2; i <= N; i++){
            if(input[i] >= num) {
                dp[i] = Math.max(dp[i - 1] + input[i], input[i]);
                max = Math.max(max, dp[i]);
            }
            else{
                dp[i] = dp[i-1] + num;
                num = input[i];
            }
        }
        bw.write(max + "");
        bw.flush();
        bw.close();
    }
}
