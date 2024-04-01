package task9;

import java.util.Scanner;

public class TariffCalculation {
    //Variable declaration
    int month_In_Number;
    float rent;
    int no_of_days;
    float totalFare;
    public static void main(String[] args) {
        TariffCalculation tariffCalculation=new TariffCalculation(); 
        System.out.println("Enter the number which represents the month");
        Scanner scanner_obj=new Scanner(System.in); //To get user input
        tariffCalculation.month_In_Number=scanner_obj.nextInt();

        System.out.println("Enter the rent of the room");
        //Scanner scanner_obj1=new Scanner(System.in);
        tariffCalculation.rent=scanner_obj.nextFloat();

        System.out.println("Enter the number of days for stay");
      // Scanner scanner_obj2=new Scanner(System.in);
        tariffCalculation.no_of_days=scanner_obj.nextInt();

        switch(tariffCalculation.month_In_Number) //To calculate hotel tariff
        {
            case 1,2,3,7,8,9,10:
            tariffCalculation.totalFare=tariffCalculation.rent*tariffCalculation.no_of_days;
            System.out.printf("%.2f",tariffCalculation.totalFare); //limiting the floating point to 2 digit
            break;
            case 4,5,6,11,12:
            tariffCalculation.rent=tariffCalculation.rent+((20*tariffCalculation.rent)/100);
            tariffCalculation.totalFare=tariffCalculation.rent*tariffCalculation.no_of_days;
            System.out.printf("%.2f",tariffCalculation.totalFare);
            break;
           
            default:
            System.out.println("Enter valid Input within the range 1 to 12 for months ");

            scanner_obj.close();
            
        }
    }
   
   
}
