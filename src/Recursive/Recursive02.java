package Recursive;

import java.util.Scanner;

public class Recursive02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        Fivonacci(N, 0,1);
    }
    public static void Fivonacci(int N, int fir, int sce){
        if(N == 0){
            System.out.println(fir);
            return;
        }
        if(N == 1){
            System.out.println(sce);
            return;
        }

        Fivonacci(N-1, sce, (fir+sce));
    }
}
