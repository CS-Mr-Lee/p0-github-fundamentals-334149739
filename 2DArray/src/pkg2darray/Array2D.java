/* Header
 * Name: 2D Array
 * Author: Paul Wang
 * Date: 2021-09-16
 * Description: calculates the average of students
 */

package pkg2darray;

import java.util.Scanner;

public class Array2D {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // declaration
        Scanner scanner = new Scanner(System.in);
        int students, tests;
        int[][] scores;
        int[] averages;
        int bestFit = 0;
        int classAvg = 0;

        //input
        System.out.println("Enter the amount of students: ");
        students = scanner.nextInt();
        System.out.println("Enter the amount of tests: ");
        tests = scanner.nextInt();
        
        //set array sizes
        scores = new int[students][tests];
        averages = new int[students];
        
        //take input
        for(int i = 0;i < students;i++){
            System.out.println("Enter results for student #"+i);
            for(int j = 0;j < tests;j++){
                scores[i][j] = scanner.nextInt();
            }
        }
        
        //calculate average
        for(int i = 0;i < students;i++){
            averages[i] = 0;
            for(int j = 0;j < tests;j++){
                averages[i] += scores[i][j];
            }
            averages[i] /= tests;
            classAvg +=  averages[i];
            
            //output the average
            System.out.println("Average for student #" + i + ":" + averages[i]);
        }
        classAvg /= students;
        
        //get student with heighest grade
        for(int i = 1;i < students;i++){
            if(averages[i] > averages[bestFit]){
                bestFit = i;
            }
        }
        //display best student
        System.out.println("The student with the highest average is #" + bestFit);
        
        //finds all students above class avg
        System.out.println("Students below are above the class average.");
        for(int i = 1;i < students;i++){
            if(averages[i] > classAvg){
                System.out.println("Student #" + i);
            }
        }
    }
}
