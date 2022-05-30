package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek_j_1904 {
    static int N;
    static int cnt = 0;
    static final int MOD = 15746;
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());


    }
    public static void bt(int dep){
        if(N == dep){
            cnt++;
            return;
        }


    }
}
