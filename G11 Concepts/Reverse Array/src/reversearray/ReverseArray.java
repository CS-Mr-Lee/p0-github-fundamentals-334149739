/* Header
 * Name: Reverse Array
 * Author: Paul Wang
 * Date: 2021-09-16
 * Description: takes an input of size 14 and reverses then prints the array
 */
package reversearray;

import java.util.Scanner;

public class ReverseArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // variable declaration
        Scanner scanner = new Scanner(System.in);
        final int ARRAY_SIZE = 14;
        String[] array = new String[ARRAY_SIZE];
        String[] arrayReversed = new String[ARRAY_SIZE];
        
        // input
        System.out.println("Enter 14 values");
        for(int i = 0;i < ARRAY_SIZE;i++){
            array[i] = scanner.next();
        }
        
        // saves reversed array to second array
        for(int i = 0;i < ARRAY_SIZE;i++){
            arrayReversed[ARRAY_SIZE - i - 1] = array[i];
        }
        
        // outputs reversed array
        for(String output : arrayReversed){
            System.out.println(output);
        }
    }
    
}
