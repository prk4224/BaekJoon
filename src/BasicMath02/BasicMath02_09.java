package BasicMath02;

import java.util.Scanner;

public class BasicMath02_09 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        while(true) {
            int coord_1 = in.nextInt();
            int coord_2 = in.nextInt();
            int coord_3 = in.nextInt();

            if (coord_1 == 0 && coord_2 == 0 && coord_3 == 0) {
                break;
            }

            if ((coord_1 * coord_1) + (coord_2 * coord_2) == (coord_3 * coord_3)){
                System.out.println("right");
            }
            else if ((coord_2 * coord_2) + (coord_3 * coord_3) == (coord_1 * coord_1)){
                System.out.println("right");
            }
            else if ((coord_1 * coord_1) + (coord_3 * coord_3) == (coord_2 * coord_2)){
                System.out.println("right");
            }
            else {
                System.out.println("wrong");
            }

//            if (coord_1 >= coord_2 && coord_1 >= coord_3) {
//                if((coord_2 * coord_2)+(coord_3 * coord_3) == (coord_1 * coord_1)){
//                    System.out.println("right");
//                }
//                else{
//                    System.out.println("wrong");
//                }
//            }
//            else if( coord_2 >= coord_1 && coord_2 >= coord_3){
//                if((coord_1 * coord_1)+(coord_3 * coord_3) == (coord_2 * coord_2)){
//                    System.out.println("right");
//                }
//                else{
//                    System.out.println("wrong");
//                }
//            }
//            else if( coord_3 >= coord_1 && coord_3 >= coord_2){
//                if((coord_1 * coord_1)+(coord_2 * coord_2) == (coord_3 * coord_3)){
//                    System.out.println("right");
//                }
//                else{
//                    System.out.println("wrong");
//                }
//            }

        }
    }
}
