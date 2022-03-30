package Algorithm;

import java.io.*;
import java.util.*;

public class Baek_j_1476 {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int input[] = new int[st.countTokens()];

        for(int i = 0; i < input.length; i++){
            input[i] = Integer.parseInt(st.nextToken());
        }

        int arr[] = new int[input.length];
        int result = 0;

        while(true){

            if(input[0] == arr[0] && input[1] == arr[1] && input[2] == arr[2]){
                break;
            }

            result++;

            arr[0] = result%15;
            arr[1] = result%28;
            arr[2] = result%19;

            if(arr[0] == 0) arr[0] = 15;
            if(arr[1] == 0) arr[1] = 28;
            if(arr[2] == 0) arr[2] = 19;


        }

        System.out.print(result);
    }
}
