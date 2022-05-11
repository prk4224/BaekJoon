package Algorithm;

import java.io.*;
import java.util.*;

public class Baek_j_15651 {

    public static int N;
    public static int M;
    public static StringBuilder sb = new StringBuilder();
    public static int arr[];

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        br.close();
        arr = new int[M];

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
            arr[dep] = i + 1;
            dfs(dep + 1);

        }
        return;
    }
}
