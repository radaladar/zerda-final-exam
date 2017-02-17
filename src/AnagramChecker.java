/// Created by BB on 2017-02-17.

import java.util.Arrays;
import java.util.Scanner;

public class AnagramChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your first string! \n>> ");
        String string1 = input.nextLine();
        System.out.print("Enter your second string! \n>> ");
        String string2 = input.nextLine();
        String[] stringsToCheck = new String[] {string1, string2};
        char[][] charactersToCheck = new char[2][];
        for (int i = 0; i < 2; i++) {
            charactersToCheck[i] = stringsToCheck[i]
                    .toLowerCase()
                    .replace("\\s", "")
                    .toCharArray();
        }
        for (char[] charArray : charactersToCheck) {
            Arrays.sort(charArray);
        }
        if (Arrays.equals(charactersToCheck[0], charactersToCheck[1])) {
            System.out.println("These are anagrams.");
        } else {
            System.out.println("These are not anagrams.");
        }
    }
}
