public class BankAccount {
    private String customername;
    private String accountnumber;
    private String email;
    private String phonenumber;
    private double balance;

    public BankAccount (){
        this("100", 2.50, "Default Name", "Default email", "Default phone number");
        System.out.println("Empty constructor called");
    }

    public BankAccount(String accountnumber, double balance, String customername, String email, String phonenumber){
        System.out.println("Account construtor with parameters called");
        this.accountnumber = accountnumber;
        this. balance = balance;
        this. customername = customername;
        this.email = email;
        this.phonenumber = phonenumber;

    }

    public BankAccount(String customername, String email, String phonenumber) {
        this("99999", 100.55, customername, email, phonenumber);
        this.customername = customername;
        this.email = email;
        this.phonenumber = phonenumber;
    }

    public String getCustomername() {
        return customername;
    }

    public void setCustomername(String customername) {
        this.customername = customername;
    }

    public String getAccountnumber() {
        return accountnumber;
    }

    public void setAccountnumber(String accountnumber) {
        this.accountnumber = accountnumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deopsit (double depositAmount){
        this.balance += depositAmount;
        System.out.println("Deposit of " +depositAmount+ " made. New balance is " + this.balance);
    }

    public void withdrawal(double withdrawalAmount){
        if(balance - withdrawalAmount < 0) {
            System.out.println("Only " + this.balance + " available. Withdrawal not processed ");
        }else {
            this.balance -= withdrawalAmount;
            System.out.println("Withdrawal of " +withdrawalAmount+ " processed. Remaining balance = " + this.balance);
        }
    }
}
