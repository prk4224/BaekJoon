package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek_j_9663 {
    static int N;
    static int result = 0;
    static boolean vi1[];
    static boolean vi2[];
    static boolean vi3[];
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        vi1 = new boolean[N];
        vi2 = new boolean[2*N - 1];
        vi3 = new boolean[2*N - 1];

        bt(0);

        System.out.println(result);
    }
    public static void bt(int cut){
        if(cut == N){
            result++;
            return;
        }
        for(int i = 0; i < N; i++){
            if(vi1[i] || vi2[i+cut] || vi3[cut-i + (N-1)]) continue;

            vi1[i] = true;
            vi2[i+cut] = true;
            vi3[cut-i + (N-1)] = true;
            bt(cut+1);
            vi1[i] = false;
            vi2[i+cut] = false;
            vi3[cut-i + (N-1)] = false;
        }
    }
}
