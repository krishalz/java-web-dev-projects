package org.example;

import java.util.List;

public class QuizRunner {
    public static void main(String[] args) {
        //this was originally Main and I refactored it to be named QuizRunner
        //this should create several questions
        //present the questions to the user
        //accept the user's responses
        //tell them if their answers were correct or not
        //submit by pushing work to GitHub repo in Lesson 6 Studio assignment on Canvas

        //set up answers for CB questions so multiple answers are accepted
        List<String> multiChoicesQ1 = List.of("Milk", "Dark", "White", "Unsweetened", "Ebony", "Ivory", "Pickle Berry");
        List<Integer> correctAnswersQ1 = List.of(0,1,2,3);
        List<String> multiChoicesQ2 = List.of("Reece's","Hershey","Skittles","M&Ms");
        List<Integer> correctAnswersQ2 = List.of(0,1,3); //that's right no one likes Skittles

        //create quiz questions
        Quiz quiz = new Quiz();
        quiz.addQuestion(new MultipleChoice("What is the best type of chocolate?", "MC", new String[]{"Milk", "Dark", "White", "Unsweetened"}, 1, true));
        quiz.addQuestion(new CheckBox("What are valid types of chocolate?", multiChoicesQ1, correctAnswersQ1));
        quiz.addQuestion(new CheckBox("What kinds of candy do you like?", multiChoicesQ2, correctAnswersQ2));
        quiz.addQuestion(new TrueFalse("Is dark chocolate is the best (t/f) ", "TF", new String[]{"True", "False"},0, true));
        //I could add more questions here


        //start the quiz!
        quiz.start();
    }
}