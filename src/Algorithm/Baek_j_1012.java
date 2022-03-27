package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek_j_1012 {
    public static int map[][];
    public static int n;
    public static int m;
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());
            m = Integer.parseInt(st.nextToken());
            int num = Integer.parseInt(st.nextToken());

            map = new int[n][m];

            for(int j = 0; j < num; j++){
                StringTokenizer st1 = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st1.nextToken());
                int b = Integer.parseInt(st1.nextToken());

                map[a][b] = 1;
            }
            int result = 0;
            for(int j = 0; j < n; j++){
                for(int k = 0; k < m; k++){
                    if(dfs(j,k)){
                        result++;
                    }
                }
            }
            System.out.println(result);
        }
    }

    public static boolean dfs(int x, int y){

        if(x <= -1 || x >= n || y <=-1 || y >= m){
            return false;
        }
        if(map[x][y] == 1){
            map[x][y] = 0;

            dfs(x-1, y);
            dfs(x+1, y);
            dfs(x, y-1);
            dfs(x, y+1);
            return true;
        }
        return false;
    }
}
