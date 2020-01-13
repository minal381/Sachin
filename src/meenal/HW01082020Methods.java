package meenal;

import java.util.Arrays;
import java.util.Scanner;

public class HW01082020Methods {

    //  Create methods to :
    //    1. Reverse a string
    //    Eg: Input to method : Sample
    //    Output/Return from method : elpmaS

    public static String reverseString(String string)
    {
        int strlen = string.length();
        String reversed = "";
        for (int i = 0; i <= string.length() - 1; i++)
        {
            reversed = reversed + string.charAt(strlen - 1 - i);
        }
        return reversed;
    }    //End of reveseString method


         //  2. Reverse an array (fyi: length of input array can vary)
         //      Eg: Input to method : [25, 15, 3, 2, 40] or [20, 10, 44]
//    Output/Return from method : [40, 2, 3, 15, 25] or [44, 10, 20]


        public static int[] reverseArray(int[] array)
        {
          int arrLen = array.length;
          int[] reverseArray = new int[arrLen];
          for (int i = 0; i <= arrLen - 1; i++)
          {
            reverseArray[i] = array[arrLen - 1 - i];
          }
        System.out.println(Arrays.toString(reverseArray));
        return reverseArray;
        } // End of integer reverse array method.


         //   3. Add all numbers in a given array (fyi: length of input array can vary)
         //      Eg: Input to method : [20, 10, 40, 44]
         //       Output/Return from method : 114

        public  static int total(int[] numArr)
        {
            int total = 0;
            for(int i =0 ; i<=numArr.length-1; i++)
        {
            total = total + numArr[i];}
            System.out.println(total);

            return total;
        }// End of total method


         //5. Find Average of a given array
         //Eg: Input to method : [20, 10, 40, 44]
         //Output/Return from method : 28.5
            public static double average(int[] arr)
            {
                double average = 0;
                int length = arr.length;
                for(int i = 0; i<= arr.length-1; i++)
            {
               average = average + arr[i];
            }

               average = (average / arr.length);
               System.out.println( "Average" + "=" + average);
              return average;
            }


            //   6. Find maximum number in given array
            //      Eg: Input to method : [20, 10, 40, 44, 32]
           //        Output/Return from method : 44

       public static double maxNumber(double[] numberArray)
           {
           double maxNumber = numberArray[0];

           for (int i = 1; i <= numberArray.length - 1; i++)
           {
               if (maxNumber < numberArray[i])
               {
                   maxNumber = numberArray[i];
               }
           }
           System.out.println("Maximum no. =" + maxNumber);
           return maxNumber;
           }


           //    7. Find minimum number in given array
           //   Eg: Input to method : [20, 10, 40, 44]
           //            *              Output/Return from method : 10
            public static int minimumNo(int[] array)
          {
            int minimumNo = array[0];
            for (int i = 1; i <= array.length - 1; i++)
          {
            if (minimumNo > array[i])
            {
                minimumNo = array[i];
            }
          }
                System.out.println("Minimum no. = " + minimumNo);
                return minimumNo;
           } //End of minimum no. method



           // 8. Create abbreviation for any string
           // Eg: Input to method : Outfit of the day ( or Good morning or Happy new year)
           //  Output/Return from method : OOTD ( or GM or HMY)

    public static String abbreviation(String string)
    {
        String[] words1 = string.split(" ");

        //System.out.println(Arrays.toString(words1));

       // System.out.println(words1.length);

        String abbreviation = "";

        for(int i = 0; i<=words1.length-1; i++)
    {
        abbreviation= abbreviation +words1[i].charAt(0);

       // System.out.println(words1[i].charAt(0));
    }
        System.out.println(abbreviation);

        return abbreviation;
    }//


    //   10. Given two arrays, one contains total marks of 11 students of a class; second array contains their names in same order as marks-array.
   //  double[] sMarks = {90, 89, 91, 67, 87, 88, 93, 90, 100, 81, 54};
  //    String [] sNames = {“Happy”, “Peace” , “Jesse”, “Kaitlin” , “Amir”, “Donald”, “Steven”, “Vicky”, “Hannah” , “David”, “Gia”};
  //   Create a method which takes both array as parameters, and returns name of student who scored maximum marks in the class.
  //   For above example : method should return “Hannah”
    public static String whoScoredMaxMarks(double [] sMarks, String[] sNames)
    {
       // double[] sMarks = {90, 89, 91, 67, 87, 88, 93, 90, 100, 81, 54};

       // String[] sNames = {"Happy","Peace","Jesse","Kaitlin","Amir","Donald","Steven","Vicky","Hannah","David","Gia"};

        double maxMarks = sMarks[0];

        String sName = sNames[0];

        for(int i=0; i<=sMarks.length-1; i++)
        {
        if (maxMarks < sMarks[i])
        {
            maxMarks = sMarks[i];

            sName = sNames[i];
        }

    }
        System.out.println(sName+" " + "scored maximum marks in class.") ;
        return sName;
    }



