//Aim:Write a java program to print all real solutions to the quadratic equation ax2+b+c=0. Read a, b, c 
//values and use the formula (–b+ sqrt (b2
//-4ac))/2a.

import java.util.Scanner;

public class PR2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a, b, c, delta, deltaroot, root1, root2;
        System.out.print("Enter Co-efficient of Quadratic Equation:");
        a = in.nextDouble();
        b = in.nextDouble();
        c = in.nextDouble();
        System.out.println("Your Entered Equation:" + a + "x^2+" + b + "x+" + c);
        delta = (b * b) - (4 * a * c);
        if (delta > 0) {
            deltaroot = Math.sqrt(delta);
            root1 = (-b + deltaroot) / (2 * a);
            root2 = (-b - deltaroot) / (2 * a);
            System.out.print("\nRoot 1: " + root1 + "\nRoot 2: " + root2);
        } else if (delta < 0) {
            delta = -delta;
            deltaroot = Math.sqrt(delta);
            root1 = (-b / (2 * a));
            root2 = (deltaroot / (2 * a));
            System.out.println("Root 1: " + root1 + "+i" + root2 + "\nRoot 2: " + root1 + "-i" + root2);
        } else {
            root1 = (-b / (2 * a));
            System.out.println("Root 1 = Root 2 = " + root1);
        }

    }
}
