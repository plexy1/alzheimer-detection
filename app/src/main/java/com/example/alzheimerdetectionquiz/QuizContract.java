package com.example.alzheimerdetectionquiz;

import android.provider.BaseColumns;

public final class QuizContract {

    private QuizContract(){}


    public static class QuestionTable implements BaseColumns {
        public static final String TABLE_NAME = "quiz_questions";
        public static final String COLUMN_QUESTION = "question";
        public static final String COLUMN_OPTION1 = "Option1";
        public static final String COLUMN_OPTION2 = "Option2";
        public static final String COLUMN_OPTION3 = "Option3";
        public static final String COLUMN_ANSWER_NR = "answer_nr";






    }
}
