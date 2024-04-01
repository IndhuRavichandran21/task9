package task9;

import java.util.Scanner;

public class NumberPattern {
    int n;
    public static void main(String[] args) {
        NumberPattern numberPattern=new NumberPattern();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the value for no.of.rows");
        numberPattern.n=scanner.nextInt();
        int count=0;
        System.out.println("Output");
        for(int i=1;i<=numberPattern.n;i++)
        {
            for(int j=1;j<=i;j++)//1 
            {
                count++; //To increment the number to be printed
                System.out.print(count+" ");
            }
            System.out.println("");
        }
        scanner.close();
    }
}
