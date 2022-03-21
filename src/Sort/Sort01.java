package Sort;

import java.util.Arrays;
import java.util.Scanner;

public class Sort01 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        StringBuilder sb = new StringBuilder();
        int N = in.nextInt();
        int arr[] = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = in.nextInt();
        }
        Arrays.sort(arr);

        for(int var : arr){
            sb.append(var).append('\n');
        }
        System.out.println(sb);
    }
}
