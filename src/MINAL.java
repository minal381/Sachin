import java.util.Scanner;

public class MINAL {
    public static void main(String[] args) {
        int number = 31;
        boolean isEven;
        if (number % 2 == 0) {
            isEven = true;
        } else {
            isEven = false;

            System.out.println(isEven);
        }

        int number1 = 15;
        if (number1 % 2 == 0) {
            System.out.println("The number is even");
        } else {
            System.out.println("The number is not even" + " " + "the remainder is" + " " + number1 % 2);
        }


        String[] words = new String[]{"happy", "peace", "quiet", "learn", "understand"};

      for (int j = 0; j <= words.length - 1; j++) {
           System.out.println(words[j]);}


            String[] wordsA = new String[]{"grow", "help", "learn", "happy"};

            for (int a = 0; a <= wordsA.length - 1; a++) {
                if (wordsA[a].length() > 4) {
                    System.out.println(wordsA[a]);
                }
            }
        }
    }




