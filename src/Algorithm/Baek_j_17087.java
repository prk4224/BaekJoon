package Algorithm;

import java.io.*;

public class Baek_j_17087 {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        String str_1[] = str.split(" ");

        int bn = Integer.parseInt(str_1[0]); // 동생 수
        int S = Integer.parseInt(str_1[1]); // 현재 위치

        String brStr = br.readLine();
        String brStr_1[] = brStr.split(" ");

        int ba[] = new int[bn]; // 동생들의 위치
        for(int i = 0; i < bn; i++){
            ba[i] = Integer.parseInt(brStr_1[i]);
            ba[i] = Math.abs(S-ba[i]); // 현재 위치에서 동생의 거리
        }

        br.close();

        int gcd = ba[0];

        for(int i = 1; i <ba.length; i++){
            gcd = GCD(gcd,ba[i]);
        }

        bw.write(gcd + "");
        bw.flush();
        bw.close();
    }


    public static int GCD(int num_1, int num_2){

        if(num_2 == 0){
            return num_1;
        }
        return GCD(num_2, num_1 % num_2);


    }
}
