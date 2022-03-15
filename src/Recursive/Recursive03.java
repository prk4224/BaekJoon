package Recursive;

import java.util.Scanner;

public class Recursive03 {
    static char arr[][];

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        arr = new char[N][N];

        star_1(0,0,N,false);

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++){
               sb.append(arr[i][j]);
            }
            sb.append('\n');
        }
        System.out.println(sb);
    }
    static void star_1(int a, int b, int N, boolean blank){

        if(blank){
            for(int i = a; i < a+N; i++){
                for (int j = b; j < b+N; j++) {
                    arr[i][j] = ' ';
                }
            }
            return ;
        }
        if(N == 1){
            arr[a][b] = '*';
            return ;
        }

        int size = N /3;
        int cut = 0;
        for(int i = a; i < a+N; i += size){
            for (int j = b; j < b+N; j += size) {
                cut++;
                if(cut == 5){
                    star_1(i,j, size, true);
                }
                else{
                    star_1(i,j,size, false);
                }
            }
        }
    }
}
