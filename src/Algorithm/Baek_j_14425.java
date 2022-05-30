package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek_j_14425 {
    public static void main(String[] args) throws IOException{

        int cnt = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        String[] strArr = new String[N];
        String[] checkArr = new String[M];

        for(int i = 0; i < N; i++){
            strArr[i] = br.readLine();
        }

        for(int i = 0; i < M; i++){
            checkArr[i] = br.readLine();
        }

        for(int i = 0 ; i < M; i++){
            for(int j = 0; j < N; j++){
                if(strArr[j].equals(checkArr[i])){
                    cnt++;
                    break;
                }
            }
        }

        System.out.print(cnt);
    }
}
