package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek_j_1748 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String str = String.valueOf(N);
        //1~9 -> 1, 10~99 -> 2, 100~999 - 3

        int result = 0;
        for(int i = str.length(); i >= 1 ; i--){

            if(i == str.length()){
                result += (int) (str.length() * (N - (Math.pow(10,str.length()-1)) + 1 ));
            }
            else{
                result += (int) (Math.pow(10,i) - Math.pow(10,i-1)) * i;
            }
        }
        System.out.println(result);
    }
}
