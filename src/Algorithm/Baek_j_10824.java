package Algorithm;

import java.io.*;

public class Baek_j_10824 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        String str = br.readLine();
        br.close();
        String input[] = str.split(" ");

        long num[] = new long[input.length];

        for (int i = 0; i < input.length; i++) {
            num[i] = Integer.parseInt(input[i]);
        }

        long fir = (long) (num[1] + num[0] * Math.pow(10, input[1].length()));
        long sec = (long) (num[3] + num[2] * Math.pow(10, input[3].length()));


        long result = fir + sec;

//        String fir = input[0] + input[1];
//        String sec = input[2] + input[3];

//        long result = Integer.parseInt(fir) + Integer.parseInt(sec);
        String result_s = String.valueOf(result);

        bw.write(result_s);
        bw.flush();
        bw.close();

    }
}
