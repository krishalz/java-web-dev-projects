package org.example;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Quiz {

    //has a list of questions and should be able to:
    //add questions, run or carry out the quiz, and grade the quiz

    private List<Question> questions;
    private int totalQuestions;
    private int correctAnswers;

    public Quiz() {
        questions = new ArrayList<>();
        totalQuestions = 0;
        correctAnswers = 0;
    }

    public void addQuestion (Question question) {
        questions.add(question);
        totalQuestions++;
    }

    public void start() {
        Scanner input = new Scanner(System.in);
        for (Question question : questions) {
            question.displayQuestion();
            System.out.println("Your answer: ");
            String userAnswer = input.nextLine();

            if (question.checkAnswer(userAnswer)) {
                System.out.println("Correct answer!");
                correctAnswers++;
            } else {
                System.out.println("Incorrect answer.");
            }
        }

        double score = (double) correctAnswers / totalQuestions * 100;
        System.out.println("End of Quiz. ");
        System.out.println("Your Score: " + score + "%");

        input.close();
    }
}
