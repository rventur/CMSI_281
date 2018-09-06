/*  File name     :  MyFileCopier.java
 *  Purpose       :  Work with import and package statements
 *  Authors       :  Roberto Ventura , B.J. Johnson (for Template)
 *  Date          :  2018-09-05 
 *  Description   :  Will utilize TargetFile.java and SourceFile.java
 *  Warnings      :  None
 *  Exceptions    :  
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *  Revision History
 *  ----------------
 *            Rev      Date     Modified by:  Reason for change/modification
 *           -----  ----------  ------------  -----------------------------------------------------------
 *  @version 1.0.0  2018-09-05  Bob           Practice using import and package
 */

/* Warning! text editor smart indent, may cause indentation issues when opened up on another editor */
/* Will change my text editor for next assignment */
 import copiersupport.SourceFile;
 import copiersupport.TargetFile;
 import java.util.Scanner;

     public class MyFileCopier {
       
         public static void main(String[] args) {
               
             System.out.print("What is the name of the file to be copied?: ");
             Scanner input = new Scanner( System.in );
             String fileName = input.nextLine();
             SourceFile sf = new SourceFile(fileName);
             String content = sf.getContents();
             TargetFile tf = new TargetFile(fileName,content);  
                 
         }
     }
