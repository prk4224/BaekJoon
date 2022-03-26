package Algorithm;

import java.io.*;
import java.util.Arrays;

public class Baek_j_10989 {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int input[] = new int[10001];

        for(int i = 0; i<N; i++){
            input[Integer.parseInt(br.readLine())]++;
        }
        br.close();

        for(int i = 0; i < 10001; i++){

            while (input[i]>0){
                sb.append(i).append('\n');
                input[i]--;
            }
        }

        bw.write(sb+"");
        bw.flush();
        bw.close();
    }
}
