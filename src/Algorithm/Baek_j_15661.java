package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baek_j_15661 {
    public static int N;
    public static int input[][];
    public static boolean vi[];
    public static int min = Integer.MAX_VALUE;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        N = Integer.parseInt(br.readLine());
        input = new int[N][N];
        vi = new boolean[N];


        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j < N; j++){
                input[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int i = 1; i <= N/2; i++){
            dfs(i,0,0);
            Arrays.fill(vi,false);
        }
        System.out.println(min);
    }

    public static void dfs(int target, int idx, int dep){
        if(dep == target){
            diff();
            return;
        }
        for(int i = idx; i < N; i++){
            if(!vi[i]){
                vi[i] = true;
                dfs(target,i+1,dep+1);
                vi[i] = false;
            }
        }
    }

    public static void diff(){
        int star = 0;
        int link = 0;

        for(int i = 0; i < N-1; i++){
            for(int j = i+1; j < N; j++){
                if(vi[i] && vi[j]){
                    star += input[i][j];
                    star += input[j][i];
                }
                else if(!vi[i] && !vi[j]){
                    link += input[i][j];
                    link += input[j][i];
                }
            }
        }
        int temp = Math.abs(star - link);

        if(temp == 0){
            System.out.println(0);
            System.exit(0);
        }

        min = Math.min(min,temp);
    }
}
