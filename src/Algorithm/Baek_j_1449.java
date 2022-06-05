package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek_j_1449 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 구멍난 갯수
        int N = Integer.parseInt(st.nextToken());
        // 테이프의 길이
        int t_leng = Integer.parseInt(st.nextToken());
        // 구멍난 위치
        int h_loc[] = new int[N];

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            h_loc[i] = Integer.parseInt(st.nextToken());
        }


    }
}
