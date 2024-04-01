package task9;

import java.util.Scanner;

 public class LargestOfThreeNum {
    int a,b,c;
    public static void main(String[] args) {
        LargestOfThreeNum largestOfThreeNum=new LargestOfThreeNum(); //method call
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the value of a");
        largestOfThreeNum.a=scanner.nextInt();
        System.out.println("Enter the value of b");
        largestOfThreeNum.b=scanner.nextInt();
        System.out.println("Enter the value of c");
        largestOfThreeNum.c=scanner.nextInt();
        largestOfThreeNum.getLargestOfThreeNum(largestOfThreeNum.a,largestOfThreeNum.b,largestOfThreeNum.c);
      scanner.close();
    }
    public void getLargestOfThreeNum(int a, int b, int c)
    {
        if(a>=b&& a>=c)
        System.out.println("The larget number: a= "+a);
        else if(b>=b&& b>=c)
        System.out.println("The larget number: b= "+b);
        else 
        System.out.println("The larget number: c= "+c);      

    }

}
