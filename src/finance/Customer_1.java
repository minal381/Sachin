package finance;

public class Customer_1
{

    private String firstName;
    private String lastName;
    private Account account;
    private String userName;
    private String password;
    public boolean accountCreated = false;

    String[] userNames = {"John", "Jessica", "User1", "User2", "Foo" };

    int length = userNames.length;

    public Customer_1(String firstName, String lastName, String userName, String password)
    {
        this.firstName = firstName;

        this.lastName = lastName;

        this.userName = userName;

        for (String name : userNames) {
            if (userName == name) {
                System.out.println("Choose another User name.");
                return;
            }
        }

        if (userName.length() < 3) {
            System.out.println("User Id should be minimum 3 characters.");
            return;
        }

        this.password = password;
        int passwordLength = password.length();

        if (passwordLength < 8) {
            System.out.println("Password should be minimum 8 characters long");
            return;
        } else if (password.contains(userName)) {
            System.out.println("Password should not contain username");
            return;

        } else if (!password.matches("[a-zA-Z0-9]+")) //&& !password.matches("[0-9]+"))
        {
            System.out.println("Password should have Alpha Numeric value. ");
            return;
        }
        System.out.println("Congratulation, Your account is created.");

        accountCreated = true;


    }

    public void addAccount(double initialBalance)
    {

            account = new Account();
            account.setAccountId(Account.getNEXTID());
            account.deposit(initialBalance);
            account.displayAccountDetails();


    }



    // Method for DEPOSIT
    public void deposit(double amount)
    {
        account.deposit(amount);
    }


    // Method for WITHDRAW
    public void withdraw(double amount)
    {
        account.withdraw(amount);
    }



    public void customerDetails ()
    {
        account.displayAccountDetails();
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
    }



}













