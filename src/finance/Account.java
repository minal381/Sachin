package finance;

public class Account {

    private double balance;
    private String accountId;
    private static int NEXTID = 0;
    public static final int ROUTING_NUMBER = 12345;

    // Method for Deposit
    public void deposit(double amount)
    {
       balance = balance + amount;
    }
    // Method for Withdraw
    public void withdraw(double amount)
    {if(balance < amount)

    {  System.out.println("You can't withdraw due to insufficient balance.");}else{
    balance = balance - amount;

        }
    }

    // Method for Account details
    public void displayAccountDetails() {
        System.out.println("******* Account Information");
        System.out.println("Routing Number: " + ROUTING_NUMBER);
        System.out.println("Account Id: " + accountId);
        System.out.println("Balance: "+ balance);
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }


    public static String getNEXTID() {
        return  "ACCT# " + Account.NEXTID++;
    }

}
