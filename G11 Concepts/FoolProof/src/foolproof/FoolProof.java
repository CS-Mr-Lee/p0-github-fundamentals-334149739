/* Header
 * Name: divides alot
 * Author: Paul Wang
 * Date: 2021-09-16
 * Description: write file stuff
 */
package foolproof;

import java.util.Scanner;

public class FoolProof {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // variable declaration
        Scanner scanner = new Scanner(System.in);
        String input;
        int numerator, divisor;

        //loop until exit
        while (true) {
            //get numerator
            System.out.print("Enter the numerator: ");
            input = scanner.next();

            //exit case
            if (input.toLowerCase().charAt(0) == 'q') {
                break;
            }
            try {
                //get divisor
                System.out.print("Enter the divisor: ");
                numerator = Integer.parseInt(input);
                divisor = scanner.nextInt();
                
                //output
                if(divisor == 0){
                    System.out.println("You cant divide " + numerator + " by " + divisor);
                }else{
                    System.out.println(numerator + " / " + divisor + " is " + (numerator / (divisor + 0.0)));
                }
            } catch (Exception e) {
                System.out.println("You entered bad data.\n"
                        + "Please try again.");
            }
        }
    }

}
