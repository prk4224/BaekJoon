package Algorithm;

import java.io.*;

public class Baek_j_1373 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        String N = br.readLine();
        br.close();
        long num = 0;

        for(int i = N.length()-1, j =0; i>0; i--,j++){
            num += ( Integer.parseInt(String.valueOf(N.charAt(j))) * Math.pow(2,i) );
        }
        long i = 0;
        long result = 0;
        while(true){
            if(num == 0) break;

            for(int j = 0; j < 8; j++){
                if(num == 0) break;

                if(num < j * Math.pow(8,i)) {
                    num = (long) (num -((j-1)*Math.pow(8,i)));
                    result += (j-1)*Math.pow(10,i);
                    i = 0;
                    j = 0;
                   continue;
                }
            }
            i++;

        }

        bw.write(result +"");
        bw.flush();
        bw.close();
    }
}
