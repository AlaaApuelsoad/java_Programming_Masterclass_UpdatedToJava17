public class MethodChallenge {
    public static void main(String[] args) {

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Tim",highScorePosition);
    }

    public static void displayHighScorePosition(String playerName, int highScorePosition){

        System.out.println(playerName+" Managed to get into position:"+highScorePosition+" on the high score list");
    }

    public static int calculateHighScorePosition(int thePlayerScore){

        if (thePlayerScore >= 1000){
            return 1;
        } else if (thePlayerScore >= 500 && thePlayerScore < 1000) {
            return 2;
        } else if (thePlayerScore >= 100 && thePlayerScore < 500) {
            return 3;
        }else {
            return 4;
        }
    }
}
