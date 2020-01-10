package meenal;

import java.nio.file.ReadOnlyFileSystemException;
import java.util.Arrays;
import java.util.Scanner;

public class Minal {

    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("Hello Sachin");
        System.out.println("I'm a good programmer");
        String myStatement = "I am a goodte programmer";
        // int totalNoOfWords =myStatement.l

        System.out.println(myStatement.replace('r', 'f'));

        String name = "Meenal";
        System.out.println(name);


        String[] names = new String[7];
        names[0] = "Mohammad";
        names[1] = "John";
        names[2] = "Ferdous";
        names[3] = "Abul";
        names[4] = "Mareeha";
        names[5] = "Ruslan";
        names[6] = "Himani";
        boolean isEqual = names[1].equalsIgnoreCase("JOHN");
        System.out.println(isEqual);

        System.out.println(myStatement.substring(0, 12));


        String[] friendNames = new String[]{"Rosy", "Anshu", "Daisy", "Shweta", "Pooja" };

        int length = friendNames.length;
        System.out.println("Array friendNames length is:" + length);
        //System.out.println(friendNames.);

        String myName = "Avani";
        System.out.println(myName);
        int myNamelength = myName.length();
        System.out.println(myNamelength);
        String uppercase = myName.toUpperCase();
        System.out.println(uppercase);
        String daughterName = "Mahi";
        String lowercase = daughterName.toLowerCase();
        System.out.println(lowercase);
        System.out.println(daughterName.indexOf("M"));
        System.out.println(daughterName.charAt(2));
        System.out.println(myName.indexOf("a"));
        System.out.println(myName.substring(2));
        String statement = "I like to code.";
        int statementLength = statement.length();
        System.out.println(statementLength);
        // Classwork
        // 1.
        String myStatement1 = "I am a good programmer";
        // 2.
        int length1 = myStatement1.length();
        System.out.println("Length of statement is" + " " + length1);
        // 3.
        String lowercase1 = myStatement1.toLowerCase();
        System.out.println("Statement in lowercase " + "=" + " " + lowercase1);
        // 4.
        boolean contains = myStatement1.contains("mohammad");
        System.out.println("Does the statement contains word mohammad?" + "  " + contains);
        // 5. something wrong here
        int index5 = myStatement1.charAt(5);
        System.out.println("5th index of the statement is" + " " + index5);
        // 6.
        boolean statementEmpty = myStatement1.isEmpty();
        System.out.println(statementEmpty);
        // 7.
        boolean compare = myStatement1.equals("technosoft");
        System.out.println(compare);
        // 8.
        boolean start = myStatement1.startsWith("Welcome");
        System.out.println(start);
        // 9.
        boolean ends = myStatement1.endsWith("Good Bye");
        System.out.println(ends);

        // 10. concat Meenal and Musale
        String firstName = "Meenal";
        String lastName = "Musale";
        System.out.println(firstName.concat(lastName));

        // 11 . length of a name without length method

        String nameDaughter = "Avani";
        int charCount = nameDaughter.toCharArray().length;
        System.out.println(charCount);


        String sentence = " I have two daughters, Avani is older one";
        String[] words1 = sentence.split(" ");
        System.out.println(words1.length);

        String myState = "I like to code";
        String[] words = myState.split(" ");
        System.out.println(words.length);

        //BASIC CODING
        //  1.
        System.out.println("'Hello'\nMeenal Musale");
        //  2.
        int a = 74;
        int b = 36;
        System.out.println(a + b);
        //  3.
        int c = 50;
        int d = 3;
        System.out.println(c / d);
        //  4. SOME BASIC CODING WITHOUT USING VARIABLE
        System.out.println(-5 + 8 * 6);
        System.out.println((55 + 9) % 9);
        System.out.println(20 + -3 * 5 / 8);
        System.out.println(5 + 15 / 3 * 2 - 8 % 3);

