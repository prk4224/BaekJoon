package Algorithm;

import java.util.Scanner;

public class Baek_j_2839 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        if(N<5 && N != 3 || N ==7)
            System.out.print(-1);
        else {
            for(int i = 0; i <= N/3; i++){
                for(int j =0; j <= N/5; j++){
                    if( N == (i*3) + (j*5)) {
                        System.out.print(i + j);
                        return;
                    }
                }
            }
        }
    }
}
