package org.example;
import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class CheckBox extends Question {

        Scanner input = new Scanner(System.in);

        String question = "Can you name all the different types of chocolate?";
        String[] types = {
                "a) Milk",
                "b) Dark",
                "c) White",
                "d) Raw",
                "e) Unsweetened",
                "f) Blonde",
                "g) Bitter",
        };

    public CheckBox(String qText, String qType, String[] answerChoices, int correctAnswer, boolean isCorrect) {
        super(qText, qType, answerChoices, correctAnswer, isCorrect);



    ArrayList<String> correctTypes = new ArrayList<>();
        correctTypes.add("A");
        correctTypes.add("B");
        correctTypes.add("C");
        correctTypes.add("D");
        correctTypes.add("E");
        correctTypes.add("F");
        correctTypes.add("G");
       // System.out.println("correctTypes is: " + correctTypes);
        System.out.println(question);
        for (String type : types) {
            System.out.println(type);
        }

        System.out.println("Enter all of your choices (a,b,c,d,e,f,g)");
        String userInput = input.nextLine().toUpperCase();

        String[] userChoices = userInput.split("");

        boolean allCorrect = true;
        for (String userChoice : userChoices) {
            if (!correctTypes.contains(userChoice)) {
                allCorrect = false;
                break;
            }
        }
        System.out.println("length of userChoices is: " + userChoices.length);
        if (allCorrect && (userChoices.length == correctTypes.size())) {
            System.out.println("Correct! Those are all types of chocolate!");
        } else {
            System.out.println("Oops! Yu don't know your chocolates yet. They are:");
            for (String userChoice : userChoices) {
                System.out.println(correctTypes + " ");
            }
        }
        input.close();
    }
}
