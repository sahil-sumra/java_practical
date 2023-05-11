//Aim:Write a program to find length of string and print second half of the string. Also check the string 
//is palindrome or not.

import java.util.Scanner;

public class PR8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str, revstr = "";
        char strchar;
        System.out.print("Enter Your String:");
        str = in.nextLine();
        System.out.println(str + " Length is " + str.length());
        System.out.println("Second Half of String is " + str.substring(str.length() / 2));
        for (int i = 0; i < str.length(); i++) {
            strchar = str.charAt(i);
            revstr = strchar + revstr;
        }
        // System.out.println(revstr);
        if (revstr.equals(str)) {
            System.out.println("Given String is Palindrome");
        } else {
            System.out.println("Given String is Not Palindrome");
        }
    }
}