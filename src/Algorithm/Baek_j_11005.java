package Algorithm;

import java.io.*;

public class Baek_j_11005 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        String str = br.readLine();
        br.close();
        String[] num = str.split(" ");

        int input[] = new int[num.length];

        for (int i = 0; i < num.length; i++) {
            input[i] = Integer.parseInt(num[i]);
        }


        char arr[] = new char[(int) input[1]];

        for (int i = 0; i < arr.length; i++) {
            if (i < 10) {
                arr[i] = (char) (48 + i);
            } else {
                arr[i] = (char) (55 + i);
            }
        }

        while (input[0] >= input[1]) {
            sb.append(arr[(input[0] % input[1])]);
            input[0] = input[0] / input[1];
        }
        sb.append(arr[input[0]]);
        sb.reverse();

        bw.write(sb + "");
        bw.flush();
        bw.close();

    }
}
