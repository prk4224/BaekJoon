package Algorithm;

import java.io.*;
import java.util.StringTokenizer;

public class Baek_j_11655 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        String str = br.readLine();
        String strArr[] = str.split(" ");

        br.close();

        for(int i = 0; i < strArr.length; i++){
            for(int j =0; j < strArr[i].length(); j++){
                if(strArr[i].charAt(j) >= 'A' && strArr[i].charAt(j) <= 'Z'){
                    if(strArr[i].charAt(j) > 'M') {
                        char ch = (char)((int)strArr[i].charAt(j) -13);
                        sb.append(ch);
                    }
                    else {
                        char ch = (char)((int)strArr[i].charAt(j) +13);
                        sb.append(ch);
                    }
                }
                else if(strArr[i].charAt(j) >= 'a' && strArr[i].charAt(j) <= 'z'){
                    if(strArr[i].charAt(j) > 'm') {
                        char ch = (char)((int)strArr[i].charAt(j) -13);
                        sb.append(ch);
                    }
                    else {
                        char ch = (char)((int)strArr[i].charAt(j) +13);
                        sb.append(ch);
                    }
                }
                else sb.append(strArr[i].charAt(j));
            }
            sb.append(' ');
        }
        bw.write(String.valueOf(sb));
        bw.flush();
        return;
    }
}
