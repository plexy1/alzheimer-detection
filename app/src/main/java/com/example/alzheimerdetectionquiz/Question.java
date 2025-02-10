package com.example.alzheimerdetectionquiz;

public class Question {
    private String question;
    private String Option1;
    private String Option2;
    private String Option3;
    private int answerNr;

    public Question()  {}

    public Question(String question, String option1, String option2, String option3, int answerNr) {
        this.question = question;
        Option1 = option1;
        Option2 = option2;
        Option3 = option3;
        this.answerNr = answerNr;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getOption1() {
        return Option1;
    }

    public void setOption1(String option1) {
        Option1 = option1;
    }

    public String getOption2() {
        return Option2;
    }

    public void setOption2(String option2) {
        Option2 = option2;
    }

    public String getOption3() {
        return Option3;
    }

    public void setOption3(String option3) {
        Option3 = option3;
    }

    public int getAnswerNr() {
        return answerNr;
    }

    public void setAnswerNr(int answerNr) {
        this.answerNr = answerNr;
    }
}
