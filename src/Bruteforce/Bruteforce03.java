package Bruteforce;

import java.util.Arrays;
import java.util.Scanner;

public class Bruteforce03 {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args){


        int N = in.nextInt();

        Rank(N);

    }

    static void Rank(int N){

        int k = 0;
        int rank[] = new int[N];
        for(int i = 0; i< N; i++){
            rank[i] = 1;
        }

        int arr[][] = new int[N][2];
        for (int i =0; i <N; i++) {
            int wei = in.nextInt();
            int hei = in.nextInt();
            arr[i][0] = wei;
            arr[i][1] = hei;
            }

        for (int i = 0; i < N; i++) {
            for(int j = 0 ; j < N; j++){
                if(arr[i][0] < arr[j][0] && arr[i][1] <arr[j][1]){
                    rank[i]++;
                }
            }
        }

        for(int var : rank){
            System.out.print(var + " ");
        }
    }
}
