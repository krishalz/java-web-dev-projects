package org.example;

public abstract class Question {
    private String qText; //hmmm...is this needed here? each type of question will have question text so...
    private String qType; //holds value of type of question

    String[] answerChoices;
    private int correctAnswer;
    private boolean isCorrect = false;

    //Question is a base class that contains the common features, and design subclasses for each of the question types
    //Each question type should include: class name, fields w/properties and access modifiers, methods with access modifiers, and inheritance relationship
    //functionality should be able to display the questions, display the possible answers, and check to see if correct

    public Question(String qText, String qType, String[] answerChoices, int correctAnswer, boolean isCorrect) {
        this.qText = qText;
        this.qType = qType;
        this.answerChoices = answerChoices;
        this.correctAnswer = correctAnswer;
        this.isCorrect = isCorrect;
    }

    public String getQText() {
        return qText;
    }

    public void setQText(String qText) {
        this.qText = qText;
    }

    public String getQType() {
        return qType;
    }

    public void setQType(String qType) {
        this.qType = qType;
    }

    public boolean isCorrect() {
        return isCorrect;
    }

    public void setCorrect(boolean isCorrect) {
        this.isCorrect = isCorrect;
    }

    public void displayQuestion() {
        System.out.println(qText);
        for (int i=0; i < answerChoices.length; i++) {
            System.out.println((char)('A' + i) + ") " + answerChoices[i]);
        }
    }

    public boolean checkAnswer(String userAnswer) {
       int selectedAnswer = userAnswer.toUpperCase().charAt(0) - 'A';
       return selectedAnswer == correctAnswer;
    }
}

