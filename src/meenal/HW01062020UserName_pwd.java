package meenal;

import java.util.Scanner;

public class HW01062020 {
    public static void main(String[] args) {
//         * 1. Create a system that checks valid username and password
//                * And if they both are valid then only system displays homepage
//                * User can only try upto 5 times with invalid login details
//                * if it reaches 5 times then system should be locked for 10 min

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your Username");
        String userName = scan.nextLine();
        System.out.println("Please enter your Password");
        String password = scan.nextLine();
        String expectedUserName = "Meenal123";
        String expectedPassword = "Technosoft";

         for(int i =1; i<=5; i++)
           {if(!userName.equals(expectedUserName) || !password.equals(expectedPassword))
           {
               int count = 5-i;
               System.out.println("Please Enter valid Username and Password");
               System.out.println("You have " + count + " more tries");

               userName = scan.nextLine();
               password = scan.nextLine();


               if(i==5)
               {
                   System.out.println("Your account will be locked for 10 minutes.");
               }

           } else {
               System.out.println("Welcome to Homepage");
               break;
           } }


    }
}
