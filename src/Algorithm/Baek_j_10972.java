// 메모리 초과

package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baek_j_10972 {
    static int N;
    static String input = "";
    static int sortArr[];
    static boolean vi[];
    static ArrayList result = new ArrayList<>();
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        sortArr = new int[N];
        vi = new boolean[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            input += st.nextToken();
            sortArr[i] = (input.charAt(i) - '0');
        }
        Arrays.sort(sortArr);
        dt(0,"");

        int index = 0;
        for(int i = 0; i < result.size(); i++){
            if(result.get(i).equals(input)){
                index = i+1;
                break;
            }
        }
        if(index == result.size()){
            System.out.println(-1);
        }
        else{
            String str = (String) result.get(index);
            for(int i = 0; i < N; i++){
                System.out.print(str.charAt(i) + " ");
            }
        }

    }

    public static void dt(int dep, String temp){
        if(N == dep){
            result.add(temp);
            return;
        }

        for(int i = 0 ; i < N; i++){
            if(!vi[i]){
                vi[i] = true;
                dt(dep+1, temp + Integer.toString(sortArr[i]));
                vi[i] = false;
            }
        }
    }
}