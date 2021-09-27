/* Header
 * Name: Pythagorean
 * Author: Paul Wang
 * Date: 2021-09-16
 * Description: generates pythagorean triplets up to a certain value
 */
package pythagorean;

import java.util.Scanner;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.ArrayList;

public class Pythagorean {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // variable declaration
        Scanner scanner = new Scanner(System.in);
        //set is so there are no overlaps
        Set<Triple> triples = new LinkedHashSet<Triple>();
        ArrayList<Integer> fibonacci = new ArrayList<>();
        int upperBound, n = 3, a = 4, b = 3, c = 5;
        
        //get the upper bound
        upperBound = scanner.nextInt();
        
        //generate fibonacci numbers
        fibonacci.add(0);
        fibonacci.add(1);
        while(fibonacci.get(fibonacci.size() - 2) <= upperBound){
            fibonacci.add(fibonacci.get(fibonacci.size() - 1) + fibonacci.get(fibonacci.size() - 2));
        }
        
        //generate triple using method found on https://en.wikipedia.org/wiki/Formulas_for_generating_Pythagorean_triples#Method_I
        //may miss a few
        if(upperBound >= 5){
            do{
                //save the triple
                triples.add(new Triple(a, b, c));
                
                //calculate the next set of triples
                n++;
                a = a + b + c;
                b = fibonacci.get(2 * n - 2) - b;
                c = fibonacci.get(2 * n - 1);

            }while(c <= upperBound);
        }
        
        /*brute force solution
        for(int i = 1;i < upperBound;i++){
            for(int j = 1;j < i;j++){
                int k = (int) Math.sqrt(i*i-j*j);
                try{
                    triples.add(new Triple(k, j, i));
                }catch(Exception e){}
            }
        }*/
        
        //outputs all the triples
        for(Triple triple : triples){
            triple.print();
        }
    }
}

class Triple {
    public int a, b, c;
    
    public Triple(int leg1, int leg2, int hypotenuse){
        //saves numbers
        a = leg1;
        b = leg2;
        c = hypotenuse;
        
        //swaps a and b if a is bigger than b(for formatting reasons)
        if(a > b){
            int temp = a;
            a = b;
            b = temp;
        }
        
        //checks if the triple is valid
        if(Math.hypot(a, b) != c){
            throw new IllegalArgumentException("Invalid triple of " + a + " " + b + " " + c);
        }
    }
    
    //outputs the triple
    public void print(){
        System.out.println(a + "^2 + " + b + "^2 = " + c + "^2");
        //System.out.println(a + " " + b + " " + c);
    }
}