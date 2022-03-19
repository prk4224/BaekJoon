package Algorithm;

import java.io.*;

public class Baek_j_6588 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while(true){
            int N = Integer.parseInt(br.readLine());

            if(N == 0) break;
            int result[] = new int[2];

            for(int i = 2; i <= N/2; i++){
                if(prime(i) && prime(N-i)){
                    result[0] = i;
                    result[1] = N-i;
                    break;
                }
            }
            bw.write(N + " = " + result[0] + " + " + result[1] + "\n");
            bw.flush();
        }
        br.close();
        bw.close();
    }
    public static boolean prime(int N){

        for(int i =2; i <= Math.sqrt(N); i++){
            if(N%i ==0 ){
                return false;
            }
        }
        return true;
    }
}
