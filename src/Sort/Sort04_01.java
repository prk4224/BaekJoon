package Sort;


import java.util.Scanner;

public class Sort04_01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int N = in.nextInt();
        int arr[] = new int[8001];

        int sum = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int med = 10000;
        int mode = 10000;

        for (int i = 0; i < N; i++) {
            int value = in.nextInt();
            sum += value;

            arr[value + 4000]++;

            if(max < value){
                max = value;
            }
            if(min > value){
                min = value;
            }
        }

        int cut = 0; // 중앙 빈도 누적 수
        int mode_max = 0; // 최빈값의 최대값

        boolean flag = false;

        for (int i = min + 4000; i <= max + 4000; i++) {

            if(arr[i] > 0){


                if(cut < (N+1)/2){
                    cut += arr[i];
                    med = i - 4000;
                }

                if(mode_max < arr[i]){
                    mode_max = arr[i];
                    mode = i - 4000;
                    flag = true;
                }
                else if( mode_max == arr[i] && flag == true){
                    mode = i- 4000;
                    flag = false;
                }
            }
        }
        //int mean = (int) Math.round((double) sum / N);
        //int gap = max - min;
        sb.append((int) Math.round((double) sum / N)).append('\n'). append(med).append('\n').append(mode).append('\n').append(max - min);

        System.out.println(sb);

//        System.out.println((int) Math.round((double) sum / N));
//        System.out.println(med);
//        System.out.println(mode);
//        System.out.println(max - min);
    }
}
