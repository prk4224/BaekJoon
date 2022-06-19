package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Baek_j_2012 {
    public static void main(String[] agrs) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int expectationRank[] = new int[N];
        int rank[] = new int[N];

        for(int i = 0; i < N; i++){
            expectationRank[i] = Integer.parseInt(br.readLine());
            rank[i] = i + 1;
        }

        Arrays.sort(expectationRank);

        long min = 0;


        for(int i = 0; i < N; i++){
            // 원래 등수와 다를 경우 예상등수의 차이만큼을 최소값에 더해준다.
            if(expectationRank[i] != rank[i]){
                min += Math.abs(expectationRank[i]-rank[i]);
            }
        }

        System.out.print(min);
    }
}
