package Algorithm;

import java.io.*;
import java.util.LinkedList;
import java.util.ListIterator;

public class Baek_j_1406 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        LinkedList<Character> link = new LinkedList<>();


        String str = br.readLine();
        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i < str.length(); i++){
            link.add(str.charAt(i));
        }

        ListIterator<Character> iter = link.listIterator();

        while(iter.hasNext()){
            iter.next();
        }

        for(int i = 0; i < N; i++){
            String ch = br.readLine();
            char c = ch.charAt(0);


            switch (c){

                case 'L' :

                    if(iter.hasPrevious()){
                        iter.previous();
                    }

                    break;

                case 'D' :

                    if(iter.hasNext()){
                        iter.next();
                    }
                    break;

                case 'B' :

                    if(iter.hasPrevious()){
                        iter.previous();
                        iter.remove();
                    }


                    break;

                case 'P' :

                    iter.add(ch.charAt(2));
                    break;

                default:
                    break;
            }

        }


        for( char result : link){
            bw.write(result);
        }
        br.close();
        bw.close();
    }
}
