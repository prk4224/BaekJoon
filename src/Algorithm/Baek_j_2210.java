package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek_j_2210 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int input[][] = new int[5][5]

        for(int i = 0; i < 5; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j < 5; j++){
                input[i][j] = Integer.parseInt(st.nextToken());
            }
        }

    }
}
