package Algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class Math02_01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int M = in.nextInt();

        for (int t = 0; t < M; t++) {
            int N = in.nextInt();
            int arr[] = new int[N];


            int cut = 0;
            long sum = 0;
            for (int i = 0; i < N; i++) {
                arr[i] = in.nextInt();
            }
            Arrays.sort(arr);

            for (int i = 0; i < N - 1; i++) {
                for (int j = i + 1; j < N; j++) {
                    int max = 0;
                    for (int k = arr[i]; k >= 2; k--) {
                        if (arr[i] % k == 0 && arr[j] % k == 0) {
                            max += k;
                            break;
                        }
                    }
                    if (max == 0) {
                        cut++;
                    }
                    else{
                        sum += max;
                    }
                }
            }

            sb.append(sum + cut).append('\n');
        }
        System.out.println(sb);
    }
}
