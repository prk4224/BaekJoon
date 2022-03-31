package Algorithm;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baek_j_15655 {
    public static boolean vi[];
    public static int arr[];
    public static int N;
    public static int M;
    public static int input[];
    public static StringBuilder sb = new StringBuilder();

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

        Arrays.sort(input);
        vi = new boolean[N];
        arr = new int[M+1];

        dfs(1);

        bw.write(sb+"");
        bw.flush();
        bw.close();

    }
    public static void dfs(int d){


        if( M+1 == d ){
            for(int i = 1;  i< arr.length; i++){
                sb.append(arr[i]).append(" ");
            }
            sb.append('\n');
            return;
        }

        for(int i = 0; i < N; i++){

            if(!vi[i] && arr[d-1] < input[i]){
                vi[i] = true;
                arr[d] = input[i];
                dfs(d+1);
                vi[i] = false;
            }
        }
        return;
    }
}
