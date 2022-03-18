package Algorithm;

import java.util.Scanner;

public class Baek_j_1676 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int cut = 0;

        while( N >= 5){
            cut += N/5;
            N /= 5;
        }

        System.out.println(cut);
    }
}