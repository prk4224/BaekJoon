package Algorithm;

import java.io.*;
import java.util.*;

public class Baek_j_1759 {

    public static int M;
    public static int N;
    public static boolean vi[];
    public static char arr[];
    public static char input[];
    public static String result ="";

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        vi = new boolean[N];
        input = new char[N];
        arr = new char[M];

        for(int i = 0; i < N; i++){
            input[i] = st.nextToken().charAt(0);
        }
        Arrays.sort(input);

        dfs(0);

        st = new StringTokenizer(result," ");

        while(st.hasMoreTokens()){

            String str = st.nextToken();
            int cut_v = 0; // 모음의 갯수
            int cut_c = 0; // 자음의 갯수
            for(int i = 0; i < M; i++){
                if(vowel(str.charAt(i))){
                    cut_v++;
                }
                else{
                    cut_c++;
                }
            }
            if(cut_v > 0 && cut_c >1){
                bw.write(str + "\n");
                bw.flush();
            }

        }
        bw.close();

    }
    public static void dfs(int dep){
        if(M == dep){
            for(char var : arr){
                result += String.valueOf(var);
            }
            result += " ";
            return;
        }

        for(int i = 0; i < N; i++){
            if(!vi[i] && dep == 0){
                vi[i] = true;
                arr[dep] = input[i];
                dfs(dep+1);
                vi[i] = false;
            }

            else if(!vi[i] && arr[dep-1] < input[i]){
                vi[i] = true;
                arr[dep] = input[i];
                dfs(dep+1);
                vi[i] = false;

            }
        }
        return;
    }

    public static boolean vowel(char ch){
        if(ch == 'a' || ch =='e' || ch =='i' || ch =='o' || ch =='u') return true;
        else return false;
    }
}
