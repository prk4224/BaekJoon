package BasicMath02;

import java.util.Scanner;

public class BasicMath02_06 {
    public static boolean prime[];
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        for(int j = 0; j<N; j++) {

            int num = in.nextInt();

            prime = new boolean[num+ 1];
            get_prime();

            int arr[] = new int[2];
            for (int i = 0; i <= (num / 2); i++) {

                if ((!prime[i]) && (!prime[num - i])) {
                    arr[0] = i;
                    arr[1] = num - i;
                }
            }
            System.out.println(arr[0] + " " + arr[1]);
        }
    }
    public static void get_prime(){
        prime[0] = prime[1] =  true;

        for (int i = 2; i <= Math.sqrt(prime.length); i++ ) {
            if(prime[i]){
                continue;
            }
            for (int j = i*i ; j < prime.length; j += i) {
                prime[j] = true;
            }
        }
    }
}
