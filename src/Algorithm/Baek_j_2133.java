package Algorithm;

import java.io.*;

public class Baek_j_2133 {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int dp[] = new int[31];

        dp[0] = 1;
        dp[2] = 3;

        for(int i = 4; i <=N; i++){
            if(i%2 == 1){
                dp[i] = 0;
            }
            else {
                for(int j = i-4; j >= 0; j-=2){
                    dp[i] += dp[j]*2;
                }
                dp[i] += dp[i-2]*3;
            }
        }

        bw.write(dp[N] +"");
        bw.flush();
        bw.close();
    }
}
