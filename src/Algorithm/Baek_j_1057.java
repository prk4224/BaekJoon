package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek_j_1057 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int per01 = Integer.parseInt(st.nextToken());
        int per02 = Integer.parseInt(st.nextToken());
        int cnt = 0;

        while(true){
            cnt++;
            if(per01 % 2 == 1) per01++;
            if(per02 % 2 == 1) per02++;

            if(per01 == per02){
                break;
            }

            per01 /= 2;
            per02 /= 2;
        }
        System.out.println(cnt);
    }
}
