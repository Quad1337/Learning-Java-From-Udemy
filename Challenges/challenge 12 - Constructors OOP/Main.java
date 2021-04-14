public class Main {

    public static void main(String[] args) {
/////////////////////////////////////////////////////////////////CHALLENGE 1 SENTENCE////////////////////////////////////////////////////////////////////
        // Create a new class for a bank account
        // Create fields for the account number, balance, customer name, email and phone number.
        //
        // Create getters and setters for each field
        // Create two additional methods
        // 1. To allow the customer to deposit funds (this should increment the balance field).
        // 2. To allow the customer to withdraw funds. This should deduct from the balance field,
        // but not allow the withdrawal to complete if their are insufficient funds.
        // You will want to create various code in the Main class (the one created by IntelliJ) to
        // confirm your code is working.
        // Add some System.out.println's in the two methods above as well.

        //        Account bobsAccount = new Account(); // "12345", 0.00, "Bob Brown", "myemail@bob.com",
        //              //  "(087) 123-4567");
        //        System.out.println(bobsAccount.getNumber());
        //        System.out.println(bobsAccount.getBalance());
        //
        //        bobsAccount.withdrawal(100.0);
        //
        //        bobsAccount.deposit(50.0);
        //        bobsAccount.withdrawal(100.0);
        //
        //        bobsAccount.deposit(51.0);
        //        bobsAccount.withdrawal(100.0);
        //
        //        Account timsAccount = new Account("Tim", "tim@email.com","12345");
        //        System.out.println(timsAccount.getNumber() + " name " + timsAccount.getCustomerName());
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////



/////////////////////////////////////////////////////////////////CHALLENGE 1 RESULTS////////////////////////////////////////////////////////////////////

        BankAccount bobosAccount = new BankAccount();//("25", 500, "Bobo Gibonul", "piticdegradina@minion.com", "048484293");
        System.out.println("Account number: " + bobosAccount.getAccountnumber());
        System.out.println("Balance: " + bobosAccount.getBalance());
        System.out.println("Name: " +bobosAccount.getCustomername());
        System.out.println("Email: " + bobosAccount.getEmail());
        System.out.println("Phone number: " + bobosAccount.getPhonenumber());

        bobosAccount.withdrawal(100.0);

        bobosAccount.deopsit(50);
        bobosAccount.withdrawal(100);

        bobosAccount.deopsit(51);
        bobosAccount.withdrawal(100);

        BankAccount cipriAccount = new BankAccount("Cupri", "pitic@yahoo.com", "538493");
        System.out.println(cipriAccount.getAccountnumber() + " name " + cipriAccount.getCustomername());

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////



/////////////////////////////////////////////////////////////////CHALLENGE 2 SENTENCE////////////////////////////////////////////////////////////////////

        // Create a new class VipCustomer
        // it should have 3 fields name, credit limit, and email address.
        // create 3 constructors
        // 1st constructor empty should call the constructor with 3 parameters with default values
        // 2nd constructor should pass on the 2 values it receives and add a default value for the 3rd
        // 3rd constructor should save all fields.
        // create getters only for this using code generation of intellij as setters wont be needed
        // test and confirm it works.
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


/////////////////////////////////////////////////////////////////CHALLENGE 2 RESULT////////////////////////////////////////////////////////////////////
        VipCustomer newVip = new VipCustomer();
        System.out.println(newVip.getName());

        VipCustomer newVip2 = new VipCustomer("Bobo", "bobo@gmail.com");
        System.out.println(newVip2.getName());

        VipCustomer newVip3 = new VipCustomer("Tim", "tim@gmail.com", 20000);
        System.out.println(newVip3.getName());
        System.out.println(newVip3.getEmail());
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
   }
}
