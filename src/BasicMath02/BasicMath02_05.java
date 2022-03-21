package BasicMath02;

import java.util.Scanner;

public class BasicMath02_05 {
    public static boolean prime[];

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);


        while (true) {

            int N = in.nextInt();
            int cut = 0;

            if (N == 0) {
                break;
            }
            else if( N==1 ){
                System.out.println(1);
            }
            else {

                prime = new boolean[(2 * N) + 1];
                get_prime();

                for (int i = (N+1); i < (2 * N); i++) {
                    if (!prime[i]) {
                        cut++;
                    }
                }
                System.out.println(cut);
            }
        }
    }

    public static void get_prime() { // 소수 구하는 알고리즘
        prime[0] = prime[1] = true;

        for (int i = 2; i <= Math.sqrt(prime.length); i++) {
            if (prime[i]) {
                continue;
            }
            for (int j = i * i; j < prime.length; j += i) {
                prime[j] = true;
            }
        }
    }
}
