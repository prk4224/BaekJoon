package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek_j_1431 {
    static String[] strArr;
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        strArr = new String[N];

        for(int i = 0; i < N; i++){
            strArr[i] = br.readLine();
        }

        int i = 0;
        while(i < N-1){

            if(strArr[i].length() < strArr[i+1].length()){
                i++;
                continue;
            }
            else if(strArr[i].length() > strArr[i+1].length()){
                change(i);
                i = 0;
                continue;
            }
            else {
                if(check(strArr[i],strArr[i+1])){
                    change(i);
                    i = 0;
                    continue;
                }
                i++;
            }
        }

        for(int j = 0 ; j < N; j++){
            System.out.println(strArr[j]);
        }
    }

    public static boolean check(String A, String B){

        int sumA = 0;
        int sumB = 0;
        for(int i = 0; i < A.length(); i++) {
            if (A.charAt(i) <= '9' && A.charAt(i) >= '0') {
                sumA += A.charAt(i) - '0';
            }

            if (B.charAt(i) <= '9' && B.charAt(i) >= '0') {
                sumB += B.charAt(i) - '0';
            }
        }

        if(sumA > sumB) return true;
        else if( sumA == sumB ){
            for(int i = 0; i < A.length(); i++){
                if(A.charAt(i) > B.charAt(i)) return true;
                else if(A.charAt(i) <B.charAt(i)) return false;
            }
        }

        return false;
    }

    public static void change(int i){
        String temp = strArr[i];
        strArr[i] = strArr[i+1];
        strArr[i+1] = temp;
    }

}
