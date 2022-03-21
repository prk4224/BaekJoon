package Bruteforce;

import java.util.Scanner;

public class Bruteforce02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        search(N);

    }

    static void search(int N) {
        int N_length = 0;
        int result = 0;

        for (int i = N; i > 0; i /= 10) {
            N_length++;
        }

        for(int i = (N - (N_length*9)); i < N; i++) {
            int temp = i;

            int arr[] = new int[N_length];

            for(int j = 0; j < N_length; j++){
                arr[j] = temp%10;
                temp = temp/10;
            }
            int sum = 0;

            for (int j = 0; j < N_length; j++) {
                sum += arr[j];
            }
            if(N == i + sum){
                result = i;
                break;
            }
        }
        System.out.println(result);
    }
}
