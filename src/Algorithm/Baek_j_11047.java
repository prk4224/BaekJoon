package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek_j_11047 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int tp = Integer.parseInt(st.nextToken());
        int won[] = new int[N];


        for(int i = 0; i < N; i++){
            won[i] = Integer.parseInt(br.readLine());
        }

        int cnt = 0;
        int i = N-1;

        while(tp > 0){
            if(won[i] > tp){
                i--;
                continue;
            }
            else{
                cnt++;
                tp = tp - won[i];
            }
        }

        System.out.println(cnt);
    }
}
