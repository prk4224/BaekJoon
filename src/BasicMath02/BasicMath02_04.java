package BasicMath02;

import java.util.Scanner;

public class BasicMath02_04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num1 = in.nextInt();
        int num2 = in.nextInt();

        StringBuilder sb = new StringBuilder();

        for (int i = num1; i <= num2; i++) {

            if (i==2 || i == 3) {
                sb.append(i).append('\n');
                continue;
            }

            for (int j = 2; j <= (int) Math.sqrt(i); j++) {
                if (i % j == 0) {
                    break;
                } else if (j == (int) Math.sqrt(i)) {
                    sb.append(i).append('\n');;
                }
            }
        }
        System.out.println(sb);
    }
}
