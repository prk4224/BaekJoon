package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baek_j_2805 {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int target = Integer.parseInt(st.nextToken());
        long input[] = new long[N];
        st = new StringTokenizer(br.readLine());

        for(int i = 0; i < N; i++){
            input[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(input);
        long result = input[N-1];

        if(target == 0) {
            System.out.println(result);
            return;
        }

        while (result >= 0){
            result--;
            long sum = 0;
            for(int i = N-1; i >= 0; i--){
                if(input[i] <= result) break;
                else sum += (input[i] - result);
            }

            if(sum >= target) {
                break;
            }
        }
        System.out.println(result);

    }
}
