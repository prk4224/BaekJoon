package Algorithm;

import java.io.*;

public class Baek_j_2193 {
    static long dp[][];
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        br.close();

        dp = new long[N+1][2];
        dp[1][0] = 0;
        dp[1][1] = 1;

        for(int i = 2; i <= N; i++){
            dp[i][1] = pinary(i,1);
            dp[i][0] = pinary(i,0);
        }

        long result = dp[N][0] + dp[N][1];

        bw.write(result+"");
        bw.flush();
        bw.close();

    }
    public static long pinary(int dig, int var){

        if(dig == 1){
            return dp[dig][var];
        }
        if(dp[dig][var] == 0){
            if(var == 1){
                dp[dig][var] = pinary(dig-1, 0);
            }
            else {
                dp[dig][var] = pinary(dig-1, 1) + pinary(dig-1, 0);
            }
        }
        return dp[dig][var];
    }
}
