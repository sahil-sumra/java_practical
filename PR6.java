//Aim:Write a program that reverses a number.  

import java.util.Scanner;

public class PR6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int Num, rem, revNum = 0;
        System.out.print("Enter Your Number:");
        Num = in.nextInt();
        while (Num > 0) {
            rem = Num % 10;
            revNum = revNum * 10 + rem;
            Num /= 10;
        }
        System.out.println("Reverse Number is " + revNum);

    }
}