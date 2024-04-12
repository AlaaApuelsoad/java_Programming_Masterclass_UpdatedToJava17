public class Main {
    public static void main(String[] args) {

        //
        //The ternary operator is a shortcut to assigning one of two values to a variables, depending on a given condition
        //

        String makeOfCar = "Volkswagen";
        boolean isDomestic = (makeOfCar == "Volkswagen") ? false : true;

        if (isDomestic){
            System.out.println("This car is domestic to our country");
        }

        int ageOfClient = 20;
        String ageText = (ageOfClient >= 18) ? "Over Eighteen" : "Still a kid";
        System.out.println("Our Client is: "+ageText);


        //Challenge

        double myFirstValue = 20.00d;
        double mySecondValue = 80.00d;
        double myTotalValue = (myFirstValue + mySecondValue) * 100.00d;
        System.out.println("MyTotalValue = " +myTotalValue);

        double theRemainder = myTotalValue % 40.00d;
        System.out.println("The Remainder = "+ theRemainder);
        boolean isNoRemainder = (theRemainder == 0) ? true : false;
        System.out.println("isNoRemainder = " + isNoRemainder);

        if (!isNoRemainder){
            System.out.println("got some remainder");
        }
    }
}