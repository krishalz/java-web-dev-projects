package org.example;
import java.util.Scanner;
public class TrueFalse extends Question {
    public TrueFalse(String qText, String qType, boolean isCorrect) {
        super(qText, qType, isCorrect);

        Scanner input = new Scanner(System.in);
        String question = "Dark chocolate is the best (t/f)";
        String selectTrue = "a) True";
        String selectFalse = "b) False";

        System.out.println(question);
        System.out.println(selectTrue);
        System.out.println(selectFalse);

        System.out.print("Enter your choice (t or f): ");
        String saveChoice = input.nextLine().toUpperCase();
        if(saveChoice.equals("T")) {
            System.out.println("Yes! DARK chocolate!");
        } else {
            System.out.println("Eww. No.");
        }
        input.close();


    }
}