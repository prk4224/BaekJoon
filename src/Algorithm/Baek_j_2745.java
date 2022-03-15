package Algorithm;

import java.util.Scanner;

public class Baek_j_2745 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        String str = in.next();
        int N = in.nextInt();
        int tmp = 1;
        int result = 0;

        for(int i = str.length()-1; i >= 0; i--){
            char c = str.charAt(i);

            if( c >= 'A' && c <= 'Z'){
                result += (( c - 'A') + 10) * tmp;
            } else{
                result += ( c- '0') * tmp;
            }
            tmp *= N;
//            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
//                arr[i] = N + (str.charAt(i) -'Z') -1;
//            }
//            else {
//                arr[i] = str.charAt(i) - '0';
//            }
//        }
//
//        int result = 0;
//        for(int i = arr.length-1, j = 0; i >=0 ; i--,j++){
//            result += ( arr[j] * ( (int) Math.pow(N,i) ) );
        }
        System.out.print(result);
    }
}
