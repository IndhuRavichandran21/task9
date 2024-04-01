package task9;

import java.util.Scanner;

public class StringReverse {
  public static void main(String[] args) {
    
    
    String s;
    StringBuffer sb=new StringBuffer(); //using string buffer to reverse the string
    System.out.println("Enter any string");
    Scanner scanner=new Scanner(System.in);
    s=scanner.nextLine();
    for(int i=s.length()-1;i>=0;i--)
    {
     sb.append(s.charAt(i));

    }
    System.out.println("The reversed string is "+sb);
  scanner.close();
  }

  /*
    
    public static void main(String[] args) {
      String s;
      String s_rev="";
      System.out.println("Enter any string");
      Scanner scanner=new Scanner(System.in);
      s=scanner.nextLine();
      for(int i=s.length()-1;i>=0;i--)
      {
        s_rev=s_rev+s.charAt(i);

      }
      System.out.println("The reversed string is "+s_rev);
    
    } 
    */

    
}
