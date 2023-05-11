//Aim:Write a program that calculates percentage marks of the student if marks of N subjects are given

import java.util.Scanner;

public class PR7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i, j, sub, student, marks[][];
        float total = 0.0f;
        System.out.print("Enter Number of Student:");
        student = in.nextInt();
        System.out.print("Enter Number of Subject:");
        sub = in.nextInt();
        marks = new int[student][sub];
        for (i = 0; i < student; i++) {
            System.out.println("Enter Marks of Student " + (i + 1));
            for (j = 0; j < sub; j++) {
                System.out.print("\nSubject " + (j + 1) + ":");
                marks[i][j] = in.nextInt();
            }
            System.out.println();
        }
        System.out.println("Your Entered Data:");
        for (i = 0; i < student; i++) {
            total = 0.0f;
            System.out.println("\nMarks of Student " + (i + 1));
            for (j = 0; j < sub; j++) {
                System.out.print("\nSubject " + (j + 1) + ":");
                // marks[i][j] = in.nextInt();
                total += marks[i][j];
                System.out.print(marks[i][j]);
            }
            System.out.println("\nTotal:" + total + "\nPercentage:" + (total / sub));
            System.out.println();
        }
    }
}