package Algorithm;

import java.io.*;

public class Baek_j_2309 {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int input[] = new int[9];

        for(int i = 0; i < 9; i++){
            input[i] = Integer.parseInt(br.readLine());
        }

        int result[] = new int[7];

        int hen = 0;
        for(int i = 0; i < 9; i++){
            for(int j = i; j < 7; j++){
                if(hen < 100){
                    hen += input[j];
                }
            }
        }
    }
}
