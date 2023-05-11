//Aim:Write an interactive program to generate following patterns:
//     *
//   *   *
//  *  *  *
//   *   *
//     *

import java.util.Scanner;

public class PR3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int row, i, j, k;
        System.out.print("Enter Number of Rows:");
        row = in.nextInt();
        for (i = 0; i < row; i++) {
            for (j = row - i; j > 1; j--) {
                System.out.print(" ");
            }
            for (k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
        for (i = 0; i < row; i++) {
            for (j = i + 1; j > 0; j--) {
                System.out.print(" ");
            }
            for (k = 1; k <= row - 1 - i; k++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
}
