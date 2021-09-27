/* Header
 * Name: Input, Math
 * Author: Paul Wang
 * Date: 2021-09-16
 * Description: calculates the amount of time spent 
 */
package input.math;

import java.util.Scanner;

public class InputMath {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // variable declaration
        Scanner scanner = new Scanner(System.in);
        int yearBirth, monthBirth, dayBirth;
        int yearNow, monthNow, dayNow;
        int diffDays = 0, sleepHours;
        
        final int DAY_TO_SLEEP_HOUR = 8;
        final int YEAR_TO_DAY = 365;
        final int MONTH_TO_DAY = 30;
        final int DAY_TO_DAY = 1;
        
        // take input(birth date)
        System.out.println("Enter Your birthdate:");
        
        System.out.print("Year: ");
        yearBirth = scanner.nextInt();
        System.out.print("Month: ");
        monthBirth = scanner.nextInt();
        System.out.print("Day: ");
        dayBirth = scanner.nextInt();
        
        // take input(current date)
        System.out.println("Enter today's date:");
        
        System.out.print("Year: ");
        yearNow = scanner.nextInt();
        System.out.print("Month: ");
        monthNow = scanner.nextInt();
        System.out.print("Day: ");
        dayNow = scanner.nextInt();
        
        //calculate the differenence in days
        diffDays += (yearNow - yearBirth) * YEAR_TO_DAY;
        diffDays += (monthNow - monthBirth) * MONTH_TO_DAY;
        diffDays += (dayNow - dayBirth) * DAY_TO_DAY;
        
        //calculate the amount of hours slept
        sleepHours = diffDays * DAY_TO_SLEEP_HOUR;
        
        //output the days alive and hours slept
        System.out.println("You have been alive for " +diffDays+ " days");
        System.out.println("You have slept " + sleepHours + " hours");
    }
}
