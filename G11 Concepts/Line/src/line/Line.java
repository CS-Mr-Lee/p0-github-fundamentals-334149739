/* Header
 * Name: Line
 * Author: Paul Wang
 * Date: 2021-09-16
 * Description: method stuff
 */
package line;

import java.util.Scanner;
public class Line {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // variable declaration
        Scanner scanner = new Scanner(System.in);
        int x1, y1, x2, y2;
        
        System.out.print("Enter x1: ");
        x1 = scanner.nextInt();
        System.out.print("Enter y1: ");
        y1 = scanner.nextInt();
        System.out.print("Enter x2: ");
        x2 = scanner.nextInt();
        System.out.print("Enter y2: ");
        y2 = scanner.nextInt();
        
        //uses the functions
        System.out.println("The slope is " + slope(x1, y1, x2, y2));
        System.out.println("The length is " + length(x1, y1, x2, y2));
    }
    
    //calculates the length of a line segment
    public static double length(int x1, int y1, int x2, int y2){
        return Math.hypot(x1 - x2, y1 - y2);
    }
    
    //calculates the slope of a line segment
    public static double slope(int x1, int y1, int x2, int y2){
        return (y2 - y1)/(x2 - x1 + 0.0);
    }
}
