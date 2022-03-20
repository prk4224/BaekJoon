package Algorithm;

import java.io.*;
import java.util.StringTokenizer;

public class Baek_j_1463 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        br.close();

        bw.write(recur(N,0) +"");
        bw.flush();
        bw.close();

    }
    public static int recur(int N, int cut){
        if(N < 2){
            return cut;
        }
        return Math.min(recur(N/2, cut+1+(N%2)), recur(N/3, cut+1+(N%3)));
    }

}
// 이름 중복, 키워드 검색, 검색어 필터
