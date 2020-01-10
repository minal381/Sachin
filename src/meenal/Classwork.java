package meenal;

import java.util.Arrays;
import java.util.Scanner;

public class Classwork {public static void main(String[] args) {
    // 1 . ARITHEMATIC OPERATOR
    //  Post increment simple method to add 1 /subtract 1
    int myAge = 35;
    myAge = myAge + 1;
    System.out.println(myAge);

    //OR
    int AGE = 35;
    AGE++;
    System.out.println(AGE);
    AGE--;
    System.out.println(AGE);


    int age = 35;
    boolean isChild = age <= 7;
    System.out.println(isChild);
    boolean isSenior = age >= 65;
    System.out.println(isSenior);

    int x = 20;
    int y = 2;
    int add = x + y;
    System.out.println(add);

    int substract = x - y;
    System.out.println(substract);

    int multiplication = x * y;
    System.out.println(multiplication);

    int division = x / y;
    System.out.println(division);

    int remainder = x % y; // % modulus
    System.out.println(remainder);

    int x1 = 46;
    int y1 = 5;
    int remainder1 = x1 % y1;
    System.out.println(remainder1);


    // 2.  ASSIGNMENT APERATOR

    int x2 = 20;
    int y2 = 5;
    // x2= x2 + y2;
    //  System.out.println(x2);
    //  OR

    x2 += y2;
    System.out.println(x2);

    int sub = x2 -= y2;
    System.out.println(x2);

    // 3.  COMPARISON OPERATORS (RESULTS ARE IN BOOLEAN)
    boolean isGreater = x > y;
    System.out.println(isGreater);
    boolean isLess = x < y;
    System.out.println(isLess);
    boolean isEqual = x == y;
    System.out.println(isEqual);

    //01-02-2020
//     // count down from 100 to 0
//    int count = 100 ;
//    while (count >= 0) {
//        System.out.println("count" + count);
//        count-- ;
//
//    }
//
//    // count up to 100
//    int count1 = 0;
//    while(count <= 100)
//    {
//        System.out.println("Count"+ count1);
//        count1 ++;
    //  }
    // count upto 100 from 0 and print only the even numbers
    // int count = 0;
//    while (count <= 100){
//        if(count%2 == 0){
//        System.out.println("Even numbers:"+ " " + count );}
//        count++;

//    do {
//        System.out.println("Count"+ count);
//        count++;
//    }while (count < 5);

    // for (int i = 100; i> 0; i= i-5) {
    // System.out.println(i);}

//     String name = "Mohammad";
//     String reverseString = "";
//
//     char [] strArr =name.toCharArray(); //[M..d}
//     for (int i = strArr.length - 1 ; i>= 0; i--) {
//         reverseString = reverseString + strArr[i];}{
//        System.out.println(reverseString);}
//
//    boolean word = "racecar";
//    String reverseString = "";

//    char[] strArr = word.toCharArray();
//    for (int i = strArr.length - 1; i >= 0; i--) {
//        reverseString = reverseString + strArr[i];
//    }
//    {
//        System.out.println(reverseString);
//    }
//
//    {
//        System.out.println(word.equals(reverseString));
//    }

    String lady = "madam";
    String reversedString = "";
    char[] ladyArr = lady.toCharArray();
    for (int i = ladyArr.length - 1; i >= 0; i--) {
        reversedString = reversedString + ladyArr[i];
    }
    {
        System.out.println(reversedString);
    }
    {
        System.out.println(lady.equals(reversedString));
    }

    String level = "level";
    String reverseLevel = "";

    char[] levelArr = level.toCharArray();
    for (int i = levelArr.length - 1; i >= 0; i--) {
        reverseLevel = reverseLevel + levelArr[i];
    }
    {
        System.out.println(reverseLevel);
    }
    {
        System.out.println(level.equals(reverseLevel));
    }
//
//          // Scanner
//    Scanner scan = new Scanner(System.in);
//    System.out.println("Enter true or false");
//     boolean input = scan.nextBoolean();
//    System.out.println(input);
//
    String[] words = new String[]{"happy", "peace", "quiet", "learn","understand"};

    for (int i = 0; i<=words.length-1; i++) {
      System.out.println(words[i]);
    }


    //length of each word
    String [] wordsA =  {"grow", "help","learn","happy","peace"};

    for (int i = 0; i<= wordsA.length-1; i++ )
        if (wordsA[i].length() > 4) {
            System.out.println(wordsA[i]);
        }
        String wordS [] = {"sachin", "minal","Avani","mahi"};
        for(int i=0; i<=wordS.length; i++){
    System.out.println(wordS[i]);}



}
}
