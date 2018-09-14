/*  File name     :  IntListInterface.java
 *  Purpose       :  Create an interface
 *  Author        :  Roberto Ventura
 *  Date          :  2018-09-13
 *  Description   :  Will be an interface for the IntList class
 *  Warnings      :  None
 *  Exceptions    :
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *  Revision History
 *  ----------------
 *            Rev      Date     Modified by:  Reason for change/modification
 *           -----  ----------  ------------  -----------------------------------------------------------
 *  @version 1.0.0  2018-09-13  Bob           To create interface
 */
 public interface IntListInterface {
     int getValueAtIndex( int index );
     boolean append( int valueToAdd );
     boolean insertValueAtIndex( int value, int index );
     int removeValueAtIndex( int index );
 }
