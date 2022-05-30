package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek_j_1543 {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String targetStr = br.readLine();
        String searchStr = br.readLine();

        int cnt = 0;
        int i = 0;

        while (i < targetStr.length()-searchStr.length()+1){

            for(int j = 0; j < searchStr.length(); j++,i++){
                if(searchStr.charAt(j) != targetStr.charAt(i)){
                    i = i - j + 1;
                    break;
                }
                else if(j == searchStr.length()-1){
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}
