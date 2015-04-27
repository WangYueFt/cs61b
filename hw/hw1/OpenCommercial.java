/* OpenCommercial.java */

import java.net.*;
import java.io.*;

/**  A class that provides a main function to read five lines of a commercial
 *   Web page and print them in reverse order, given the name of a company.
 */

class OpenCommercial {

  /** Prompts the user for the name X of a company (a single string), opens
   *  the Web site corresponding to www.X.com, and prints the first five lines
   *  of the Web page in reverse order.
   *  @param arg is not used.
   *  @exception Exception thrown if there are any problems parsing the 
   *             user's input or opening the connection.
   */
  public static void main(String[] args) throws Exception {

    BufferedReader keyboard;
    String inputLine;

    keyboard = new BufferedReader(new InputStreamReader(System.in));

    System.out.print("Please enter the name of a company (without spaces): ");
    System.out.flush();        /* Make sure the line is printed immediately. */
    inputLine = keyboard.readLine();

    /* Replace this comment with your solution.  */
    String urlName = "http://www." + keyboard + ".com";
    URL url = new URL(urlName);
    BufferedReader webpageReader = new BufferedReader(new InputStreamReader(url.openStream()));
    String[] outputBuffer = new String[6];
    int count = 0;
    while((outputBuffer[count] = webpageReader.readLine()) != null && count <5) {
      System.out.println(count);
      count++;
    }
    for(int i = 4; i >= 0; i--){
      System.out.println(outputBuffer[i]);
    }
  }
}
