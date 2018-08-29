/*  File name     :  SayHello.java
 *  Purpose       :  Provides a class with supporting methods for CountTheDays.java program
 *  Authors       :  Roberto Ventura , B.J. Johnson (for Template)
 *  Date          :  2018-01-25 
 *  Description   :  Practice using scanner utility
 *  Warnings      :  None
 *  Exceptions    :  None
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *  Revision History
 *  ----------------
 *            Rev      Date     Modified by:  Reason for change/modification
 *           -----  ----------  ------------  -----------------------------------------------------------
 *   @version 1.0.0  2018-8-29  Bob           Practice using Java and scanner utility
 */
   import java.util.Scanner;
   
   public class SayHello {
	   
       public static void main(String[] args) {
		   
	       String h = "Hello";
	       System.out.println(h + " World!");
   	       System.out.print("What is your name?: ");
	       Scanner myInput = new Scanner( System.in );
	       String inputName = myInput.nextLine();
	       System.out.println(h + ", " + inputName);
		   
       }
   }
