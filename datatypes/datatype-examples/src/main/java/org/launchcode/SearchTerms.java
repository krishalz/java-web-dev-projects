package org.launchcode;
import java.util.Scanner;
// ex D Strings search for a term in a sentence
public class SearchTerms {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the term to search for:");
        String searchTerm = input.nextLine().toLowerCase(); // convert input to lc

        String sentenceOG = "Alice was beginning to get very tired of sitting " +
                "by her sister on the bank, and of having nothing " +
                "to do; once or twice she had peeped into the book " +
                "her sister was reading, but it had no pictures or " +
                "conversations in it, 'and what is the use of a book,' " +
                "thought Alice, 'without pictures of conversation?'";

        //convert the string to all lower case
        sentenceOG = sentenceOG.toLowerCase();
        //check to see if the searchTerm is in sentenceOG
        if (sentenceOG.contains(searchTerm)) {
            System.out.println("Your word, " + searchTerm + ", was found in the original sentence.");
        } else {
            System.out.println("Your word, " + searchTerm + ", was not found.");
        }

        // ex E extend String and remove search term from the sentence
        Integer index = sentenceOG.indexOf(searchTerm);
        Integer numChars = searchTerm.length();
        System.out.println(searchTerm + " appears at index " + index + ". It is " + numChars + " characters long.");
        String modifiedSentence = sentenceOG.replace(searchTerm, "");
        System.out.println(modifiedSentence);

    }
}
