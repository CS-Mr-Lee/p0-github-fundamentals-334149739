/* Header
 * Name: Add Pairs
 * Author: Paul Wang
 * Date: 2021-09-16
 * Description: splits strings into numbers then adds
 */
package addpairs;

import java.util.Scanner;

public class AddPairs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // variable declaration
        Scanner scanner = new Scanner(System.in);
        String input;
        int[] numbers;
        int sum = 0;
        
        //get input;
        input = scanner.next();
        
        //calculate sum and save numbers
        numbers = new int[(int) Math.ceil(input.length() / 2.0)];
        for(int i = 0;i < input.length();i+=2){
            numbers[i / 2] = Integer.parseInt(input.substring(i, Math.min(i + 2, input.length())));
            sum += numbers[i / 2];
        }
        
        //outputs value
        System.out.print(sum);
        System.out.print(" (");
        for(int i = 0;i < numbers.length;i++){
            if(i != 0){
                System.out.print("+");
            }
            System.out.print(numbers[i]);
        }
        System.out.print(")");
    }
    
}
