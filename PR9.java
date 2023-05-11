// Aim : Write a program to accept a line and check how many consonants and vowels are there in line. 
// Also count the number of words that start with capital letters.

import java.util.Scanner;

public class PR9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str;

        int count = 0, count2 = 0, i, j; // count is used for calculating number of Vowels and count2 is used to Count
                                         // Number of Words Starting with Capital Letter
        char[] vowels = { 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' };

        System.out.print("Enter Your String/Line:");
        str = in.nextLine();

        String[] wordArr = str.split(" ");
        str = str.contains(" ") ? str.replace(" ", "") : str;// This Statement Remvoe The Space from String

        for (i = 0; i < str.length(); i++) {
            for (j = 0; j < vowels.length; j++) {
                if (str.charAt(i) == vowels[j]) {
                    count++;
                }
            }
        }

        System.out.println("Number of Vowels:" + count + "\nNumber of Consonants:" + (str.trim().length() - count));

        for (i = 0; i < wordArr.length; i++) {
            for (j = 5; j < vowels.length; j++) {
                if (wordArr[i].charAt(0) == vowels[j]) {
                    count2++;
                }
            }
        }

        System.out.println("There Are " + count2 + " Words Starting with Capital Letter");
    }
}