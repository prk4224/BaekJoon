package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek_j_17103 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        for(int i = 0; i < N; i++){

            int cut = 0;
            int num = Integer.parseInt(br.readLine());
            for(int j = 2; j <= num/2; j++){
                if(prime(j) && prime(num-j)){
                    cut++;
                }
            }
            sb.append(cut).append('\n');
        }
        System.out.print(sb);
    }
    public static boolean prime(int num){

        for(int i = 2; i <= Math.sqrt(num); i++){
            if(num%i == 0) return false;
        }

        return true;
    }
}
// 시간 초과
