package BasicMath02;

import java.util.Scanner;

public class BasicMath02_08 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int first_coord[] = {in.nextInt(),in.nextInt()};
        int second_coord[] = {in.nextInt(),in.nextInt()};
        int third_coord[] = {in.nextInt(),in.nextInt()};

        int x;
        int y;

        if (first_coord[0] == second_coord[0]) {
            x = third_coord[0];
        } else if (first_coord[0] == third_coord[0]) {
            x = second_coord[0];
        } else {
            x = first_coord[0];
        }

        if (first_coord[1] == second_coord[1]) {
            y = third_coord[1];
        } else if (first_coord[1] == third_coord[1]) {
            y = second_coord[1];
        } else {
            y = first_coord[1];
        }

        System.out.println(x + " " + y);

    }
}
