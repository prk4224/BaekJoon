package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek_j_1074 {
    static int result = 0;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int size = (int) Math.pow(2,N);
        find(size,r,c);
        System.out.println(result);

    }
    public static void find(int size, int r, int c){
        if(size == 0){
            return ;
        }
        int half = size/2;

        // 찾고자 하는 위치가 1 사분면에 있을경우
        if(r < half && c < half) find(size/2,r,c);

        // 찾고자 하는 위치가 2 사분면에 있을경우
        else if(r < half && c >= half) {
            result += half*half;
            find(size/2,r,c-half);
        }

        // 찾고자 하는 위치가 3 사분면에 있을경우
        else if(r >= half && c < half) {
            result += 2*half*half;
            find(size/2,r-half,c);
        }

        // 찾고자 하는 위치가 4 사분면에 있을경우
        else {
            result += 3 * half * half;
            find(size / 2, r - half, c - half);
        }
    }
}
