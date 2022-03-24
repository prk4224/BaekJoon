package Algorithm;

import java.io.*;
import java.util.StringTokenizer;

public class Baek_j_1932 {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int input[][] = new int[N+1][N+1];

        for(int i = 1; i <= N; i++){

            StringTokenizer st= new StringTokenizer(br.readLine());
            int size = st.countTokens();
            for(int j = 1; j <= size; j++) {
                input[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        br.close();

        for(int i = N; i > 1; i--){

            for(int j = 1; j < i; j++){
                input[i-1][j] += Math.max(input[i][j], input[i][j+1]);
            }

        }

        bw.write(input[1][1] +"\n");
        bw.flush();
        bw.close();
    }
}
