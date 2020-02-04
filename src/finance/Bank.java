package finance;

public class Bank {
    public static void main(String[] args) {


        Customer c2 = new Customer("Meenal", "Musale");

        if ( c2.addAccount(500,"Meenal","NewYork123")==true )
        {
            c2.withdraw(600);
            c2.deposit(300);
            c2.withdraw(600);
            c2.customerDetails();
        }

       else
      {
         System.out.println("Invalid user ");
      }

        Customer c1 = new Customer("Ani","B.") ;
       if(c1.addAccount(300,"BAni", "Newyork234")== true )
       {

       }
}}