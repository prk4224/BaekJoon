package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek_j_14888 {
    static int N;
    static int input[];
    static int oper[];
    static int max = Integer.MIN_VALUE;
    static int min = Integer.MAX_VALUE;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        input = new int[N];
        for(int i = 0; i < N; i++){
            input[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        oper = new int[4];

        for(int i = 0; i < 4; i++){
            oper[i] = Integer.parseInt(st.nextToken());
        }

        bt(1,input[0]);

        System.out.println(max);
        System.out.println(min);


    }
    public static void bt(int cut, int sum){
        if(N == cut){

            max = Math.max(max,sum);
            min = Math.min(min,sum);
            return;
        }
        for(int i = 0; i < 4; i++){
            if(oper[i] <= 0) continue;

            oper[i]--;

            switch (i){
                case 0 : bt(cut+1, sum + input[cut]);
                    break;
                case 1 : bt(cut+1, sum - input[cut]);
                    break;
                case 2 : bt(cut+1, sum * input[cut]);
                    break;
                case 3 : bt(cut+1, sum / input[cut]);
                    break;
            }
            oper[i]++;
        }
    }
}
