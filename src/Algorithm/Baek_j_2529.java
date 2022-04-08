package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Baek_j_2529 {
    public static int N; // 부등호의 개수
    public static String arr = ""; // 특정 부등호를 담기 위한 변수
    public static boolean vi[]; // 방문 여부
    public static ArrayList result = new ArrayList<>(); // 각 경우의 수를 담기 위한 배열

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        vi = new boolean[10];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0; i < N; i++){
            arr += st.nextToken();
        }

        bt(0,"");
        Collections.sort(result);

        System.out.println(result.get( result.size() - 1 ));
        System.out.println(result.get(0));

    }

    // 모든 경우의 수를 찾기 위해서 Backtracking
    public static void bt(int cut,String temp){
        //부등호의 개수 보다 숫자가 1개 더 많기 때문에 N+1에서 return
        if(N+1 == cut) {
            result.add(temp);
            return;
        }

        // 가능한 수의 범위 0~9까지
        for(int i = 0; i < 10; i++){
            // cut 즉 길이가 0 이거나 부등호가 성립한다면 Backtracking 진행
            if(cut == 0 || check((char) (i + '0'),temp.charAt(cut-1), arr.charAt(cut-1))){
                if(!vi[i]) {
                    vi[i] = true;
                    bt(cut + 1, temp + Integer.toString(i));
                    vi[i] = false;
                }
            }
        }
    }

    // 부등호가 성립하는 여부에 관한 함수
    public static boolean check(char a, char b,char c){

        if(c == '<'){
            if(a > b) return true;
        }

        if(c == '>'){
            if(a < b) return true;
        }
        return false;
    }
}
