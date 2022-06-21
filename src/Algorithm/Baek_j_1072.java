package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek_j_1072 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long gameCnt = Integer.parseInt(st.nextToken());
        long winCnt = Integer.parseInt(st.nextToken());

        long target = winCnt*100/gameCnt ;


        if(target >= 99){
            System.out.print(-1);
        }
        else {
            long start = 0;
            long end = 1_000_000_000;

            while(start < end){

                long mid  = (start+end)/2;
                long odds = (winCnt+mid)*100/(gameCnt+mid);

                if(odds > target){
                   end = mid;
                }
                else start = mid+1;
            }
            System.out.println(end);
        }

        long cnt = 0;

        while(true){
            winCnt ++;
            gameCnt++;
            cnt++;
            if(target < winCnt *100/gameCnt){
                break;
            }
        }
        System.out.println(target);
        System.out.print(cnt);
    }
}
