package Algorithm;

import java.io.*;

public class Baek_j_1373_result {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        String N = br.readLine();
        br.close();

        if(N.length()%3 == 1){
            sb.append(N.charAt(0));
        }

        if(N.length()%3 == 2){
            sb.append((N.charAt(0) - '0') * 2 + (N.charAt(1) - '0'));
        }

        for(int i = N.length()%3; i < N.length(); i+=3){
            sb.append((N.charAt(i)-'0')*4 + (N.charAt(i+1) - '0')*2 + (N.charAt(i+2) - '0'));
        }

        bw.write(String.valueOf(sb));
        bw.flush();
        bw.close();
    }
}
