/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *  File name     :  IntLinkedList.java
 *  Purpose       :  Provides a class defining methods for the IntLinkedList class
 *  @author       :  Bob
 *  Date written  :  2018-09-19
 *  Notes         :  None right now.  I'll add some as they occur.
 *  Warnings      :  None
 *  Exceptions    :  IllegalArgumentException when the input arguments are "hinky"
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *  Revision History
 *  ----------------
 *            Rev      Date     Modified by:  Reason for change/modification
 *           -----  ----------  ------------  -----------------------------------------------------------
 *  @version 1.0.0  2018-09-19  Bob           Add insertAt() and removeAt() method
 *  @version 1.0.1  2018-09-27  Bob           renamed getSize method to returnSize
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */   
public class IntLinkedList {

    private Node head;
    private int  size;

    // the constructor
    IntLinkedList() {
        head = null;
        size = 0;
    }

    public int returnSize() {
        return size;
    }

    public void prepend( int dataToAdd ) {
        Node currentHead = head;
        head = new Node( dataToAdd );
        head.next = currentHead;
        size++;
    }
    // will take index and insert data valye to add
    public void insertAt( int index, int dataToAdd ) {
        if (index == 0) {
            prepend(dataToAdd);
        }
        Iterator it = getIteratorAt(index-1);          // get pointer
        Node n = new Node( dataToAdd );                // new node
        n.next = it.currentNode.next;                  // point new node at next index
        it.currentNode.next = n;                       // insert n into list
        size++;
    }
    // will take index and remove that value but return value it removed
    public int removeAt( int index ) {
        Iterator it = getIteratorAt(index);
        int mijo = it.getCurrentInt();
        if (index == 0) {
            head = it.currentNode.next;
            size--;
            return mijo;
        }
        else if (it.hasNext() == false) {
            it = getIteratorAt(index-1);
            it.currentNode.next = null;
            size--;
            return mijo; // return early since already handled
        }
        Node n = it.currentNode.next;
        it = getIteratorAt(index-1);
        it.currentNode.next = n;
        size--;
        return mijo;
    }
    private class Node {

        int data;            // remember this is an IntLinkedList
        Node next;           // here's the self-referential part

        // constructor
        Node( int d ) {
            data = d;
            next = null;
        }
    }

    public Iterator getIteratorAt( int index ) {
        if( (index > size) || (index < 0) ) {
            throw new IllegalArgumentException();
        }
        Iterator it = new Iterator();
        while( index > 0 ) {
            it.next();
            index--;
        }
        return it;
    }

    public class Iterator {
        private Node currentNode;

        Iterator() {
            currentNode = head;
        }

        public void next() {
            if( currentNode == null ) {
                return;
            }
            else {
                currentNode = currentNode.next;
            }
        }

        public boolean hasNext() {
            return ((currentNode != null) && (currentNode.next != null));
        }

        public int getCurrentInt() {
            return currentNode.data;
        }
    }
    public static void main( String[] args ) {

    }
}
