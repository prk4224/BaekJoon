package Algorithm;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Baek_j_9093 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int N = in.nextInt();
        in.nextLine();

        for (int i = 0; i < N; i++) {
            String str = in.nextLine();
            StringTokenizer st = new StringTokenizer(str, " ");

            int cut = 0;
            for(int j = 0; j< str.length(); j++){
                if(str.charAt(j) == ' '){
                    cut++;
                }
            }
            //System.out.println(cut);

            String arr[] = new String[cut+1];
            while(st.hasMoreElements()){
                String str_1 = st.nextToken();
                StringBuffer sbf = new StringBuffer(str_1);
                String reversr = sbf.reverse().toString();
                sb.append(reversr).append(" ");
            }
            sb.append('\n');
        }
        System.out.println(sb);
    }
}
