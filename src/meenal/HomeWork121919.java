package meenal;

public class HomeWork121919 {
    public static void main(String[] args) {

        //3. Verify if "JOHN" is present at index 1

        String []names = new String[7];
        names[0]= "Mohammad";
        names[1]= "John";
        names[2]= "Ferdous";
        names[3]= "Abul";
        names[4]= "Mareeha";
        names[5]= "Ruslan";
        names[6]=  "Himani";
        boolean isEqual= names[1].equalsIgnoreCase("JOHN");
        System.out.println(isEqual);
        String[] namesNew = {"Mohhamad", "John", "Ferdous", "Abul","Mareeha","Ruslan", "Himani"};
        for (String nameNew1 : namesNew) {
            boolean isJohn = nameNew1.equalsIgnoreCase("himani");
           if(isJohn== true ) { System.out.println(nameNew1);}


        }

      // 2. stotre your name in astring variable. Calculate length of your name without using string method.
        String myName = "Meenal";
        int length;
        length = myName.indexOf("l");
        System.out.println(length);
        length= length+1;
        System.out.println(length);

        // 4.  Store first names of 5 of your friends in an array,and display in console.
        // 4.1 Length of Array
        String[] friendNames = new String[]{"Rosy","Anshu","Daisy","Shweta","Pooja"};
        int lengthOfArray = friendNames.length;
        System.out.println("Array friendNames length is:"+ lengthOfArray);
        // 4.2 Print name written on 3rd position
        String name3 = friendNames[2];
        System.out.println("Name written on 3rd position is"+" "+ name3);
                //or
        String [] fNames = {"Sachin", "Meenal","Avani","Mahi"};
        for (int i =0; i<=fNames.length-1; i++)
        {
            if(fNames[i].length()< 4)
            {
                System.out.println(fNames[i]);
            }

        }






        // 1. I am a good programmer.

        String myStatement = "I am a good programmer";
        // int totalNoOfWords =myStatement.l

        System.out.println(myStatement.replace('r', 'f'));









    }
}
