package Bruteforce;

import java.util.Scanner;

public class Bruteforce04_02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        int N = in.nextInt();
        int M = in.nextInt();
        String str[] = new String[N];

        for (int i = 0; i < N; i++) {
            str[i] = in.next();
        }

        char arr[][] = new char[N][M];

        int cut[][] = new int[N - 7][M - 7];
        int cut_1[][] = new int[N - 7][M - 7];
        int cut_2[][] = new int[N - 7][M - 7];

        for (int i = 0; i < N - 7; i++) {
            for (int j = 0; j < M - 7; j++) {
                Arr(N, M, arr, str);
                cut_1[i][j] = search_1(N, M, i, j, arr);

            }
        }

        for (int i = 0; i < N - 7; i++) {
            for (int j = 0; j < M - 7; j++) {
                Arr(N, M, arr, str);
                cut_2[i][j] = search_2(N, M, i, j, arr);
            }
        }

        for(int i = 0; i < N-7; i++){
            for (int j = 0; j < M-7; j++) {
                if(cut_1[i][j] >= cut_2[i][j]){
                    cut[i][j] = cut_2[i][j];
                }
                else{
                    cut[i][j] = cut_1[i][j];
                }
            }
        }

        int min = cut[0][0];

        for (int i = 0; i < N - 7; i++) {
            for (int j = 0; j < M - 7; j++) {
                if (min >= cut[i][j]) {
                    min = cut[i][j];
                }
            }
        }
        System.out.println(min);
    }

    public static int search_1(int N, int M, int i, int j, char arr[][]) {
        int num= 0;

        for (int k = i; k < i + 8; k++) {
            for (int h = j; h < j + 8; h++) {
                // 시작점 부터 가로 7번씩 세로 8번 비교 진행
                if (arr[k][h] == arr[k][h + 1]) {
                    if (arr[k][h+1] == 'B') {
                        arr[k][h + 1] = 'W';
                        num++;
                    } else {
                        arr[k][h + 1] = 'B';
                        num++;
                    }
                }
                if (k != i + 8) {
                    if (h == j && arr[k][h] == arr[k + 1][h]) {
                        if (arr[k+1][h] == 'B') {
                            arr[k + 1][h] = 'W';
                            num++;
                        } else {
                            arr[k + 1][h] = 'B';
                            num++;
                        }
                    }
                }
            }
        }
        return num;
    }

    public static int search_2(int N, int M, int i, int j, char arr[][]) {
        int num= 0;

        for (int k = i+8; k >= i; k--) {
            for (int h = j+8; h > j; h--) {
                // 시작점 부터 가로 7번씩 세로 8번 비교 진행
                if (arr[k][h] == arr[k][h - 1]) {
                    if (arr[k][h-1] == 'B') {
                        arr[k][h-1] = 'W';
                        num++;
                    } else {
                        arr[k][h-1] = 'B';
                        num++;
                    }
                }

                if (k != i ) {
                    if (h == j+8 && arr[k][h] == arr[k - 1][h]) {
                        if (arr[k-1][h] == 'B') {
                            arr[k-1][h] = 'W';
                            num++;
                        } else {
                            arr[k-1][h] = 'B';
                            num++;
                        }
                    }
                }
            }
        }
        return num;
    }

    public static char[][] Arr(int N, int M, char arr[][], String str[]){
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                arr[i][j] = str[i].charAt(j);
            }
        }
        return arr;
    }
}

