package com.twschool.practice;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IsFormatAnswerTest {
    @Test
    public void should_get_true_when_given_1234_split_with_comma(){
        //given
        String[] userAnswer = {"1","2","3","4"};
        //when
        IsFormatAnswer isFormatAnswer = new IsFormatAnswer();
        //then
        Assert.assertTrue(isFormatAnswer.checkUserAnswer(userAnswer));
    }
}
