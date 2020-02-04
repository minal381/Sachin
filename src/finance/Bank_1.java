package finance;

public class Bank_1 {
    public static void main(String[] args) {
       Customer_1 c1 = new Customer_1("Meenal","Musale","Me", "Mahi12345");

       if (c1.accountCreated==true)
        {
            c1.addAccount(200);
       c1.withdraw(100);
       c1.deposit(100);
       c1.customerDetails();
       c1.withdraw(50);
       c1.customerDetails();
        }

       else
       {
           System.out.println("Invalid User, please try again....");
       }


   }


}
