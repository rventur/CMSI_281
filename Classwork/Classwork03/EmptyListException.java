/*  File name     :  EmptyListException.java
 *  Purpose       :  Create an exception for IntList class
 *  Author        :  Roberto Ventura
 *  Date          :  2018-09-13
 *  Description   :  Will be an exception when array is empty
 *  Warnings      :  None
 *  Exceptions    :
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *  Revision History
 *  ----------------
 *            Rev      Date     Modified by:  Reason for change/modification
 *           -----  ----------  ------------  -----------------------------------------------------------
 *  @version 1.0.0  2018-09-13  Bob           To create exception when list is empty
 */
public class EmptyListException extends Exception {
    public EmptyListException() {
        System.out.println("This is empty!, you need to inout something to work with!");
    }
}
