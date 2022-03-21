package BasicMath02;

import java.util.Scanner;

public class BasicMath02_10 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int r = in.nextInt();

        double CircleArea = Math.PI*(r * r);
        double Texi = (r * (double)r) *2;

        System.out.println(String.format("%.6f", CircleArea)); // 소수점 6 번째 자리에서 반올림
        System.out.println(String.format("%.6f", Texi));
        // 반올림 말고도 올림, 반올림, 내림도 있음.
    }
}
