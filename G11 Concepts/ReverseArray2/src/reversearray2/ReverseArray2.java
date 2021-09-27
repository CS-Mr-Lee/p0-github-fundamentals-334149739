/* Header
 * Name: Reverse Array
 * Author: Paul Wang
 * Date: 2021-09-16
 * Description: takes an input of size 14 and reverses then prints the array
 */
package reversearray2;

import java.util.Scanner;

public class ReverseArray2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // variable declaration
        Scanner scanner = new Scanner(System.in);
        final int ARRAY_SIZE = 14;
        String[] array = new String[ARRAY_SIZE];
        
        // input
        System.out.println("Enter 14 values");
        for(int i = 0;i < ARRAY_SIZE;i++){
            array[i] = scanner.next();
        }
        
        //reverse array in place
        for(int i = 0;i < ARRAY_SIZE / 2;i++){
            String temp = array[i];
            array[i] = array[ARRAY_SIZE - 1 - i];
            array[ARRAY_SIZE - 1 - i] = temp;
        }
        
        //prints reversed array
        for(String output : array){
            System.out.println(output);
        }
    }
    
}
