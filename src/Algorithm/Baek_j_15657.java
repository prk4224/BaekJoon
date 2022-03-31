package Algorithm;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baek_j_15657 {
    public static int N;
    public static int M;
    public static int arr[];
    public static int input[];
    public static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M =Integer.parseInt(st.nextToken());
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        input = new int[N];
        for(int i = 0; i < N; i++){
            input[i] = Integer.parseInt(st1.nextToken());
        }
        Arrays.sort(input);
        br.close();
        arr = new int[M+1];

        dfs(1);

        bw.write(sb+"");
        bw.flush();
        bw.close();

    }

    public static void dfs(int dep){

        if(dep == M+1){
            for(int i = 1; i < arr.length; i++){
                sb.append(arr[i]).append(" ");
            }
            sb.append('\n');
            return;
        }

        for(int i = 1; i <= N; i++){
            if(arr[dep-1] <= input[i-1]){
                arr[dep] = input[i-1];
                dfs(dep+1);
            }
        }
        return;
    }
}
