package BasicMath02;

import java.util.Scanner;

public class BasicMath02_11 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        for (int i = 0; i < N; i++) {

            int x1 = in.nextInt();
            int y1 = in.nextInt();
            int r1 = in.nextInt();
            int x2 = in.nextInt();
            int y2 = in.nextInt();
            int r2 = in.nextInt();

            int x_length = Math.abs(x1 - x2); // x의 길이
            int y_length = Math.abs(y1 - y2); // y의 길이
            double xy_length = Math.sqrt((x_length * x_length) + (y_length * y_length)); // 두점 사이의 거리
            // Math.pow() 제곱근 함수

            if(xy_length == 0 && r1 == r2){
                System.out.println(-1);
            }
            else if(xy_length == 0 && r1 != r2){
                System.out.println(0);
            }
            else if((xy_length+r1) < r2 || (xy_length+r2) < r1){
                System.out.println(0);
            }
            else if (xy_length > (r1 + r2)) {
                System.out.println(0);
            }
            else if((xy_length+r1) == r2 || (xy_length+r2) == r1){
                System.out.println(1);
            }
            else if(xy_length == 0 && (r1+r2) ==0){
                System.out.println(1);
            }
            else if (xy_length == (r1 + r2)) {
                System.out.println(1);
            }
            else if(xy_length < (r1+r2) ){
                System.out.println(2);
            }
            else if ((xy_length+r1) > r2 && r2 > xy_length) {
                System.out.println(2);
            }
            else if ((xy_length+r2) > r1 && r1 > xy_length) {
                System.out.println(2);
            }


        }
    }
}
