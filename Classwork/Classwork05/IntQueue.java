/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *  File name     :  IntQueue.java
 *  Purpose       :  Provides a class defining methods for the IntQueue class
 *  @author       :  Bob
 *  Date written  :  2018-09-26
 *  Notes         :  None right now.  I'll add some as they occur.
 *  Warnings      :  None
 *  Exceptions    :  IllegalArgumentException when the input arguments are "hinky"
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *  Revision History
 *  ----------------
 *            Rev      Date     Modified by:  Reason for change/modification
 *           -----  ----------  ------------  -----------------------------------------------------------
 *  @version 1.0.0  2018-09-27  Bob           Rewrite IntStack to be a Queue
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */
public class IntQueue {

    IntLinkedList myQ;

    IntQueue() {
        myQ = new IntLinkedList();         // constructor
    }

    public int getSize() {
        IntLinkedList.Iterator it = myQ.getIteratorAt( 0 );
        int size = 0;
        while (it.hasNext() == true) {
            size = size + 1;
            it = myQ.getIteratorAt( size );
        }
        return size;
    }

    public void enQueue( int itemToPush ) {
        myQ.prepend( itemToPush );
    }

    public int peek() {
        int last = getSize();
        return myQ.getIteratorAt( last ).getCurrentInt();     // we use the iterator
    }

    public int deQueue() {
        int last = getSize();
        return myQ.removeAt( last );
    }
}
