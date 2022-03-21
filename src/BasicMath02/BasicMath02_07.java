package BasicMath02;

import java.util.Scanner;

public class BasicMath02_07 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int x = in.nextInt();
        int y = in.nextInt();
        // 꼭지점 좌표
        int w = in.nextInt(); // x 좌표 길이
        int h = in.nextInt(); // y 좌표 높이

        int x_min = Math.min(x, w-x);
        int y_min = Math.min(y, h-y);

        System.out.println(Math.min(x_min, y_min));
        // 비교 함수

//        int min = 0;
//
//        // (w-x), (h-y), x, y, 이중에서 제일 작은것
//        if((w-x) >= x){
//            min = x;
//        }
//        else{
//            min = w-x;
//        }
//        if(min >= (h-y)){
//            min = h-y;
//        }
//        if(min >= y){
//            min = y;
//        }
//        System.out.println(min);
    }
}
