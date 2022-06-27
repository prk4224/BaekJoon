package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baek_j_15903 {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int gameCnt = Integer.parseInt(st.nextToken());
        long cardList[] = new long[N];
        st = new StringTokenizer(br.readLine());

        for(int i = 0; i < N; i++){
            cardList[i] = Integer.parseInt(st.nextToken());
        }

        if(N == 2){
            for(int i = 0; i < gameCnt; i++){
                long sum = cardList[0] + cardList[1];

                cardList[0] = sum;
                cardList[1] = sum;
            }

        }
        else {
            Arrays.sort(cardList);

            for (int i = 0; i < gameCnt; i++) {
                if (cardList[1] > cardList[2]) Arrays.sort(cardList);
                long sum = cardList[0] + cardList[1];

                cardList[0] = sum;
                cardList[1] = sum;
            }
        }

        long result = 0;

        for(long val : cardList){
            result += val;
        }

        System.out.print(result);
    }
}
