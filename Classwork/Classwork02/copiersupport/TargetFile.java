/*  File name     :  TargetFile.java
 *  Purpose       :  Work with import and package statements
 *  Author        :  Roberto Ventura
 *  Date          :  2018-09-05 
 *  Description   :  Will create a file with the same name with .copy attached and write the same contents then close it
 *  Warnings      :  None
 *  Exceptions    :  None
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *  Revision History
 *  ----------------
 *            Rev      Date     Modified by:  Reason for change/modification
 *           -----  ----------  ------------  -----------------------------------------------------------
 *  @version 1.0.0  2018-09-05  Bob           Practice using import and package
 */
/* Warning! text editor smart indent, may cause indentation issues when opened up on another editor */
/* Will change my text editor for next assignment */

 package copiersupport;
 import java.io.FileWriter;
 import java.io.IOException;
     
     public class TargetFile {
        
         private FileWriter out = null;
         private String fileName = "";
        
         public TargetFile( String s, String content) {
             fileName = s + ".copy";
             try {
                 out = new FileWriter(fileName);
                 out.write(content);
                 out.close();
             }
             catch(IOException ioe) {
                 System.out.println("\n     Uh-oh, something went hinky!");
             }
         }

         public static void main(String[] args) {
        
         }
     }
