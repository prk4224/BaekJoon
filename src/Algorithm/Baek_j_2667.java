package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Baek_j_2667 {

    public static int map[][];
    public static boolean visited[];
    public static int N;
    public static int cut[];
    public static int result = 0;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        map = new int[N+1][N+1];

        for(int i = 0; i < N; i++){
            String str = br.readLine();
            for(int j = 0; j < N; j++){
                map[i+1][j+1] = Integer.parseInt(String.valueOf(str.charAt(j)));
            }
        }

        cut = new int[626];
        for(int i = 1; i < N+1; i++){
            for(int j = 1; j < N+1; j++){
                if(dfs(i,j)){
                    result++;
                }
            }
        }
        int cut_1[] = new int[result];

        for(int i = 0; i < result; i++){
            cut_1[i] = cut[i];
        }
        Arrays.sort(cut_1);

        System.out.println(result);
        for(int i = 0; i < cut_1.length; i++){
            System.out.println(cut_1[i]);
        }
    }

    public static boolean dfs(int x, int y){

        if(x <= 0 || x > N || y <= 0 || y > N){
            return false;
        }

        if(map[x][y] == 1){
            map[x][y] = 0;
            cut[result]++;

            dfs(x-1,y);
            dfs(x+1, y);
            dfs(x,y-1);
            dfs(x,y+1);
            return true;
        }
        return false;
    }

}
