public class Main {
    public static void main(String[] args) {

       int newScore =  calculateScore("Tim",500);
        System.out.println("New Score is "+newScore);

        calculateScore(75);
    }

    //
    //Method Overloading occurs when a class has a multiple methods with the same name but the method are declared with different parameters
    //Change the signature of method (no of parameters, order, type)
    //Change the return type of the method doesn't make it unique
    public static int calculateScore(String playerName,int score){

        System.out.println("Player "+playerName+ "Scored "+score+" points");
        return score * 1000;
    }

    public static int calculateScore(int score){

        System.out.println("Unnamed player Scored "+score+" points");
        return score * 1000;
    }
}