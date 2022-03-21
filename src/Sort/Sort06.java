package Sort;

import java.util.Scanner;

public class Sort06 {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int arr[][] = new int[N][2];
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 2; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        for (int i = 0; i < N-1; i++) {
            for (int j = i+1; j < N; j++) {

                if(arr[i][0] > arr[j][0]){
                    Array(arr, i, j);
                }
                else if( arr[i][0] == arr[j][0]){
                    if(arr[i][1] > arr[j][1]){
                       Array(arr, i, j);
                    }
                }
            }
        }
        for (int i = 0; i < N; i++) {
            sb.append(arr[i][0]).append(" ").append(arr[i][1]).append('\n');
        }
        System.out.println(sb);
    }
    public static void Array(int arr[][], int i, int j){
        int temp_1 = arr[i][0];
        arr[i][0] = arr[j][0];
        arr[j][0] = temp_1;

        int temp_2 = arr[i][1];
        arr[i][1] = arr[j][1];
        arr[j][1] = temp_2;
    }
}
