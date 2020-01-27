package meenal;

public class Printer {


    /**
     * Build a printer
     * User can set toner level range between 0 to 100 (toner level cannot be greater than 100)
     * User should be able to see number of page printed
     * User should be able to print both sided (Note: in that case printed page should calculated correctly)
     * User can view current toner level at anytime
     * single page == single toner level; (Example: Toner = 100, printed page = 20, updated toner = 80)
     * If toner reaches < 1, then print "Low Toner, Please add more toner"
     * Max pages can be printed == 100;
     */

    private int tonerLevel;
    private String pageFormat; //single ,both
    private int totalPagesPrinted;

//Print Method (low Toner check + page set up , no.of pages)+ update toner level and print pages printed
//Method to get toner level

    // User can get no. of printed pages anytime

   public int getTotalPagesPrinted()
   {
    return totalPagesPrinted;
   }

    // User can get toner anytime
    public int getTonerLevel()
    {
        return tonerLevel;
    }

    // Constructor set
    public Printer(int input_tonerLevel)
    {
        if (input_tonerLevel >= 0 && input_tonerLevel <= 100)
        {
            this.tonerLevel = input_tonerLevel;
            System.out.println("Toner level set to  : " + input_tonerLevel);
        }
        else {
            System.out.println("Please set toner level between 0 to 100.");
             }

    }


    public void print(String pageFormat, int pages)
    {
        if (tonerLevel < 1 )
        {
            System.out.println("Low Toner, Please add more toner.");
           // return;
        }else if (pages>tonerLevel){
            System.out.println("Only "+ tonerLevel+" "+ "pages can be printed out of "+ pages+" "+ "pages, Please add more toner.");
        }
       else if (pageFormat == "Single")
        {
            this.totalPagesPrinted = totalPagesPrinted + pages;
            this.tonerLevel = tonerLevel - pages;
        }
        else if(pageFormat== "Double")
        {
            this.totalPagesPrinted = totalPagesPrinted + (pages/2);
            this.tonerLevel = tonerLevel - pages;
        }
        else
            {
            System.out.println("Invalid Print command");
            }
        if(totalPagesPrinted==100)
        {
            System.out.println("Total pages printed 100, Please add papers");
        }
    }

    }





