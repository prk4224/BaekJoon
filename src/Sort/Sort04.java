package Sort;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Scanner;

public class Sort04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int N = in.nextInt();
        int arr[] = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = in.nextInt();
        }

        Arrays.sort(arr);
        int index[] = new int[N];

        int mean = 0;
        int sum = 0;
        int med = 0;
        int mode = 0;
        int gap = 0;

        for (int i = 0; i < N; i++) {
            sum += arr[i];
            if (i == (N / 2)) {
                med = arr[i];
            }

        }
        for (int i = 0; i < N - 1; i++) {
            for (int j = i + 1; j < N - 1; j++) {
                if (arr[i] == arr[j]) {
                    index[i]++;
                }
            }
        }
        int max = 0;
        int answer = 0;

        for (int i = 0; i < index.length; i++) {
            if (index[i] > max) {
                max = index[i];
                answer = i;
            }
            if(index[i] == max && i != 0){
                answer = i;
            }
        }
        mode = arr[max];
        gap = arr[N - 1] - arr[0];
        mean = Math.round((float)sum/N);

        sb.append(mean).append('\n').append(med).append('\n').append(mode).append('\n').append(gap);

        System.out.println(sb);
    }
    public static void Mode(int i){

    }
}
