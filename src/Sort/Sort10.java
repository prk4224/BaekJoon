package Sort;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Sort10 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int N = in.nextInt();

        int ori[] = new int[N];
        int sor[] = new int[N];
        HashMap<Integer, Integer> rankingMap = new HashMap<Integer, Integer> ();

        for(int i = 0; i < N; i++){
            ori[i]= sor[i] = in.nextInt();
        }

        Arrays.sort(sor);

        int rank = 0;

        for (int v : sor) {
            if(!rankingMap.containsKey(v)){
                rankingMap.put(v, rank);
                rank++;
            }
        }

        for (int key : ori) {
            int ranking = rankingMap.get(key);
            sb.append(ranking).append(' ');
        }
        System.out.println(sb);
    }
}
