package Recursive;

import java.util.Scanner;

public class Recursive01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        System.out.println(Factorial(N));

    }
    public static int Factorial(int N){

        if(N == 0){
            return 1;
        }
        return N * Factorial(N-1);

    }
}
