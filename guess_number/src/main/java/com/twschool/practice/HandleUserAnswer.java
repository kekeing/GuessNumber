package com.twschool.practice;

import java.util.Arrays;

public class HandleUserAnswer {
    public String handleUserAnswerStandardAnswer(String[] userAnswer,String[] standardAnswer){
        int correctNumberCorrectPositionCount = 0;
        int correctNumberIncorrectPositionCount = 0;
        for (String userAnswerString : userAnswer){
            if (Arrays.asList(standardAnswer).contains(userAnswerString)){
                if (Arrays.asList(standardAnswer).indexOf(userAnswerString) == Arrays.asList(userAnswer).indexOf(userAnswerString)){
                    correctNumberCorrectPositionCount ++;
                }else{
                    correctNumberIncorrectPositionCount ++;
                }
            }
        }
        return correctNumberCorrectPositionCount + "A" + correctNumberIncorrectPositionCount + "B";
    }
}
