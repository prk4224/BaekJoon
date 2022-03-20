package Algorithm;

import java.io.*;

//1 3 5 11 21 43 85 171 341 683 1365 2731
public class Baek_j_11727 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        br.close();

        int dp[] = new int[N+2];

        dp[0] = 1;
        dp[1] = 3;

        for(int i = 2; i < N; i++){
            dp[i] = (dp[i-1] + 2*(dp[i-2]))%10007;
        }

        bw.write(dp[N-1]%10007 +"");
        bw.flush();
        bw.close();
    }
}
