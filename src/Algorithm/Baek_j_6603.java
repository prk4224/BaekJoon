package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek_j_6603 {
    static int N;
    static int input[];
    static boolean vi[];
    static StringBuilder sb;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            StringTokenizer st = new StringTokenizer(br.readLine());
            sb = new StringBuilder();
            N = Integer.parseInt(st.nextToken());

            if(N == 0) break;
            input = new int[N];
            vi = new boolean[N];
            int arr[] = new int[6];

            for(int i = 0; i < N; i++){
                input[i] = Integer.parseInt(st.nextToken());
            }

            dfs(0,arr);

            System.out.println(sb);

        }
    }

    public static void dfs(int dep,int arr[]){
        if(dep == 6){
            for(int var : arr){
                sb.append(var).append(" ");
            }
            sb.append('\n');
            return;
        }

        for(int i = 0; i < N; i++){
            if( dep == 0 || (!vi[i] && arr[dep-1] < input[i])){
                vi[i] = true;
                arr[dep] = input[i];
                dfs(dep+1,arr);
                vi[i] = false;
            }
        }
    }
}
