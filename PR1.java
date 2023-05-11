//Aim:Write a program to enter two numbers and perform mathematical operations on them.

import java.util.Scanner;

public class PR1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int Num1, Num2;
        System.out.print("Enter First Number:");
        Num1 = in.nextInt();
        System.out.print("Enter Second Number:");
        Num2 = in.nextInt();
        System.out.print("Addition:" + (Num1 + Num2) + "\nSubtraction:" + (Num1 - Num2) + "\nMultiplication:"
                + (Num1 * Num2) + "\nDivision:" + (Num1 / Num2) + "\nModulo:" + (Num1 % Num2));
    }
}