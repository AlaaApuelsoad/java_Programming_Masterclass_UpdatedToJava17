public class Main {
    public static void main(String[] args) {


        //Traditional Switch Statement
        int switchValue = 4;

        switch (switchValue){
            case 1:
                System.out.println("value was 1");
                break;
            case 2:
                System.out.println("value was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("value was 3,4 or 5");
                System.out.println("Actually it was: "+switchValue);
                break;
            default:
                System.out.println("was not 1,2,3,4 or 5");
                break;
        }

        //Enhanced switch statement
        switch (switchValue){
            case 1 -> System.out.println("value was 1");
            case 2 -> System.out.println("value was 2");
            case 3,4,5 ->{
                System.out.println("value was 3,4 or 5");
                System.out.println("Actually it was:"+switchValue);
            }
            default -> System.out.println("was not 1,2,3,4 or 5");
        }

        String month  = "April";
        System.out.println(month+" is in the "+getQuarter(month)+" Quarter");
    }

    public static String getQuarter(String month){

        return switch (month.toLowerCase()) {
            case "january", "february", "march" -> "1st";
            case "april", "may", "june" -> "2nd";
            case "july", "august", "september" -> "1st";
            case "october", "november", "december" -> "1st";
            default -> "bad";
        };

//        switch (month.toLowerCase()){
//            case "january":
//            case"february":
//            case "march":
//                return "1st";
//            case "april":
//            case"may":
//            case "june":
//                return "2nd";
//            case "july":
//            case"august":
//            case "september":
//                return "3rd";
//            case "october":
//            case"november":
//            case "december":
//                return "4th";
//        }
//        return "bad";


    }

}