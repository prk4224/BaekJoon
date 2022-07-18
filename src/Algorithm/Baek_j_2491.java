package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek_j_2491 {
    public static void main() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int input[] = new int[N];

        for(int i = 0; i < N; i++){
            input[i] = Integer.parseInt(st.nextToken());
        }


    }
}
