package Algorithm;

import java.io.*;

public class Baek_j_10820 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter((new OutputStreamWriter(System.out)));


        String str = "";
        while((str =br.readLine()) != null) {
            int cut[] = new int[4];

            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                    cut[0]++;
                } else if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                    cut[1]++;
                } else if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                    cut[2]++;
                } else if (str.charAt(i) == ' ') {
                    cut[3]++;
                }
            }
            for (int result : cut) {
                bw.write(result + " ");
            }
            bw.write('\n');
       }
        bw.flush();
    }
}
