/* Header
 * Name: Two Power Table
 * Author: Paul Wang
 * Date: 2021-09-16
 * Description: write file stuff
 */
package twopowertable;

import java.io.*;
import java.util.Scanner;

public class TwoPowerTable {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        // varuiable declaration
        Scanner scanner = new Scanner(System.in);
        int size;
        long power = 1;
        final int BASE = 2;
        final String address = "twoPowerTable.html";
        final boolean append = false;
        String htmlCode = "<html><head>\n"
                + "<title>Powers of Two</title>\n"
                + "</head>\n"
                + "<body>\n"
                + "<table border cellpadding=5>\n"
                + "<tr><th>Power of 2</th><th>Value</th></tr>\n";

        //get table size
        size = scanner.nextInt();

        //create table
        for(int i = 0;i <= size;i++){
            htmlCode += "<tr><td>" + i + "</td><td>" + power + "</td></tr>\n";
            power *= BASE;
        }
        
        //end the table
        htmlCode += "</table>\n"
                + "</body></html>";

        //writes to file
        try {
            // declares file writer and buffered writer
            Writer fileWriter = new FileWriter(address, append);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            // writes to file
            bufferedWriter.write(htmlCode);

            // close writer
            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println(e);
        }

    }
}
