/* Header
 * Name: Encrypt
 * Author: Paul Wang
 * Date: 2021-09-16
 * Description: scrambles a string
 * footnote: this program will treat the entire line as a string instead of word by word
 */
package encrypt;

import java.util.Scanner;

public class Encrypt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // declaration
        Scanner scanner = new Scanner(System.in);
        String line;
        char[] output;
        
        //take input(the deliminator makes it take an entire line)
        scanner.useDelimiter("\n");
        line = scanner.next();
        output = new char[line.length()];
        
        //shift all characters by 2
        for(int i = 0;i < output.length;i++){
            output[i] = (char) (line.charAt(i) + (line.charAt(i) == ' ' ? 0 : 2));
        }
        
        //swaps first and last character if length > 1
        if(output.length > 1){
            char temp = (char) (output[0] - 2);
            output[0] = (char) (output[output.length - 1] - 2);
            output[output.length - 1] = temp;
        }
        
        //outputs the answer
        System.out.println(new String(output));
    }
}
