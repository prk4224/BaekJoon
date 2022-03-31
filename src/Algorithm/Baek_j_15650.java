package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek_j_15650 {
    public static boolean vi[];
    public static int arr[];
    public static int N;
    public static int M;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        vi = new boolean[N];
        arr = new int[M+1];

        dfs(1);

    }
    public static void dfs(int d){


        if( M+1 == d ){
            for(int i = 1;  i< arr.length; i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            return;
        }

        for(int i = 0; i < N; i++){

            if(!vi[i] && arr[d-1] < i+1){
                vi[i] = true;
                arr[d] = i + 1;
                dfs(d+1);
                vi[i] = false;
            }
        }
        return;
    }
}
