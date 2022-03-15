package Bruteforce;

import java.util.Scanner;

public class Bruteforce01 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
         int N = in.nextInt();
         int max = in.nextInt();
         int arr[] = new int[N];

         for(int i = 0; i < N; i++){
             arr[i] = in.nextInt();
         }
        System.out.println(search(arr, N, max));

    }
    public static int search(int arr[], int N, int max){

        int sum = 0;

        for(int i = 0; i < N-2; i++){
            for(int j = i+1; j < N-1; j++){
                for(int k = j +1; k < N; k++){
                     int temp = arr[i] + arr[j] + arr[k];

                     if(max == temp){
                         return temp;
                     }

                     if(sum < temp && temp < max){
                         sum = temp;
                     }
                }
            }
        }
        return sum;
    }
}
