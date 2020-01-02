
import java.util.Arrays;
import java.util.Scanner;

public class HomeWork123019 {

    public static void main(String[] args) {
        // 3. Store a number in an int variable.
        //if the number is divisible by 15
        //	Display "Divisible by 15"
        //Otherwise
        //	Display the remainder you get when divide number by 15

        int number = 30;

        if (number % 15 == 0) {
            System.out.println("The number is divisible by 15");
        } else if (number % 15 != 0) {
            System.out.println("The remainder is" + " " + number % 15);
        }

        int number1 = 95;

        if (number1 % 15 == 0) {
            System.out.println("The number is divisible by 15");
        } else {
            System.out.println("The remainder is" + " " + number1 % 15);
        }

        // 1. Menu
        //  boolean isGuestOneVegan = true;
        //  boolean isGuesttwoVegan = true;
        //  Are both vegan? only offer up vegan dishes.
        //  At least one vegan? make sure offer up some vegan options.
        //  Else, offer anything on the menu


        boolean isGuestOneVegan = true;
        boolean isGuesttwoVegan = false;
        if (isGuestOneVegan == true && isGuesttwoVegan == true) {
            System.out.println("Please serve Vegan Menu");
        } else if (isGuestOneVegan == true || isGuesttwoVegan == true) {
            System.out.println("One guest is vegan, offer up vegan menu with Regular menu.");
        } else {
            System.out.println("Regular Menu");
        }

        // 4. Store your name in a variable.
        //if your name length comes out greater than 8
        //Display your name after replacing all 'a' to 'A' from your name.
        //      Otherwise
        // Display your name in uppercase.
        String myName = "Meenal";
        if (myName.length() > 8) {
            System.out.println(myName.replace('a', 'A'));
        } else {
            System.out.println(myName.toUpperCase());
        }
        
        // 5. Create an array of 5 int values. Calculate the average of those 5 values. [pls don't use for-loop]
        //If you average of stored numbers greater than 25
        //	Display Array from index 0 to last
        //Otherwise
        //	Display Array from index last to 0
        int[] numbers = new int[]{10, 20, 30, 40, 50};
        double average = (numbers[0] + numbers[1] + numbers[2] + numbers[3] + numbers[4]) / numbers.length;
        String numberString = Arrays.toString(numbers);

        // System.out.println("hello "+ numberString);
        //System.out.println(average);
        if (average > 25) {
            System.out.println(numberString);
        }

//        2. Driver Controller
// * I want to be able to put car on P mode, D mode, N mode, R mode
//                * If i am on P mode and parking type is parallel then i can park between two cars
//                * If i am on D mode I can put drive type to Snow type, Sport Type or Regular type
// * If i am on N mode i can put car in car wash station
// * If i am on R mode I can only reverse the car and car will activate back camera
// * If mode is incorrect then print me invalid mode type, please check your car mode
        String mode = "P";
        String parkingType = "Parallel parking";
        if (mode == "P")
        {
            System.out.println("You can park");
            if (parkingType == "Parallel parking")
            {
                System.out.println("You can parallel park in between two cars");
            }
            else
                {
                    System.out.println("you can't parallel park");
                }
        }
        else if (mode == "D")
        {
                    System.out.println("You can put drive type to Snow type, Sport Type or Regular type");
        } else if (mode == "N")
        {
            System.out.println("You can put car in car wash station");
        }

         else  if (mode == "R"){
            System.out.println("You can only reverse the car and car will activate back camera");
        }
         else {System.out.println("Please check your car mode");}


         // 6. Create a supermarket item finder
        //	Take input from user and based on the input, you should display user which aisle has the item
        //    For example: user enter milk, you program should say aisle 8. If the item is not found,
        //    display a message saying "Out of stock "Please create program for below requirement
        //        Milk = Aisle Eight
        //        Eggs = Aisle Eight
        //        French Fries = Aisle seven
        //        Candy = Aisle Three
        //        Frozen Pizza = Aisle seven
        //        Donuts = Aisle Eight
        //        Diapers = Aisle One
        //        Apple = Aisle two
        //        Orange = Aisle two

        Scanner name1 = new Scanner(System.in);
        System.out.println("Enter Product Name");
        String productname = name1.next();
        System.out.println(productname);
        if(productname.equals("Milk") || productname.equals("Eggs") || productname.equals("Donuts"))
        {
            System.out.println("Aisle Eight");
        }
        else if (productname.equals("French Fries")|| productname.equals("Frozen Pizza"))
        {
            System.out.println("Aisle Seven");
        }
        else if (productname.equals("Candy"))
        {
            System.out.println("Aisle Three");

        }
        else if (productname.equals("Diapers"))
        {
            System.out.println("Aisle One");
        }
        else if (productname.equals("Apple")|| productname.equals("Orange"))
        {
            System.out.println("Aisle Two");
        }
        }
    }



