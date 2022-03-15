package Bruteforce;

import java.util.Scanner;

public class Bruteforce05 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int cut = 1;
        int fin = 666;
        int result = 0;

        while(N != cut){
            fin++;

            if(String.valueOf(fin).contains("666")){
                cut++;
            }
        }
        System.out.println(fin);
    }
}
