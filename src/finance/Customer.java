package finance;

import com.sun.tools.javac.util.ArrayUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Customer {
    private String firstName;
    private String lastName;
    private Account account;



    public Customer(String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName =  lastName;
     }

     // Create userId and password
     String[] userIds = {"John", "Jessica","User1", "User2", "Foo"};
    int length = userIds.length;


    public boolean create_User(String userId, String password) {

        if (userId.length() < 3)
        {
            System.out.println("User Id should be minimum 3 characters.");
            return false;
        }
    // UserID is valid ,check if it already exists
        for (String id : userIds)
        {
            if (userId == id)
            {
                System.out.println("Choose another User Id.");
                return false;
            }
        }

        //Check for PASSWORD


        int passwordLength = password.length();

        if(passwordLength<8)
        {
            System.out.println("Password should be minimum 8 characters long");
            return false;
        }
        if(password.contains(userId))
        {
            System.out.println("Password should not contain username");
            return false;

        }
       else if (!password.matches("[a-zA-Z0-9]") ) //&& password.matches("[^0-9]+"))
        {  System.out.println("Password should have Alpha Numeric value. ");
           return false;
        }
        else {
            System.out.println("Congratulation" + " "+ firstName+","+ "your account is created.");
            return true;
        }
       }



    // Method for CREATE an ACCOUNT | ADD an ACCOUNT
        public boolean addAccount ( double initialBalance, String userId, String password)
        {
            if (this.create_User(userId,password)==true) {

                account = new Account();
                account.setAccountId(Account.getNEXTID());
                account.deposit(initialBalance);
                account.displayAccountDetails();
                return true;
            }
            else
            {
                return false;
            }
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

