package bai_8_cleancode_and_refactoring.bai_tap;

public class TennisGame3 {
    public static String getScore(String player1Name, String player2Name, int player1Score, int player2Score) {
        if (player1Score == player2Score) {
            return getEqualScore(player1Score);
        } else if (player1Score >= 4 || player2Score >= 4) {
            return getAdvantageOrWinScore(player1Score, player2Score);
        } else {
            return getRegularScore(player1Score, player2Score);
        }
    }

    private static String getEqualScore(int score) {
        String[] scoreNames = {"Love-All", "Fifteen-All", "Thirty-All", "Forty-All", "Deuce"};
        if (score <= 3) {
            return scoreNames[score];
        } else {
            return scoreNames[4];
        }
    }

    private static String getAdvantageOrWinScore(int player1Score, int player2Score) {
        return getString(player1Score, player2Score);
    }

    static String getString(int player1Score, int player2Score) {
        int minusResult = player1Score - player2Score;
        if (minusResult == 1) {
            return "Advantage player1";
        } else if (minusResult == -1) {
            return "Advantage player2";
        } else if (minusResult >= 2) {
            return "Win for player1";
        } else {
            return "Win for player2";
        }
    }

    private static String getRegularScore(int player1Score, int player2Scoe) {
        String[] scoreNames = {"Love", "Fifteen", "Thirty", "Forty"};
        return scoreNames[player1Score] + "-" + scoreNames[player2Scoe];
    }
}
