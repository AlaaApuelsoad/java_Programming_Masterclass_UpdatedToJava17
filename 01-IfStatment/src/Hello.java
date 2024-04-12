public class Hello {
    public static void main(String[] args) {

        System.out.println("Hello Alaa");


        boolean isAlien = false;
        if (!isAlien) {
            System.out.println("It is not an alien!!");
            System.out.println("And I am scared of aliens");
        }


        int topScore = 80;
        if (topScore < 100) {
            System.out.println("You got the high score");
        }

        int secondTopScore = 60;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Both conditions are true ");
        }

        if ((topScore > 90) || (topScore <= 90)) {
            System.out.println("Either or both of the conditions are true ");
        }

    }
}