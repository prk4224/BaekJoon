package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/*
그리디 문제 : 순서대로 진행해서 문자가 일치하지 않으면 바꾼다. 그럼 그 자리 값이 같게 고정이 됨
 */
public class Baek_j_1080 {
    public static String[] strArr;
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        strArr = new String[N];
        String[] targetArr = new String[N];

        int result = 0;

        for(int i = 0; i < N; i++){
            strArr[i] = br.readLine();
        }

        for(int i = 0; i < N; i++){
            targetArr[i] = br.readLine();
        }

        // N,M이 3보다 작으면 트레이드가 이루워지지 않기 때문에 행렬을 비교해서 같으면 0, 다르면 1을 출력하도촉 한다.
        if(N < 3 || M < 3){
            for(int i = 0; i < N; i++){
                for(int j = 0; j < M; j++){
                    if(strArr[i].charAt(j) != targetArr[i].charAt(j)){
                        System.out.print(-1);
                        return ;
                    }
                }
            }
            System.out.print(0);
            return;
        }

        // 해당 자리 값을 비교했을때 바르면 트레이드를 진행한다.
        for(int i = 0; i < N-2; i++){
            for(int j = 0; j < M-2; j++){
                if(strArr[i].charAt(j) != targetArr[i].charAt(j)){
                    change(i,j);
                    result++;
                }
            }
        }

        // 비교가는 행령의 위치가 3 보다 작으면 트레이드가 이루워 지지 않기 때문에 3 이하의 값 아
        for(int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (strArr[N-i-1].charAt(M-j-1) != targetArr[N-i-1].charAt(M-j-1)) {
                    System.out.print(-1);
                    return;
                }
            }
        }
        System.out.print(result);
    }

    // 3x3 행령 만큼 바꾸는 함수
    public static void change(int N, int M){

        for(int i = 0 ; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if(strArr[N+i].charAt(M+j) == '1'){
                    strArr[N+i] = strArr[N+i].substring(0,M+j) + '0' + strArr[N+i].substring(M+j+1);
                }
                else {
                    strArr[N+i] = strArr[N+i].substring(0,M+j) + '1' + strArr[N+i].substring(M+j+1);
                }
            }
        }
    }
}
