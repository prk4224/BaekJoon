package Algorithm;

import org.w3c.dom.ls.LSOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

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

        for(int i = 0; i < N-2; i++){
            for(int j = 0; j < M-2; j++){
                if(strArr[i].charAt(j) != targetArr[i].charAt(j)){
                    change(i,j);
                    result++;
                }
            }
        }



        if(strArr[N-2].charAt(M-1) == targetArr[N-2].charAt(M-1)){
            System.out.print(result);
        }
        else{
            System.out.print(-1);
        }
    }

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
