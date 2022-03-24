package Algorithm;

import java.io.*;
import java.util.StringTokenizer;

public class Baek_j_9465 {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++){
            int size = Integer.parseInt(br.readLine());
            StringTokenizer st_1 = new StringTokenizer(br.readLine());
            StringTokenizer st_2 = new StringTokenizer(br.readLine());

            int input[][] = new int[size+1][2];

            for(int j = 1; j <=size; j++){
                input[j][0] = Integer.parseInt(st_1.nextToken());
                input[j][1] = Integer.parseInt(st_2.nextToken());
            }
            int dp[][] = new int[size+1][2];
            dp[1][0] = input[1][0];
            dp[1][1] = input[1][1];

            for(int j = 2; j <= size; j++){

                dp[j][0] = Math.max(dp[j-1][1], dp[j-2][1]) + input[j][0];
                dp[j][1] = Math.max(dp[j-1][0], dp[j-2][0]) + input[j][1];

            }

            int result = Math.max(dp[size][0], dp[size][1]);

            bw.write(result + "\n");
            bw.flush();

        }
        bw.close();
        br.close();
    }
}
