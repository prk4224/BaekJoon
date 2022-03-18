package Algorithm;

import java.util.Scanner;

public class Baek_j_2609 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int fir = in.nextInt();
        int sec = in.nextInt();

        int small = Math.min(fir, sec);
        int big = Math.max(fir,sec);


        System.out.println(Max(small, big));
        System.out.println(Min(small, big));
    }

    public static int Max(int small, int big){
        int max = 1;
        for(int i = small; i >= 2; i-- ){
            if( small%i ==0 && big%i ==0){
                max = i;
                return max;
            }
        }
        return max;
    }

    public static int Min(int small, int big){
        int min = 0;

        for(int i = 1; i <= small; i++) {
            for(int j = 1; j <= big; j++){
                if(small*j == big*i){
                    min = small*j;
                    return min;
                }
                else {
                    continue;
                }
            }
        }
        return min;
    }
}
