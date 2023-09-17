package org.example;

public abstract class Question {
    private String qText;
    private String qType;
    private boolean isCorrect = false;

    public Question(String qText, String qType, boolean isCorrect) {
        this.qText = qText;
        this.qType = qType;
        this.isCorrect = isCorrect;
    }

    public String getqText() {
        return qText;
    }

    public void setqText(String qText) {
        this.qText = qText;
    }

    public String getqType() {
        return qType;
    }

    public void setqType(String qType) {
        this.qType = qType;
    }

    public boolean isCorrect() {
        return isCorrect;
    }

    public void setCorrect(boolean isCorrect) {
        this.isCorrect = isCorrect;
    }

}

