package Algorithm;

import java.io.*;

public class Baek_j_10844_result {

    static long dp[][];
    static int N;
    static final long MOD = 1_000_000_000;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        N = Integer.parseInt(br.readLine());
        br.close();
        dp = new long[N+1][10];

        for(int i = 0; i < 10; i++){
            dp[1][i] = 1;
        }

        long result = 0;
        for(int i = 1; i < 10; i++){
            result += resur(N,i);
        }

        bw.write(result%MOD + "");
        bw.flush();
        bw.close();

    }
    public static long resur(int dig, int val){

        if(dig == 0){
            return dp[dig][val];
        }

        if(dp[dig][val] == 0){
            if(val == 0){
                dp[dig][val] = resur(dig-1,1);
            }
            else if(val == 9){
                dp[dig][val] = resur(dig-1,8);
            }
            else{
                dp[dig][val] =  (resur(dig-1,val-1) + resur(dig-1,val+1));
            }
        }
        return dp[dig][val] % MOD;
    }
}
