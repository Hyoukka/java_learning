public class Challenge {
    public static void main(String[] args) {
        int result = calculateScore(500, 6, 100);
        System.out.println("Your score is: " + result);
    }

    public static int calculateScore(int score, int levelCompleted, int bonus) {
        boolean isGameOver = true;

        int finalScore = score;

        if (isGameOver) {
            finalScore += (bonus * levelCompleted);
        }
        return finalScore;
    }
}

