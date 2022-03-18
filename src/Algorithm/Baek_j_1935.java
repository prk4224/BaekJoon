package Algorithm;

import java.util.Scanner;
import java.util.Stack;

public class Baek_j_1935 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Stack<Double> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        int N = in.nextInt();
        String str = in.next();

        double result = 0;


        double arr[] = new double[N];

        for(int i = 0; i < N; i++){
            arr[i] = in.nextDouble();
        }

        for(int i = 0; i < str.length(); i++){
            if('A' <= str.charAt(i) && str.charAt(i) <= 'Z'){
                stack.push(arr[str.charAt(i) - 'A']);
            }
            else{
                if(!stack.empty()){
                    double fir = stack.pop();
                    double sec = stack.pop();

                    switch (str.charAt(i)){
                        case '+' :
                            result = sec + fir;
                            stack.push(result);
                            continue;
                        case '-' :
                            result = sec - fir;
                            stack.push(result);
                            continue;
                        case '*' :
                            result = sec * fir;
                            stack.push(result);
                            continue;
                        case '/' :
                            result = sec / fir;
                            stack.push(result);
                            continue;
                    }
                }
            }
        }
        System.out.printf("%.2f", result);
    }
}
