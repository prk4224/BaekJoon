package Algorithm;

import java.io.*;
import java.util.*;

public class Beak_j_14501 {

    public static int input[][];
    public static int N;
    public static int max;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        N = Integer.parseInt(br.readLine());
        input = new int[N][2];


        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            input[i][0] = Integer.parseInt(st.nextToken());
            input[i][1] = Integer.parseInt(st.nextToken());
        }
        br.close();


//        dfs(0,0);

        int dp[] = new int[N+1];

        for(int i = 0; i < N; i++){
            if(i + input[i][0] <= N){ // 현재 위치 + 시간이 퇴사일 이하 일때
                dp[i+input[i][0]] = Math.max(dp[i + input[i][0]], dp[i] + input[i][1]);
                // 이동한 한 값과 현재위치 값을 더한 값 중 큰 값 : 현재값을 선택 여부를 판단하기 위함
            }

            dp[i+1] = Math.max(dp[i],dp[i+1]);
            // 현재 위치+시간이 퇴사일 보다 클 경우 이동할수 없음으로 현재 위치와 다음 위치중 큰 값을 다음 위치에 할당
        }


        bw.write(dp[N]+"");
        bw.flush();
        bw.close();


    }

//    public static void dfs(int T,int sum){
//
//        if(T  >= N){ //
//            max = Math.max(sum,max);
//            return;
//        }
//        if( T + input[T][0] <= N){
//            dfs(T+input[T][0],sum+input[T][1]);
//        }
//        else {
//            dfs(T + input[T][0], sum);
//        }
//        dfs(T+1, sum);
//
//    }
}
