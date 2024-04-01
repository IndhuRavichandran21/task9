package task9;

import java.util.Scanner;

public class StarPattern {
    public static void main(String[] args) {
        System.out.println("Enter the number of rows to be printed");
        Scanner scanner=new Scanner(System.in);
        int rows=scanner.nextInt();
         int len=rows/2; 

         //Top rows
        for(int i=1;i<=len;i++)
        {
            for(int k=1;k<i;k++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=2;j++)
            {
               
                System.out.print("*");
                for(int l=rows-2;l>=1;l--)
                {
                    System.out.print(" ");
                }               
            }
            rows=rows-2; //To print the space between the stars
            System.out.println("");
        }
        
        //centre Star
       for(int i=1;i<=len;i++)
       {
        System.out.print(" ");  
       }
        System.out.println("*");

       //Bottom rows
       for(int i=1;i<=len;i++)
     {
       for(int k=i;k<len;k++)//len=3
       {
        System.out.print(" ");
       }
       for(int j=1;j<=2;j++)
       {
       
        System.out.print("*");
        for(int l=rows;l>=1;l--)
        {
            System.out.print(" ");
        }               
     }
     rows=rows+2;
     System.out.println("");
     }  
scanner.close();
    }
}
