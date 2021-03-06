package com.twschool.practice;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuessNumberTest {
    @Test
    public void should_get_0A0B_when_answer_given_input_string_1234_answer_string_5678(){
    //given
        String[] userAnswer = {"1","2","3","4"};
        String[] standardAnswer = {"5","6","7","8"};
        String expectResult = "0A0B";
     //when
        HandleUserAnswer handleUserAnswer = new HandleUserAnswer();
        String result = handleUserAnswer.handleUserAnswerStandardAnswer(userAnswer,standardAnswer);
     //then
        assertEquals(expectResult,result);
    }
    @Test
    public void should_get_0A2B_when_answer_given_input_string_1256_answer_string_5678(){
        //given
        String[] userAnswer = {"1","2","5","6"};
        String[] standardAnswer = {"5","6","7","8"};
        String expectResult = "0A2B";
        //when
        HandleUserAnswer handleUserAnswer = new HandleUserAnswer();
        String result = handleUserAnswer.handleUserAnswerStandardAnswer(userAnswer,standardAnswer);
        //then
        assertEquals(expectResult,result);
    }
    @Test
    public void should_get_0A4B_when_answer_given_input_string_6785_answer_string_5678(){
        //given
        String[] userAnswer = {"6","7","8","5"};
        String[] standardAnswer = {"5","6","7","8"};
        String expectResult = "0A4B";
        //when
        HandleUserAnswer handleUserAnswer = new HandleUserAnswer();
        String result = handleUserAnswer.handleUserAnswerStandardAnswer(userAnswer,standardAnswer);
        //then
        assertEquals(expectResult,result);
    }
    @Test
    public void should_get_1A2B_when_answer_given_input_string_5967_answer_string_5678(){
        //given
        String[] userAnswer = {"5","9","6","7"};
        String[] standardAnswer = {"5","6","7","8"};
        String expectResult = "1A2B";
        //when
        HandleUserAnswer handleUserAnswer = new HandleUserAnswer();
        String result = handleUserAnswer.handleUserAnswerStandardAnswer(userAnswer,standardAnswer);
        //then
        assertEquals(expectResult,result);
    }
    @Test
    public void should_get_1A3B_when_answer_given_input_string_5867_answer_string_5678(){
        //given
        String[] userAnswer = {"5","8","6","7"};
        String[] standardAnswer = {"5","6","7","8"};
        String expectResult = "1A3B";
        //when
        HandleUserAnswer handleUserAnswer = new HandleUserAnswer();
        String result = handleUserAnswer.handleUserAnswerStandardAnswer(userAnswer,standardAnswer);
        //then
        assertEquals(expectResult,result);
    }
    @Test
    public void should_get_4A0B_when_answer_given_input_string_5678_answer_string_5678(){
        //given
        String[] userAnswer = {"5","6","7","8"};
        String[] standardAnswer = {"5","6","7","8"};
        String expectResult = "4A0B";
        //when
        HandleUserAnswer handleUserAnswer = new HandleUserAnswer();
        String result = handleUserAnswer.handleUserAnswerStandardAnswer(userAnswer,standardAnswer);
        //then
        assertEquals(expectResult,result);
    }
    @Test
    public void should_get_true_when_isGameOver_given_input_4A0B_remained_chances_is4(){
        //given
        String handleUserAnswerResult = "4A0B";
        int remainedChances = 4;
        String expectDescription = "Success";
        Boolean expectIsSuccess = true;
        //when
        HandleGameOver handleUserAnswer  = new HandleGameOver();
        GameResultInfo exceptGameResultInfo = handleUserAnswer.getGameResultInfo(handleUserAnswerResult,remainedChances);
        //then
        assertEquals(expectDescription,exceptGameResultInfo.getDescription());
        assertEquals(expectIsSuccess,exceptGameResultInfo.getOver());
    }
    @Test
    public void should_get_true_when_isGameOver_given_input_1A3B_remained_chances_is0(){
        //given
        String handleUserAnswerResult = "1A3B";
        int remainedChances = 0;
        String expectDescription = "Lose";
        Boolean expectIsSuccess = true;
        //when
        HandleGameOver handleUserAnswer  = new HandleGameOver();
        GameResultInfo exceptGameResultInfo = handleUserAnswer.getGameResultInfo(handleUserAnswerResult,remainedChances);
        //then
        assertEquals(expectDescription,exceptGameResultInfo.getDescription());
        assertEquals(expectIsSuccess,exceptGameResultInfo.getOver());
    }
    @Test
    public void should_get_false_when_isGameOver_given_input_1A3B_remained_chances_is3(){
        //given
        String handleUserAnswerResult = "1A3B";
        int remainedChances = 3;
        String expectDescription = "Continue";
        Boolean expectIsSuccess = false;
        //when
        HandleGameOver handleUserAnswer  = new HandleGameOver();
        GameResultInfo exceptGameResultInfo = handleUserAnswer.getGameResultInfo(handleUserAnswerResult,remainedChances);
        //then
        assertEquals(expectDescription,exceptGameResultInfo.getDescription());
        assertEquals(expectIsSuccess,exceptGameResultInfo.getOver());
    }
}
