
/**
 * Write a program that asks the user input a change between 1 and 99 cents. The program
then will display it in amount of quarters, dime, nickels and pennies.
 *
 * @author (Efe Osaghae)
 * @version (09/04/2019)
 */

import java.util.Scanner;

public class EfeosaghaeProject02
{
    public static void main(String[] arg) {
        System.out.println("Enter a number between 1 and 99");
        Scanner sc = new Scanner(System.in);
        int cents = sc.nextInt();
        
        int quarter = 25;
        int dime = 10;
        int nickel = 5;
        int penny = 1;
        
        int totalQuarter = (cents / quarter);
        cents %= quarter;
        int totalDime = (cents / dime);
        cents %= dime;
        int totalNickel = (cents / nickel);
        cents %= nickel;
        int totalPenny = (cents / penny);
        cents %= penny;
        
        System.out.println(totalQuarter);
        System.out.println(totalDime);
        System.out.println(totalNickel);
        System.out.println(totalPenny);
        
    }
}
