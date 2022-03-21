package BasicMath02;

import java.util.Scanner;

public class BasicMath02_02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int A = in.nextInt();
        int B = in.nextInt();
        int sum = 0;
        boolean isPrise[] = new boolean[B - A + 1];

        for (int i = A; i <= B; i++) {
            if (i == 1) {
                isPrise[i - A] = true;
                continue;
            }

            for (int j = 2; j <= Math.sqrt(i); j++) {

                if (i % j == 0) {
                    isPrise[i - A] = true;
                    break;
                }
            }
            if (!(isPrise[i - A])) {
                sum += i;
            }
        }
        if (sum == 0) {
            System.out.println(-1);
        }
        else {
            System.out.println(sum);

            for (int i = A; i <= B; i++) {
                if (!(isPrise[i - A])) {
                    System.out.print(i + " ");
                    break;
                }
            }
        }
    }
}