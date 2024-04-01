package task9;

import java.util.Scanner;

public class PrintGrade {
    //variable declartion
    char grade;
    int mark;
    public static void main(String[] args) {

        System.out.println("Enter the mark of the student out of 100");
        PrintGrade printGrade_obj=new PrintGrade();
        Scanner scanner_obj=new Scanner(System.in);
        printGrade_obj.mark=scanner_obj.nextInt(); // To get user input
        printGrade_obj.printGrade(printGrade_obj.mark);//method call to print the grade

        scanner_obj.close();
       }

    public void printGrade(int mark)
    {
        if(mark==100)
        {
            System.out.println("S");
        }
        else if(mark>=90 && mark<=99)
        {
            System.out.println("A");
        }
        else if(mark>=80 && mark<=89)
        {
            System.out.println("B");
        }
        else if(mark>=70 && mark<=79)
        {
            System.out.println("C");
        }
        else if(mark>=60 && mark<=69)
        {
            System.out.println("D");
        }
        else if(mark>=50 && mark<=59)
        {
            System.out.println("E");
        }
        else if(mark<50 && mark>=0)
        {
            System.out.println("F");
        }
        else if(mark> 100)
        System.out.println("Invalid Input");
        else 
        System.out.println("Please enter the positve number");
    }

    
}
