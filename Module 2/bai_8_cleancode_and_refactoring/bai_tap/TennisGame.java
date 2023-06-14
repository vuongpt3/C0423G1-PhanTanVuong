package bai_8_cleancode_and_refactoring.bai_tap;

public class TennisGame {
    public static String getScore(String player1Name, String player2Name, int player1Score, int player2Score) {
        String score = "";

        if (player1Score == player2Score) {
            switch (player1Score) {
                case 0:
                    score = "Love-All";
                    break;
                case 1:
                    score = "Fifteen-All";
                    break;
                case 2:
                    score = "Thirty-All";
                    break;
                case 3:
                    score = "Forty-All";
                    break;
                default:
                    score = "Deuce";
                    break;
            }
        } else if (player1Score >= 4 || player2Score >= 4) {
            int scoreDifference = player1Score - player2Score;
            if (scoreDifference == 1)
                score = "Advantage player1";
            else if (scoreDifference == -1)
                score = "Advantage player2";
            else if (scoreDifference >= 2)
                score = "Win for player1";
            else
                score = "Win for player2";
        } else {
            for (int i = 1; i < 3; i++) {
                int tempScore = (i == 1) ? player1Score : player2Score;
                switch (tempScore) {
                    case 0:
                        score += "Love";
                        break;
                    case 1:
                        score += "Fifteen";
                        break;
                    case 2:
                        score += "Thirty";
                        break;
                    case 3:
                        score += "Forty";
                        break;
                }
                if (i == 1)
                    score += "-";
            }
        }
        return score;
    }
}
