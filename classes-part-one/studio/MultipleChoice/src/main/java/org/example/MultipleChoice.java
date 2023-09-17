package org.example;
import java.util.Scanner;


public class MultipleChoice { //extends Question {
public static void main(String[] args) {


 //   public MultipleChoice(String qText, String qType, boolean isCorrect) {
//        super(qText, qType, isCorrect);

    Scanner input = new Scanner(System.in);
    String question = "What is the best type of chocolate?";
    String choiceMilk = "a) Milk Chocolate";
    String choiceDark = "b) Dark Chocolate";
    String choiceWhite = "c) White Chocolate";
    String choiceUnSweet = "d) Unsweetened Chocolate";

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
