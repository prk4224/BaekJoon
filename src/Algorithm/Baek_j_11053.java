package Algorithm;

import java.io.*;
import java.util.StringTokenizer;

public class Baek_j_11053 {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int input[] = new int[N];

        for(int i = 0; i < N; i++){
            input[i] = Integer.parseInt(st.nextToken());
        }

        int dp[] = new int[N];

        for(int i = 0; i < N; i++){
            dp[i] = 1;
            for(int j = 0; j < i; j++){
                if(input[j] < input[i] && dp[i] < dp[j] + 1){
                    dp[i] = dp[j] + 1;
                }
            }
        }
        int max = -1;
        for(int i : dp){
            max = i > max ? i : max;
        }
        bw.write(max + "");
        bw.flush();
        bw.close();
    }
}
