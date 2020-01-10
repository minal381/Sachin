package meenal;

import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        String myStatment = "I am a good programmer";
        System.out.println(myStatment.length());
        System.out.println(myStatment.toLowerCase());
        System.out.println(myStatment.isEmpty());
        System.out.println(myStatment.charAt(5));
        System.out.println(myStatment.contains("mohammad"));
        System.out.println(myStatment.contentEquals("technosoft"));

        String myState = "I like to code";
        String[] words = myState.split(" ");
        System.out.println(words.length);

        String[] days = new String[7];
        days[0] = "Monday";
        days[1] = "Tuesday";
        days[2] = "Wednesday";
        days[3] = "Thursday";
        days[4] = "Friday";
        days[5] = "Saturday";
        days[6] = "Sunday";
        //String [] days ={"Sunday", "Monday", "Tuesday","Wednesday", "Thursday","Friday", "Saturday"}

        int age = 35;
        boolean isChild = age <= 7;
        System.out.println(isChild);
        boolean isSenior = age >= 65;
        System.out.println(isSenior);

        int number = 31;
        boolean isEven;

        if (number % 2 == 0) {
            isEven = true;
        } else {
            isEven = false;
        }
        System.out.println(isEven);

        String signal = "Green1";
        if (signal == "Red") {
            System.out.println("Stop");

        } else if (signal == "Yellow") {
            System.out.println("Go slow");
        } else if (signal == "Green") {
            System.out.println("Go");
        } else {
            System.out.println("Invalid message");


        }
        int temp = 45;
        if (temp <= 32) {
            System.out.println("It is freezing outside");
        } else if (temp >= 100) {
            System.out.println("It is hot outside");
        } else {
            System.out.println("Go for it,It is pretty outside");

        }
        String month = "Jan";
        switch (month) {
            case "Jan":
            case "Feb":
            case "Mar":
                System.out.println("Winter");
                break;
            case "Apr":

            case "May":
            case "Jun":
                System.out.println("Spring");
                break;
            case "Jul":
            case "Aug":
            case "Sept":
                System.out.println("Summer");
                break;
            case "Oct":
            case "Nov":
            case "dec":
                System.out.println("Fall");
                break;
            default:
                System.out.println("Unknown Month");
        }
      // SCANNER... SCANNER INTEGER

//        Scanner integer = new Scanner(System.in);
//        int abc = integer.nextInt();
//        int b=10;
//        System.out.println(abc+b);

        Scanner myName = new Scanner(System.in);
        System.out.println("Your name");
        String myName1 = myName.next();
        System.out.println("Your Last name");
        String myName2 = myName.next();
        System.out.println(myName1 +" "+ myName2);


        //2. Write a logic that prints multiplication table of the user provided number upto ten.
        Scanner num = new Scanner(System.in);
        System.out.println("Enter number");
        int n = num.nextInt();
        Scanner num1 = new Scanner(System.in);
        System.out.println("Enter multiplying no.");
        int k = num1.nextInt();
        System.out.println(n);
        //if user enters 5 i.e n=5 then print table from 1 to 5

        for(int j=1; j<=n; j++)
        {
            System.out.println(j);
            for (int m = 1; m <= k; m++)
            {
                System.out.println( j + "*" + m + "=" + j * m);
            }

            //Logic to find out odd n even numbers
            //        int a;
//
//        for ( a=0; a <=100; a++){
//            if (a%2==0)
//            {
//                System.out.println("Even numbers:"+a);
//
//            }else {
//                System.out.println("Odd numbers:"+a);}

        }

    }
}