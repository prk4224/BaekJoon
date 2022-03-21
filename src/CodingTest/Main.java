package CodingTest;

import java.util.*;

class Main {
    public static int cut = 0;
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int arr[] = new int[N];
        int sum = 0;


        for(int i = 0; i < N; i++){
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        if(sum >= 2000 && sum <= 2500) cut++;

        for(int i = 1; i <= N; i++){
            result(arr, i, sum);
        }

        System.out.println(cut);
    }
    public static void result(int arr[], int i, int sum){
        int arr_1[] = new int[i];

        for(int j = 0; j < arr.length; j++){
            if((sum-arr_1[i]) >= 2000 && (sum-arr_1[i]) <= 2500 ) cut++;

            result(arr, j, sum);
        }
    }
}
