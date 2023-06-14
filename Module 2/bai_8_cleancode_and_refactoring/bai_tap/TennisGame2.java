package bai_8_cleancode_and_refactoring.bai_tap;

import static bai_8_cleancode_and_refactoring.bai_tap.TennisGame3.getString;

public class TennisGame2 {
    public static String getScore(String player1Name, String player2Name, int player1Score, int player2Score) {
        String score = "";

        if (player1Score == player2Score) {
            score = getEqualScore(player1Score);
        } else if (player1Score >= 4 || player2Score >= 4) {
            score = getAdvantageOrWinScore(player1Score, player2Score);
        } else {
            score = getRegularScore(player1Score, player2Score);
        }

        return score;
    }

    private static String getEqualScore(int score) {
        String result;
        switch (score) {
            case 0:
                result = "Love-All";
                break;
            case 1:
                result = "Fifteen-All";
                break;
            case 2:
                result = "Thirty-All";
                break;
            case 3:
                result = "Forty-All";
                break;
            default:
                result = "Deuce";
                break;
        }
        return result;
    }

    private static String getAdvantageOrWinScore(int player1Score, int player2Score) {
        return getString(player1Score, player2Score);
    }

    private static String getRegularScore(int player1Score, int player2Score) {
        StringBuilder score = new StringBuilder();
        for (int i = 1; i < 3; i++) {
            int tempScore = (i == 1) ? player1Score : player2Score;
            score.append(getScoreString(tempScore));
            if (i == 1)
                score.append("-");
        }
        return score.toString();
    }

    private static String getScoreString(int score) {
        String result;
        switch (score) {
            case 0:
                result = "Love";
                break;
            case 1:
                result = "Fifteen";
                break;
            case 2:
                result = "Thirty";
                break;
            case 3:
                result = "Forty";
                break;
            default:
                result = "";
                break;
        }
        return result;
    }
}
