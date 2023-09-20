package org.example;
import java.util.Scanner;


public class MultipleChoice extends Question {
//public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    String question = "What is the best type of chocolate?";
    String choiceMilk = "a) Milk Chocolate";
    String choiceDark = "b) Dark Chocolate";
    String choiceWhite = "c) White Chocolate";
    String choiceUnSweet = "d) Unsweetened Chocolate";



    public MultipleChoice(String qText, String qType, String[] answerChoices, int correctAnswer, boolean isCorrect) {
        super(qText, qType, answerChoices, correctAnswer, isCorrect);




    System.out.println("Question: "+question);
    System.out.println(choiceMilk);
    System.out.println(choiceDark);
    System.out.println(choiceWhite);
    System.out.println(choiceUnSweet);

    System.out.print("Enter your choice (a, b, c, or d): ");
    String saveChoice = input.nextLine().toUpperCase();
    if(saveChoice.equals("B"))

    {
        System.out.println("Yes! Of course it is DARK chocolate!");
    } else

    {
        System.out.println("Sorry. Everybody knows it's DARK chocolate.");
    }
    input.close();
}
}
