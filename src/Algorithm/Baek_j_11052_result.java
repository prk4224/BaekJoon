package Algorithm;

import java.io.*;
import java.util.StringTokenizer;

public class Baek_j_11052_result {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int value[] = new int[N+1];
        int dp[] = new int[N+1];

        for(int i = 1; i <= N; i++){
            value[i] = Integer.parseInt(st.nextToken());
        }

        br.close();
        for(int i =1; i <= N; i++){
            for(int j = 1; j <= i; j++){
                dp[i] = Math.max(dp[i], dp[i-j] + value[j]);
            }
        }

        bw.write(dp[N] + "");
        bw.flush();
        bw.close();
    }
}
