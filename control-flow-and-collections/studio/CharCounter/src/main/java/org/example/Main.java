package org.example;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string to parse by characters: ");
        String inputStr = input.nextLine().toUpperCase();
  //      String inputStr = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
        Map<Character, Integer> charCountMap = countChars(inputStr);

        for (Map.Entry<Character, Integer> entry: charCountMap.entrySet()) {

            System.out.println(entry.getKey() + ": " + entry.getValue() + " times");

        }
    }

    public static Map<Character, Integer> countChars(String input) {
        Map<Character, Integer> charCountMap = new HashMap<>();

        for (char c : input.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
            }

        }
        return charCountMap;
    }
}