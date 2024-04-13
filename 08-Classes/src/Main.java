public class Main {
    public static void main(String[] args) {

        Account account1 = new Account();
//        Account account1 = new Account("123456",1000.00,"Alaa Apuelsoad",
//                "alaa@gmail.com","01118676511");

//        account1.setNumber("123456");
//        account1.setBalance(1000.00);
//        account1.setCustomerName("Alaa Apuelsoad");
//        account1.setCustomerEmail("alaa@gmail.com");
//        account1.setCustomerPhone("01118676511");

        System.out.println(account1.getBalance());
        System.out.println(account1.getCustomerEmail());

        account1.depositFunds(100.00);
        account1.depositFunds(100.00);
        account1.withdrawFunds(150.00);
        account1.withdrawFunds(50.00);

    }
}