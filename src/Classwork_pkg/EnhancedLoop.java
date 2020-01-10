package Classwork_pkg;

import java.util.Scanner;

public class EnhancedLoop {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        for(int number : numbers)
        {
            System.out.println("Element :  " + number);
        }

        String [] names = {"James", "Larry", "Tom", "Macy" };
        for(String name : names)
        {
            //System.out.println(name);
            System.out.println("Students: "+ name);
            // boolean isjames = name.equals("james");

            boolean isJames = name.equalsIgnoreCase("james");
            if (isJames == true){
                System.out.println("James is here.");
                break;

            }}

            Scanner scan = new Scanner(System.in);
            System.out.println("Please enter the password");
            String actualPassword = scan.nextLine();
            String expectedPassword = "technosoft";

            for (int i = 0; i <= 10; i++) {
                if (! actualPassword.equals(expectedPassword)) {
                    int count = 10 - i;
                    System.out.println("Please enter the valid password");
                    System.out.println("You have" + "  " + count + "more tries");
                    actualPassword = scan.nextLine();
                    if (i == 9) {
                        System.out.println("Your account will be locked for 15 min");
                    }
                }
                else
                {
                    System.out.println("Welcome to home page");
                    break;
                }

            }


        }
    }









