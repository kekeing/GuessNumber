package com.twschool.practice;

import java.util.Scanner;

public class GameStart {
    public static void main(String[] args) {
        HandleUserAnswer handleUserAnswer = new HandleUserAnswer();
        GameResultInfo gameResultInfo = new GameResultInfo();
        HandleGameOver handleGameOver = new HandleGameOver();
        String[] standardAnswer = {"1","2","3","4"};
        int remainedChances = 6;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Game Start");
        System.out.println("please input four number between 0-9 and split with ','");
        while (remainedChances > 0) {
            if (scanner.hasNext()) {
                String inputString = scanner.nextLine();
                String[] userAnswer = inputString.split(",");
                String handleUserAnswerResult =handleUserAnswer.handleUserAnswerStandardAnswer(userAnswer,standardAnswer);
                System.out.println(handleUserAnswerResult);
                gameResultInfo = handleGameOver.getGameResultInfo(handleUserAnswerResult,remainedChances);
                if (gameResultInfo.getOver() && "Success".equals(gameResultInfo.getDescription())){
                    System.out.println("You win!!!");
                    break;
                }
            }
            remainedChances--;
        }
        if (remainedChances == 0 && "Lose".equals(gameResultInfo.getDescription())){
        System.out.println("You lose!!!");}
        scanner.close();
    }
}
