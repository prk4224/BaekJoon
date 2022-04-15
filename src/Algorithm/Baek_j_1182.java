package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baek_j_1182 {
    static int N;
    static int S;
    static int input[];
    static int cut = 0;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        S = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        input = new int[N];
        for(int i = 0; i < N; i++){
            input[i] = Integer.parseInt(st.nextToken());
        }

        dfs(0,0);

        if(S==0){// count 합이 0인 경우 공집합도 포함되므로 그 수를 하나 빼주고 출력
            cut--;
            System.out.println(cut);
        }else {
            System.out.println(cut);
        }
    }
    private static void dfs(int v , int sum){
        if(v==N){// dfs로 돌며 누적시키다가 위치를 나타내는 v이 마지막 위치로 오면 원하는 값인지 아닌지 체크하여 count
            if(sum == S){
                cut++;
            }
            return;
        }
        // 부분수열, 지금 위치의 원소를 선택하거, 선택하지 않거나
        dfs(v+1, sum+input[v]); // 지금 위치의 원소를 선택
        dfs(v+1, sum); // 선택하지 않음.
    }
}

