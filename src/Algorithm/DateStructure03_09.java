package Algorithm;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Stack;

public class DateStructure03_09 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        String str = in.next();

        String arr[] = new String[str.length()];

        for(int i= 0; i < str.length(); i++ ){
            for(int j = i; j < str.length(); j++){
                arr[i] += stack.push(str.charAt(j));
            }
        }

        Arrays.sort(arr, String.CASE_INSENSITIVE_ORDER);

        for(String result : arr){
            sb.append(result).append('\n');
        }

        System.out.print(sb);

    }
}
