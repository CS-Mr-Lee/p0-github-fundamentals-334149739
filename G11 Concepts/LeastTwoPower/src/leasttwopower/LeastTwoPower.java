/* Header
 * Name: Least Two Power
 * Author: Paul Wang
 * Date: 2021-09-16
 * Description: find the smallest power of 2 bigger than or equal to the input
 */
package leasttwopower;

import java.util.Scanner;

public class LeastTwoPower {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // variable declaration
        Scanner scanner = new Scanner(System.in);
        final int base = 2;
        int input, exponent, result;
        
        // take input
        input = scanner.nextInt();
        
        //get the exponent
        exponent = (int) Math.ceil(Math.log(input)/Math.log(base));
        
        //generate result
        result = (int) Math.pow(base, exponent);
        
        System.out.println("The smallest power of 2 bigger than " + input + " is " + result + " or " + base + "^" + exponent);
    }
    
}
