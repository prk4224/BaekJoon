package Algorithm;

import java.io.*;
import java.util.*;

public class Baek_j_15654 {

    public static int N;
    public static int M;
    public static boolean vi[];
    public static int arr[];
    public static int input[];
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException{

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
        Arrays.sort(input);
        vi = new boolean[N];
        arr = new int[M];

        dfs(0);

        bw.write(sb+"");
        bw.flush();
        bw.close();

    }

    public static void dfs(int dep){

        if(dep == M){
            for(int var : arr){
                sb.append(var).append(" ");
            }
            sb.append('\n');
            return;
        }
        for(int i = 0; i < N; i++){
            if(!vi[i]){
                vi[i] = true;
                arr[dep] = input[i];
                dfs(dep+1);
                vi[i] = false;
            }
        }
        return;
    }
}
