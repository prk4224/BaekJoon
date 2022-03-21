package Algorithm;

import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class Baek_j_14002 {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int input[] = new int[N];

        for(int i = 0; i < N; i++){
            input[i] = Integer.parseInt(st.nextToken());
        }

        int dp[] = new int[N];
        boolean index[] = new boolean[N];

        for(int i = 0; i < N; i++){
            dp[i] = 1;
            for(int j = 0; j < i; j++){
                if(input[j] < input[i] && dp[i] < dp[j] + 1){
                    dp[i] = dp[j] + 1;
                }
            }
        }
        int max = -1;
        for(int i = 0 ; i < N; i++){
            if(dp[i] > max){
                max = dp[i];
            }
        }
        sb.append(max).append('\n');

        Stack<Integer> stack = new Stack<>();

        for(int i = N-1; i >=0; i--){
            if(dp[i] == max){
                stack.push(input[i]);
                max--;
            }
        }
        while(!stack.empty()){
            sb.append(stack.pop() + " ");
        }

        bw.write(sb+"");
        bw.flush();
        bw.close();
    }
}
