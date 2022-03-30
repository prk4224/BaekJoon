package Algorithm;

import java.io.*;
import java.util.Arrays;

public class Baek_j_2309 {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int input[] = new int[9];
        int sum = 0;
        int index1 =  0, index2 = 0;

        for(int i = 0; i < 9; i++){
            input[i] = Integer.parseInt(br.readLine());
            sum += input[i];
        }

        br.close();
        int result[] = new int[7];
        Arrays.sort(input);


        for(int i = 0; i < 8; i++){
            for(int j = i+1; j < 9; j++){

                if((sum - input[i] - input[j]) == 100){
                    index1 = i;
                    index2 = j;
                }
            }
        }
        for(int i = 0; i < 9; i++){
            if(i == index1 || i == index2) continue;

            bw.write(input[i] + "\n");
            bw.flush();
        }

        bw.close();
    }
}
