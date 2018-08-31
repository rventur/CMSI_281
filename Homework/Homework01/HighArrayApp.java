/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *  File name     :  HighArray.java
 *  Purpose       :  Provides a class defining methods for the HighArray
 *  @author       :  Bob
 *  Date written  :  2017-08-30
 *  Description   : 
 *
 *  Notes         :  None right now.  I'll add some as they occur.
 *  Warnings      :  None
 *  Exceptions    :  IllegalArgumentException when the input arguments are "hinky"
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *  Revision History
 *  ----------------
 *            Rev      Date     Modified by:  Reason for change/modification
 *           -----  ----------  ------------  -----------------------------------------------------------
 *  @version 1.0.0  2018-08-30  Bob           Create HighArray Class
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ 
 */
 public class HighArrayApp {
	 
	 public static void main(String[] args) {
	                                      
	 int maxSize = 100;                // array size
	 HighArray arr;                    // reference to array
	 arr = new HighArray(maxSize);     // create the array
	 arr.insert(77); 
	 arr.insert(99); 
	 arr.insert(44); 
	 arr.insert(55); 
	 arr.insert(22); 
	 arr.insert(88); 
	 arr.insert(11); 
	 arr.insert(00); 
	 arr.insert(66); 
	 arr.insert(33);
	 arr.display();                    // display items
	 int searchKey = 35;               // search for item
	 if( arr.find(searchKey) ) {   
	     System.out.println("Found " + searchKey); }
     else {
	     System.out.println("Can’t find " + searchKey);
	 }
	 arr.delete(00);                   // delete 3 items
	 arr.delete(55); 
	 arr.delete(99);
	 arr.display();                    // display items again
	 }
 }
