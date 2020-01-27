package meenal;

import java.util.Scanner;

public class PrinterUser
{
    public static void main(String[] args)
    {
       Printer printer_1 = new Printer(100);
        System.out.println("Printed Pages  :"+printer_1.getTotalPagesPrinted());
        System.out.println("Toner level :"+printer_1.getTonerLevel());

        printer_1.print("Single",20);
         System.out.println("Printed Pages  :"+printer_1.getTotalPagesPrinted());
         System.out.println("Toner level :"+printer_1.getTonerLevel());

        printer_1.print("Single",40);
         System.out.println("Printed Pages  :"+printer_1.getTotalPagesPrinted());
         System.out.println("Toner level :"+ printer_1.getTonerLevel());

        printer_1.print("Single", 20);
         System.out.println("Printed Pages  :"+printer_1.getTotalPagesPrinted());
         System.out.println("Toner level :" +printer_1.getTonerLevel());

        printer_1.print("Single",20);
         System.out.println("Printed Pages  :"+printer_1.getTotalPagesPrinted());
         System.out.println("Toner level :" +printer_1.getTonerLevel());

         printer_1.print("Double", 10);
//         System.out.println("Printed Pages  :"+printer_1.getTotalPagesPrinted());
//         System.out.println("Toner level :" +printer_1.getTonerLevel());



    }
}