        // 5. Circle, Radius, Perimeter, Area

//        Scanner radius = new Scanner(System.in);
//        System.out.println("Input your radius:");
//        double rad = radius.nextDouble();
//        double perimeter = 2 * Math.PI * rad;
//        System.out.println(perimeter);
//        double area = Math.PI * rad * rad  ;
//        System.out.println(area);
//
//        //  6. Average
//        Scanner numbers = new Scanner(System.in);
//        System.out.println("Enter 3 numbers :");
//        double no1 = numbers.nextDouble();
//        double no2 = numbers.nextDouble();
//        double no3 = numbers.nextDouble();
//        double average = (no1+no2+no3)/3;
//        System.out.println(average);

        // 7. RECTANGLE, LENGTH, HEIGHT, AREA
        double width = 5.6;
        double height = 8.5;
        double rectangleArea = width * height;
        System.out.println(rectangleArea);
        double rPerimeter = 2 * (width + height);
        System.out.println(rPerimeter);

        // ARRAY - String array
        String[] fNames = {"Sachin", "Meenal", "Avani", "Mahi" };
        System.out.println("Length of an Array :" + " " + fNames.length);
        for (int i = 0; i <= fNames.length - 1; i++) {
            System.out.println("Names of friends:" + " " + (fNames[i]));
        }
        for (int i = 0; i <= fNames.length - 1; i++) {
            if (fNames[i].length() <= 5) {
                System.out.println(fNames[i]);
            }
        }

        // String array
        String[] family = {"Mahi", "Avani", "Meenal", "Sachin" };
        System.out.println(family[0] + family[1] + family[2] + family[3]);
        System.out.println((family)[3] + (family[2]));


        // int Array

        int[] no = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("length of  array" + " " + no.length);
        System.out.println("last index" + " " + (no.length - 1));
        System.out.println("number at index 6  is " + no[6]);
        for (int i = 3; i <= 8; i++) {
            System.out.println(no[i]);
        }

        // Enhanced for Loop
        // 1.
        int[] tenNos = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        for (int ten : tenNos) {
            System.out.println("numbers :" + ten);
        }

        //  2.

        String[] subjects = {"Microbiology", "Chemistry", "Zoology", "Botany", "Mathematics" };
        for (String subject : subjects) {
            System.out.println("Name of Subject :" + subject);
        }


//        Scanner scan = new Scanner(System.in);
//        System.out.println("Please enter the password");
//        String actualPassword = scan.nextLine();
//        String expectedPassword = "technosoft";
//
//        for (int i = 0; i <= 10; i++) {
//            if (!actualPassword.equals(expectedPassword)) {
//                int count = 10 - i;
//                System.out.println("Please enter the valid password");
//                System.out.println("You have" + "  " + count + "more tries");
//
//                actualPassword = scan.nextLine();
//
//                if (i == 9) {
//                    System.out.println("Your account will be locked for 15 min");
//
//                }
//            else {
//                    System.out.println("Welcome to home page");
//                    break;
//                }
//
//            }
//
//
//        }


       // Homework:
//	 Simple password validation for login system
        //	instance of scanner
        Scanner scan = new Scanner(System.in);
        //Tell user to enter password
        System.out.println("Please enter your password");
        //takes input from console and storing the value into actualPassword variable
        String actualPassword = scan.nextLine();
        //setting expected password which is associated with user account details in database
        String expectedPassword = "technosoft";
        //Creating for loop to give user max tries to enter valid password and log the user to system if
        //correct password is entered
        for (int i = 0; i < 10; i++) {
            //checking if actual password is not equal to expected password
            if (!actualPassword.equals(expectedPassword)) {
                //subtracting the count by iteration so user will have less tries (-1 every miss tries)
                int count = 10 - i;
                //console message to user to enter valid password
                System.out.println("Please enter the valid password1");
                //console message to let user know how many more tries he has left with
                System.out.println("You have " + count + " more tries");
                //letting user to update the actualPassword value with new input from console

                actualPassword = scan.nextLine();
                //if count equals to 9, then notifying user with custom message
                if (i == 9) {
                    System.out.println("Your account will be locked for 15 min");
                }
            } else {
                // if any point in the loop user enters correct password then system let user into home page
                System.out.println("Welcome to home page");
                break;
            }
        }
    }
}













