package Algorithm;

import java.io.*;
import java.util.*;

public class Baek_j_15652 {
    public static int N;
    public static int M;
    public static int arr[];
    public static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M =Integer.parseInt(st.nextToken());
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
            if(arr[dep-1] <= i){
                arr[dep] = i;
                dfs(dep+1);
            }
        }
        return;
    }
}
