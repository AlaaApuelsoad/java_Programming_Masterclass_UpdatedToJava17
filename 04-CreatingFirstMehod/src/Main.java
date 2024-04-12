public class Main {
    public static void main(String[] args) {

        calculateScore(true,800,5,100);

        System.out.println(calculateMyAge(1999));

    }

    public static void calculateScore(boolean gameOver,int score,int levelCompleted,int bonus){

        int finaleScore = score;
        if (gameOver){
            finaleScore += levelCompleted * bonus;
            System.out.println("Your final score was: "+finaleScore);
        }
    }

    public static int calculateMyAge(int dateOfBirth){

        return (2024 - dateOfBirth);
    }
}