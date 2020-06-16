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
}
