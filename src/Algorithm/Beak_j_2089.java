package Algorithm;

import java.io.*;
import java.util.StringTokenizer;

public class Beak_j_2089 {
    public static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());


        int N = Integer.parseInt(st.nextToken());

        if( N == 0 ){
            bw.write(0+"");
        }
        else {
            while(N != 1){
                sb.append(Math.abs(N%-2));
                N = (int)Math.ceil((double) N/-2);
            }
            sb.append(N);
        }
        sb.reverse();
        int M = (int)Math.ceil((double) -1/-2);

        bw.write(sb + "\n");
        bw.write(M +"");
        bw.flush();
        bw.close();

    }
}
