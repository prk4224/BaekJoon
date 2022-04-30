package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Baek_j_1946 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++){

            int num = Integer.parseInt(br.readLine());
            int per[][] = new int[num][2];

            for(int j = 0; j < num; j++){
                StringTokenizer st = new StringTokenizer(br.readLine());
                per[j][0] = Integer.parseInt(st.nextToken());
                per[j][1] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(per, new Comparator<int[]>() {
                @Override
                public int compare(int[] o1, int[] o2) {
                    return o1[0] - o2[0];
                }
            });

            int cut = 1;
            int prev = per[0][1];

            for(int j = 1; j < num; j++){
                if(prev > per[j][1]){
                    prev = per[j][1];
                    cut++;
                }
            }


            System.out.println(cut);

        }
    }
}