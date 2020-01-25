package Classwork_pkg;

import java.math.MathContext;
import java.util.Arrays;
import java.util.Scanner;

public class Test {
    //        2.
//        Write a Java program to remove a specific element from an array.
//        Original array: [32, 14, 24, 98, 24, 56, 148, 24, 78, 24]
//        New Array: [32, 14, 98, 56, 148, 78]


   public static int[]newArrayAfterRemoval(int[] array, int userNumber) {

       //int[] array ={32,14,24,98,24,56,24,78,24};
       int lengthOfArray = array.length;
       // System.out.println(lengthOfArray);
       // System.out.println(Arrays.toString(array));
       int[] newArray = new int[lengthOfArray];

       Scanner number = new Scanner(System.in);
      // System.out.println("Please enter the number  :");
      // int userNumber1 = number.nextInt();
       System.out.println(userNumber);

       for (int i = 0; i <= lengthOfArray - 1; i++) {
           if (array[i] != userNumber) {
               newArray[i] = array[i];
           }
       }
       System.out.println(Arrays.toString(newArray));
       return newArray;}

    //        1.
//        Create a method to return missing smallest positive integer (greater than 0) from given array.
//                Example:
//        For array : [1,3,5,4,2,7]
//        Method should return : 6
//        For array : [-1, -3, 4, 2]
//        Method should return : 1
//        For array : [0, 5, -1, 1, 2, 4, 5, 3, 7, 1, 2]
//        Method should return : 6

    public static int missingNumber(int[] array1){

    //int[] array1 = {-1, -3, 4, 2};
    int length = array1.length;
        System.out.println("Length of an array  :"+ length);
    //System.out.println(array1[0]);
    int missingNumber = 1;
        if (missingNumber >0)
            for(int i =1; i<=length-1; i++)
    {if (array1[i]-1 < array1[i])
    { missingNumber = array1[i]-1;
    }
    }
    // System.out.println(array1[2]-1);
        System.out.println("Missing number from array is :" +" "+ missingNumber);
        return missingNumber;
   }

 //3.
//        Scenario: Traffic ticketing system
//        1. Speed Limit = 70
//        2. Every 5 miles over the speed limit will add 1 point
//        3. Use Math.floor(1.4)to round the speed to downward value
//        4. If user reaches 12 points then license is suspended
//        Example:
//        userspeed=78(70-75->1point)
//        userspeed=88(70-75->1point,75-80->1point,80-85->1point ; total 3 points)

   public static double trafficTicketingSystem(double currentSpeed) {


      // double currentSpeed = 88;

       currentSpeed=Math.floor(currentSpeed);

       //System.out.println(Math.floor(currentSpeed));
       int speedLimit = 70;
       double points = 0;


       if (currentSpeed > 70)
       {
            points =  Math.floor((currentSpeed - speedLimit) / 5);
           System.out.println(points);

           if (points > 12)
           {
               System.out.println("You got "+ points + " on your license.");
               System.out.println("You are driving at " + currentSpeed+" "+"mph.Your license is suspended.");

            }
           else

               System.out.println("Points  " +points);
       } else{
           System.out.println("Great, You are driving in speed Limit");}


       return points;
   }








        public static void main(String[] args) {
       int[] array2 ={12,10,20,30};
        newArrayAfterRemoval(array2,10);

        int[] array ={1,3,5,4,6};
        missingNumber(array);

        trafficTicketingSystem(104);
        trafficTicketingSystem(178);

    }}