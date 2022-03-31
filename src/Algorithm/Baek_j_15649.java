package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek_j_15649 {

    public static boolean vi[];
    public static int arr[];
    public static int N;
    public static int M;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        vi = new boolean[N];
        arr = new int [M];

        dfs(0);


    }

    public static void dfs(int dep){

        if(dep == M){
            for(int var : arr){
                System.out.print(var + " ");
            }
            System.out.println();
            return;
        }

        for(int i = 0; i < N; i++){

            if(!vi[i]){
                vi[i] = true;
                arr[dep] = i +1;
                dfs(dep+1);
                vi[i] = false;
            }
        }
        return;
    }
}
