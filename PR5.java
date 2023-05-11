//Aim:Write a program that finds out sum of digits of a number.

import java.util.Scanner;

public class PR5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int Num, sumofNum = 0, rem;
        System.out.print("Enter Your Number:");
        Num = in.nextInt();
        while (Num > 0) {
            rem = Num % 10;
            sumofNum += rem;
            Num /= 10;
        }
        System.out.println("Sum of Number is " + sumofNum);

    }
}