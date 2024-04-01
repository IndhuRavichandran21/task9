package task9;

import java.util.Scanner;

public class PalindromeCheck {
    
    public static void main(String[] args) {
       String s1;
       String rev_s1="";
       Scanner scanner=new Scanner(System.in);
       System.out.println("Enter any word to check whether palindrome or not");
       s1=scanner.nextLine().toLowerCase(); //converting the input into lowercase
       int wordLength= s1.length();
       for(int i=wordLength-1;i>=0;i--)
       {
        rev_s1=rev_s1+s1.charAt(i);
       }
       System.out.println("The given word s1= "+s1+" (in Lowercase)");
       System.out.println("The reversed word rev_s1= "+rev_s1);
       if(s1.equals(rev_s1)) //comparing the user input and the reversed word
       {
       
        System.out.println("The given word is palindrome");
       }
       else 
       System.out.println("The given word is not a palindrome");
  scanner.close();
    }
}
