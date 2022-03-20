package Algorithm;

import java.io.*;

public class Baek_j_1212 {
    public static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        String N = br.readLine();
        br.close();

        for(int i =0; i < N.length(); i++) {
            result(N.charAt(i), i);
        }
        if(N.equals("0")){
            sb.append(0);
        }
        bw.write(String.valueOf(sb));
        bw.flush();
        bw.close();
    }

    public static void result(char ch, int i){
        int N = ch - '0';

        if(i != 0 || N >= 4){
            for(int j = 4; j >= 1 ; j/=2){
                if(N >= j){
                    N -= j;
                    sb.append(1);
                }
                else{
                    sb.append(0);
                }
            }
        }
        else{
            if(N >= 2){
                for(int j = 2; j >= 1 ; j/=2){
                    if(N >= j){
                        N -= j;
                        sb.append(1);
                    }
                    else{
                        sb.append(0);
                    }
                }
            }
            else{
                if(N == 1){
                    sb.append(1);
                }
            }
        }

    }
}
