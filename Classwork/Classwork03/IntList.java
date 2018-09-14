/*  File name     :  IntList.java
 *  Purpose       :  Work with import and package statements
 *  Author        :  Roberto Ventura
 *  Date          :  2018-09-13
 *  Description   :  Will be an abstract data type that is an array of integers
 *  Warnings      :  None
 *  Exceptions    :
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *  Revision History
 *  ----------------
 *            Rev      Date     Modified by:  Reason for change/modification
 *           -----  ----------  ------------  -----------------------------------------------------------
 *  @version 1.0.0  2018-09-13  Bob           To create IntList.java with checkIndex, insertValueAtIndex, and prepend method
 */

 public class IntList implements IntListInterface {
     private int[] theList;
     private int   size;

     private static final int STARTING_SIZE = 19;    // defines starting size; don't worry, we'll deal

     public IntList() {                              // doesn't HAVE to be declared public, but doesn't hurt
         theList = new int[STARTING_SIZE];
         size = 0;
     }

     public void checkIndex(int index) {
         try {
             if(size == 0) {
                 throw new EmptyListException();
             }
             else if(index > size) {
                 throw new NumberFormatException("The index value is too large");
             }
             else if(index < 0) {
                 throw new ArrayIndexOutOfBoundsException("The index value is too small");
             }
         }
         catch (EmptyListException ex) {
             System.out.println(ex.getMessage());
         }
         catch (NumberFormatException Aex) {
             System.out.println("The index value is too large");
         }
         catch (ArrayIndexOutOfBoundsException Aex) {
             System.out.println("The index value is too small");
         }
     }

     public int getValueAtIndex(int index) throws ArrayIndexOutOfBoundsException {
         checkIndex(index);
         return theList[index];
     }

     public boolean append(int valueToAdd) {
         if(size < theList.length) {
             theList[size] = valueToAdd;
             size++;
             return true;
         }
         else {
            // what should we do here, if there's no room?
         }
         return false;
     }
     public boolean prepend(int valueToAdd) {
         return insertValueAtIndex(valueToAdd, 0);
     }
     public boolean insertValueAtIndex(int value, int index) {
         if (index < 0) {
             return false;
         }
         int newSize = theList.length;
         if(index > theList.length) {
             newSize = theList.length + STARTING_SIZE;
         }
         int[] newList = new int[newSize];
         newList[index] = value;
         for(int i = 0; i < theList.length - 1; i++) {
             if (i >= index) {
                 newList[i+1] = theList[i];
             }
             else {
                 newList[i] = theList[i];
             }
         }
         theList = newList;
         return true;
     }

     public int removeValueAtIndex(int index) throws ArrayIndexOutOfBoundsException {
         checkIndex(index);
         int value = theList[index];
         holeFiller(index);
         return value;
     }

     private void holeFiller(int index) {
         for (int i = index; i < size - 1; i++) {
             theList[i] = theList[i+1];
         }
         size--;
     }

     public String toString() {
         String ans ="[";
         for (int i = 0; i < theList.length; i++) {
             ans = ans + String.valueOf(theList[i]);
             if (i < theList.length - 1) {
                 ans = ans + ",";
             }
         }
         ans =  ans + "]";
         return ans;
     }
     public static void main( String[] args ) {

         IntList list = new IntList();
         list.append(2);
         list.append(3);
         list.append(5);
         list.append(7);
         System.out.println( list.getValueAtIndex(3) );   // should return the value 7
         list.append(11);
         list.append(13);
         list.append(17);
         list.append(19);
         System.out.println( list.getValueAtIndex( 7 ) );      // should return the value 19
         System.out.println( list.removeValueAtIndex( 3 ) );   // should return the value 7
         System.out.println( list.getValueAtIndex( 3 ) );      // should return the value 11
         System.out.println( list.getValueAtIndex( 18 ) );     // just to see what happens
         System.out.println("Checking new methods added");
         System.out.println( list.toString() );                // see what array looks like
         list.checkIndex(200);
         list.checkIndex(-100);
         list.checkIndex(0);                                   // nothing should happen because value is valid
         list.insertValueAtIndex(200, 20);
         System.out.println( list.toString() );                // see what array looks like
         list.insertValueAtIndex(-10, 4);
         System.out.println( list.toString() );                // see what array looks like
         list.insertValueAtIndex(-70, 15);
         System.out.println( list.toString() );                // see what array looks like
         list.prepend(10);
         System.out.println( list.toString() );                // see what array looks like
         list.prepend(10000);
         System.out.println( list.toString() );                // see what array looks like
         list.prepend(20);
         System.out.println( list.toString() );                // see what array looks like
     }
 }
