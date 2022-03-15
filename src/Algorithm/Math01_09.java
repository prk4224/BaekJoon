package Algorithm;

import java.util.Scanner;

public class Math01_09 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        long N = in.nextLong();
        long M = in.nextLong();

        long count_5 = five(N) - five(N-M) -five(M);
        long count_2 = two(N) - two(N-M) - two(M);

        System.out.println(Math.min(count_2, count_5));

    }

    public static long five(long N){
        int cut = 0;

        while( N >= 5){
            cut += N/5;
            N /= 5;
        }
        return cut;
    }

    public static long two(long N){
        int cut = 0;

        while( N >= 2){
            cut += N/2;
            N /= 2;
        }
        return cut;
    }
}
