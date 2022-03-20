package Algorithm;

import java.io.*;

public class Baek_j_9095 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++){

            int num = Integer.parseInt(br.readLine());

            int dp[] =new int[num+3];

            dp[0] = 1;
            dp[1] = 2;
            dp[2] = 4;

            for(int j = 3; j < num; j++){
                dp[j] = dp[j-1] + dp[j-2] + dp[j-3];
            }

            bw.write(dp[num-1] + "\n");
            bw.flush();

        }
        bw.close();
        br.close();
    }
}
