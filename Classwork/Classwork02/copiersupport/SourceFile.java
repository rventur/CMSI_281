/*  File name     :  SourceFile.java
 *  Purpose       :  Work with import and package statements
 *  Author        :  Roberto Ventura
 *  Date          :  2018-09-05 
 *  Description   :  Will read a file inputted and copy the contents of the file
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
 import java.io.FileReader;
 import java.io.BufferedReader;
 import java.io.IOException;
 
     public class SourceFile {
        
         private FileReader in = null;
         private String fileName = "";
         private String contents = "";
        
         public SourceFile( String s ) {
             fileName = s;
             try {
                 BufferedReader in = new BufferedReader(new FileReader(fileName));
                 contents = in.readLine();
                 in.close();
             }
             catch(IOException ioe) {
                 System.out.println("\n     Uh-oh, something went hinky!");
             }
         }

         public String getName() {
             return fileName;
         }
        
         public String getContents() {
             return contents;
         }
        
         public static void main(String[] args) {
         
         }
     }