    //    11. Create a method to add numbers from 0 to given number, and return the result
    //         Example : addUpto(5) -> method should return 15 (bcz, 0+1+2+3+4+5 = 15)


        public static int addUpTo(int[] number)
        {
          Scanner scan = new Scanner(System.in);

          System.out.println("Please enter the number");

          int userNumber = scan.nextInt();

          System.out.println("User number :" + " "+userNumber);

          int addUpTOaddition =0;

          for(int i=0; i<=userNumber; i++)
         {
             addUpTOaddition= addUpTOaddition +i;
         }
          System.out.println(addUpTOaddition);

          return addUpTOaddition;
         }


         // Temperature Methods
        //  Celsius to Kelvin Method
        // T(K) = T(°C) + 273.15

    public static double celsiusToKelvin (double celsiustemp)
    {
        double celsius = 0;
        double kelvin = celsius + 273.15;
        System.out.println("Temperature in Kelvin" + " "+"="+ " "+ kelvin + (char)0x00B0 +" " + "K");
        return kelvin;
    }

     // 2. Celsius to Fahrenheit
    //      T(°F) = T(°C) × 9/5 + 32
            public static double celsiusTofahrenheit(double celsiustemp)
            {
                double celsius1 = 0;
                double fahrenheit = celsius1 * 9/5 +32;
                System.out.println("Temperature in Fahrenheit" +" " + "="+" "+fahrenheit +(char)0x00B0+ " " + "F");
                return fahrenheit;

            }

    public static void main(String[] args) {

       //        8. Create abbreviation for any string
       //*        Eg: Input to method : Outfit of the day ( or Good morning or Happy new year)
      //*              Output/Return from method : OOTD ( or GM or HMY)
        String string = "Happy New Year";
        String[] words1 = string.split(" ");
        System.out.println(Arrays.toString(words1));
        System.out.println(words1.length);
        String abbreviation = "";
        for(int i = 0; i<=words1.length-1; i++)
        {
            abbreviation= abbreviation +words1[i].charAt(0);
            System.out.println(words1[i].charAt(0));
        }
        System.out.println(abbreviation);

       //        11. Create a method to add numbers from 0 to given number, and return the result
       //                *    Example : addUpto(5) -> method should return 15 (bcz, 0+1+2+3+4+5 = 15)

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the number");
        int userNumber = scan.nextInt();
        System.out.println("User number :" + " "+userNumber);
        int addition =0;
        for(int i=0; i<=userNumber; i++)
        { addition= addition +i;}
            System.out.println(addition);

        int[]a = {1,2,6,4,5};
        reverseArray(a);
        total(a);
        average(a);
        String str = "Happy Birthday";
        abbreviation(str);
        addUpTo(a);

//        4. *Sort an array
//*        Eg: Input to method : [20, 10, 40, 44]
//*              Output/Return from method : [10, 20, 40, 44]
        int[] array ={20, 10, 40, 44};
        int min = array[0];

        int length = array.length;

        System.out.println(array.length);

        int[] sortedArray = new int[length];

        for(int i = 0; i<= array.length-1; i++)

        { if ( min > array[i]) {
            min =array[i];
            System.out.println(min);
        }


        }

//   10. Given two arrays, one contains total marks of 11 students of a class; second array contains their names in same order as marks-array.
//*  double[] sMarks = {90, 89, 91, 67, 87, 88, 93, 90, 100, 81, 54};
//*    String [] sNames = {“Happy”, “Peace” , “Jesse”, “Kaitlin” , “Amir”, “Donald”, “Steven”, “Vicky”, “Hannah” , “David”, “Gia”};
//*    Create a method which takes both array as parameters, and returns name of student who scored maximum marks in the class.
//*    For above example : method should return “Hannah”
//*
        double[] marks = {90, 89, 91, 67, 87, 88, 93, 90, 100, 81, 54};
        String [] names = {"Happy","Peace","Jesse","Kaitlin","Amir","Donald","Steven", "Vicky", "Hannah", "David","Gia"};
        whoScoredMaxMarks(marks,names);


//        double maxMarks = sMarks[0];
//        String sName = sNames[0];

//        for(int i=0; i<=sMarks.length-1; i++) {
//            if (maxMarks <= sMarks[i]) {
//                maxMarks = sMarks[i];
//
//                sName = sNames[i];
//            }
//
//        }
//        System.out.println(sName+" " + "scored maximum marks in class.") ;


   celsiusToKelvin(32);
   celsiusTofahrenheit(32);




    }}



