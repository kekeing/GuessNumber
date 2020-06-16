package com.twschool.practice;

public class HandleGameOver {
    public GameResultInfo getGameResultInfo(String handleUserAnswerResult,int remainedChances){
        GameResultInfo gameResultInfo = new GameResultInfo();
        if ("4A0B".equals(handleUserAnswerResult) || remainedChances == 0){
            gameResultInfo.setOver(true);
            if ("4A0B".equals(handleUserAnswerResult)){
                gameResultInfo.setDescription("Success");
            }else{
                gameResultInfo.setDescription("Lose");
            }
        }else{
            gameResultInfo.setOver(false);
            gameResultInfo.setDescription("Continue");
        }
        return gameResultInfo;
    }
}
