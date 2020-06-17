package com.twschool.practice;

import java.util.Arrays;
import java.util.Random;

public class GeneratorStandardAnswer {
    public String[] generateStandardAnswer(){
        int counts = 4;
        String[] standardAnswer = new String[4];
        for (int i = 0;i < 4;i++){
            int random = new Random().nextInt(10);
            if (!Arrays.asList(standardAnswer).contains(random)){
            standardAnswer[i] = String.valueOf(random);
            }
            i--;
        }
        return standardAnswer;
    }
}
