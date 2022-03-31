package Algorithm;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baek_j_15656 {

    public static int N;
    public static int M;
    public static StringBuilder sb = new StringBuilder();
    public static int arr[];
    public static int input[];

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        input = new int[N];
        for(int i = 0; i < N; i++){
            input[i] = Integer.parseInt(st1.nextToken());
        }
        br.close();
        arr = new int[M];
        Arrays.sort(input);


        dfs(0);

        bw.write(sb +"");
        bw.flush();
        bw.close();
    }

    public static void dfs(int dep) {
        if (dep == M) {
            for (int var : arr) {
                sb.append(var).append(" ");
            }
            sb.append('\n');
            return;
        }

        for (int i = 0; i < N; i++) {
            arr[dep] = input[i];
            dfs(dep + 1);

        }
        return;
    }
}
