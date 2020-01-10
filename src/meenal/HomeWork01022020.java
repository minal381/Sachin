package meenal;

import java.util.Scanner;

public class HomeWork01022020 {
    public static void main(String[] args) {
        //1.Students score, total possible score
        // 15/20 -> You got a C (75%)
        // A 90-100, B 80-89, C 70-79, D 60-69, F 0-59

        // couldn't use switch, can u please explain how to use?

        Scanner yourScore = new Scanner(System.in);
        System.out.println("Enter your score");
        double scoreInput = yourScore.nextDouble();
        System.out.println(scoreInput);
       // int score = 18;
        double maxScore = 20;
        double percent = (scoreInput * 100)/maxScore;
        System.out.println("percentage" +" " +percent+ "%");

        if(percent>=90 && percent<=100)
        {
            System.out.println("You got 'A'");
        }else if (percent>=80 && percent<90)
        {
            System.out.println("You got'B'");
        }else if (percent>=70 && percent<80)
        {
            System.out.println("You got'C'");
        }else if (percent>=60 && percent<70)
        {
            System.out.println("You got'D'");
        }else if (percent>=0 && percent<60)
        {
            System.out.println("You got'F'");
        }


        //2. Write a logic that prints multiplication table of the user provided number upto ten.
        Scanner num = new Scanner(System.in);
        System.out.println("Enter number");
        int n = num.nextInt();
        System.out.println(n);
            for (int m = 1; m <= 10; m++){

                System.out.println( n + "*" + m + "=" + n * m);
            }


        //3. Write a logic that checks if a number is a Prime number

        }



    }

