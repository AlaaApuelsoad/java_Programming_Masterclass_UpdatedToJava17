public class Account {

    private String number;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerPhone;


    public Account(){
        this("56789",2.50,"Default name",
                "Default address","Default phone");
        System.out.println("Empty constructor called");
    }

    public Account(String number, double balance, String customerName, String customerEmail, String customerPhone) {
        System.out.println("Account Constructor with parameters called");
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhone = customerPhone;
    }

    public void depositFunds(double depositAmount){

        balance += depositAmount;
        System.out.println("Deposit of $ "+depositAmount+" made new balance is $ "+getBalance());
    }

    public void withdrawFunds(double withdrawAmount){

        if (balance - withdrawAmount < 0){
            System.out.println("Insufficient Funds! You only have $ "+getBalance()+" in your account.");
        }else {
            balance -= withdrawAmount;
            System.out.println("Withdraw of $ "+withdrawAmount+" made your new balance = $ "+balance);
        }
    }
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    @Override
    public String toString() {
        return "Account{" +
                "number='" + number + '\'' +
                ", balance=" + balance +
                ", customerName='" + customerName + '\'' +
                ", customerEmail='" + customerEmail + '\'' +
                ", customerPhone='" + customerPhone + '\'' +
                '}';
    }
}
