package Sort;

import java.util.Arrays;
import java.util.Scanner;

public class Sort07 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int N = in.nextInt();

        int arr[][] = new int[N][2];

        for(int i = 0; i < N; i++){
            arr[i][0] = in.nextInt();
            arr[i][1] = in.nextInt();
        }

        Arrays.sort(arr, (e1, e2) -> {
            if(e1[1] == e2[1]){
                return e1[0] - e2[0];
            }
            else{
                return e1[1] - e2[1];
            }
        });

        for (int i = 0; i < N; i++) {
            sb.append(arr[i][0]).append(" ").append(arr[i][1]).append('\n');
        }
        System.out.println(sb);
    }
}
