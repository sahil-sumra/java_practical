//Aim:Write a program that prints Fibonacci series.

import java.util.Scanner;

public class PR4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int lastNum, Num1 = 0, Num2 = 1, Num3, i;
        System.out.println("How Many Number You Want to Generate?");
        lastNum = in.nextInt();
        System.out.print(Num1 + "," + Num2);
        for (i = 0; i < lastNum; i++) {
            Num3 = Num1 + Num2;
            System.out.print("," + Num3);
            Num1 = Num2;
            Num2 = Num3;
        }
    }
}