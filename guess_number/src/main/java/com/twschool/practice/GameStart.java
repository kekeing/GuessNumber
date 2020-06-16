package com.twschool.practice;

import java.util.Scanner;

public class GameStart {
    public static void main(String[] args) {
        int i = 0;
        Scanner scanner = new Scanner(System.in);
        while (i < 1) {
            if (scanner.hasNext()) {
                String inputString = scanner.nextLine();
                System.out.println(inputString);
                String[] userAnswer = inputString.split(",");
                for (String userAnswerString : userAnswer) {
                    System.out.println(userAnswerString);
                }
            }
        }
        scanner.close();
    }
}
