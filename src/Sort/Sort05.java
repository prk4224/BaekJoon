package Sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Sort05 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        String str = in.next();

        StringBuilder sb = new StringBuilder();

        Integer arr[] = new Integer[str.length()];

        for (int i = 0; i < str.length(); i++) {
            arr[i] = (int)str.charAt(i) -'0';
        }

        Arrays.sort(arr, Collections.reverseOrder());

        for (int var : arr) {
            sb.append(var);
        }
        System.out.println(sb);


    }
}
