public class MethodChallenge {
    public static void main(String[] args) {
        String name = "Cassius";
        int position1 = calculateHighScorePosition(1500);
        int position2 = calculateHighScorePosition(1000);
        int position3 = calculateHighScorePosition(500);
        int position4 = calculateHighScorePosition(100);
        int position5 = calculateHighScorePosition(25);

        displayHighScorePosition(name, position1);
        displayHighScorePosition(name, position2);
        displayHighScorePosition(name, position3);
        displayHighScorePosition(name, position4);
        displayHighScorePosition(name, position5);
    }

    public static void displayHighScorePosition(String name, int position) {
        System.out.println(name + " managed to get into position " + position + " on the high score list");
    }

    public static int calculateHighScorePosition(int score) {
        int position = 4;
        if (score >= 1000) {
            position = 1;
        } else if (score >= 500) {
            position = 2;
        } else if (score >= 100) {
            position = 3;
        }
        return position;
    }
}
