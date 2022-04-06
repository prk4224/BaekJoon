package Algorithm;

import java.io.*;
import java.util.StringTokenizer;

public class Baek_j_14889 {
    public static int min = Integer.MAX_VALUE;
    public static int input[][];
    public static int N;
    public static int check[];
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        input = new int[N][N];
        check = new int[N];

        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j < N; j++){
                input[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        br.close();

        dfs(0,0);

        System.out.println(min);


    }
    public static void dfs(int ind, int dep){

        // 2개의 그룹이라 팀의 인원수는 전체 인원의 2분의 1이다.
        if(dep == (N/2)){
            // 팁의 인원수가 만족되면 두 그룹의 차이의 최솟값을 찾기 위해 Min 함수 호출
            Min();
            return;
        }

        for(int i = ind; i < N; i++){
            if(check[i] == 0){
                check[i] = 1;

                // 나올 수 있는 모든 경우의 수를 1 로 만든다.
                // (팀을 구성할때 ,1 과 0를 기준으로 팀을 구성할 수 있다)
                dfs(i+1,dep+1);
                check[i] = 0;
            }
        }
    }

    public static void Min(){

        int s_Group = 0;
        int l_Group = 0;

        for(int i  = 0 ; i < N-1; i++){
            for(int j = i+1; j < N; j++){
                // vi가 1 dl면 Start 팀
                if(check[i] == 1 && check[j] == 1){
                    s_Group += input[i][j];
                    s_Group += input[j][i];
                }
                // vi가 0 이면 Link 팀
                else if(check[i] == 0 && check[j] == 0){
                    l_Group += input[i][j];
                    l_Group += input[j][i];
                }
            }
        }

        // 두 그룹의 차이
        int temp = Math.abs(s_Group - l_Group);

        // 차이 값이 0이면 더이상 프로그램을 수행할 필요가 없다
        // 바로 프로그램 종료
        if(temp == 0){
            System.out.print(0);

            System.exit(0);
        }
        // 아니면 min과 temp중 작은값을 min에 할당

        min = Math.min(min,temp);

    }
}
