package org.example;

public class QuizRunner {
    public static void main(String[] args) {
        //this was originally Main and I refactored it to be named QuizRunner
        //this should create several questions
        //present the questions to the user
        //accept the user's responses
        //tell them if their answers were correct or not
        //submit by pushing work to GitHub repo in Lesson 6 Studio assignment on Canvas

        Quiz quiz = new Quiz();
        quiz.addQuestion(new MultipleChoice("What is the best type of chocolate?", "MC", new String[]{"Milk", "Dark", "White", "Unsweetened"}, 1, true));
        quiz.addQuestion(new CheckBox("What are all types of chocolate?", "CB", new String[]{"Milk", "Dark", "White", "Unsweetened", "Ebony", "Ivory"},0,true));
        quiz.addQuestion(new TrueFalse("Is dark chocolate is the best (t/f) ", "TF", new String[]{"True", "False"},0, true));

        //add more questions here
        //start the quiz!
        quiz.start();
    }
}