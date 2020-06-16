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
}
