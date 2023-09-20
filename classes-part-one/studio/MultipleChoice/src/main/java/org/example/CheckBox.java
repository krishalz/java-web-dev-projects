package org.example;
import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class CheckBox extends Question {

    private List<String> multiAnswers;
    private List<Integer> correctAnswers;

    public CheckBox(String qText, String qType, String[] answerChoices, int correctAnswer, boolean isCorrect) {
        super(qText, qType, answerChoices, correctAnswer, isCorrect);

        }
    public CheckBox(String qText, List<String> multiAnswers, List<Integer> correctAnswers) {
        super(qText);
        this.multiAnswers = multiAnswers;
        this.correctAnswers = correctAnswers;

    }
    @Override
    public void displayQuestion() {
        System.out.println(getQText());
        for (int i = 0; i < multiAnswers.size(); i++) {
            System.out.println((char) ('A' + i) + ") " + multiAnswers.get(i));
        }
    }

    @Override
    public boolean checkAnswer(String userAnswer) {
        String[] userResponses = userAnswer.split("");
        List<Integer> userSelectedAnswers = new ArrayList<>();

        for (String response : userResponses) {
            int selectedAnswer = response.toUpperCase().charAt(0) - 'A';
            userSelectedAnswers.add(selectedAnswer);

        }
        return userSelectedAnswers.containsAll(correctAnswers) && correctAnswers.containsAll(userSelectedAnswers);
    }
}
