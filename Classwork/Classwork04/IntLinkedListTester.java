/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *  File name     :  IntLinkedListTester.java
 *  Purpose       :  Provides a class to test methods in the IntLinkedList class
 *  @author       :  Bob
 *  Date written  :  2017-09-19
 *  Notes         :  None right now.  I'll add some as they occur.
 *  Warnings      :  None
 *  Exceptions    :  IllegalArgumentException when the input arguments are "hinky"
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *  Revision History
 *  ----------------
 *            Rev      Date     Modified by:  Reason for change/modification
 *           -----  ----------  ------------  -----------------------------------------------------------
 *  @version 1.0.0  2018-09-19  Bob           Test IntLinkedList class
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */
public class IntLinkedListTester {

    public static void main( String[] args ) {

        IntLinkedList myList = new IntLinkedList();
        myList.prepend( 23 );
        myList.prepend( 19 );
        myList.prepend( 17 );
        myList.prepend( 13 );
        myList.prepend( 11 );
        myList.prepend(  7 );
        myList.prepend(  5 );
        myList.prepend(  3 );
        myList.prepend(  2 );
        IntLinkedList.Iterator myIt = myList.getIteratorAt( 0 );
        System.out.println( "Current Node is: " + myIt.getCurrentInt() );    // 2
        myIt.next();
        System.out.println( "Current Node is: " + myIt.getCurrentInt() );    // 3
        myIt.next();
        System.out.println( "Current Node is: " + myIt.getCurrentInt() );    // 5
        myIt.next();
        System.out.println( "Current Node is: " + myIt.getCurrentInt() );    // 7
        myIt = myList.getIteratorAt( 3 );
        System.out.println( "Current Node is: " + myIt.getCurrentInt() );    // 7
        myIt.next();
        System.out.println( "Current Node is: " + myIt.getCurrentInt() );    // 11
        myIt.next();
        System.out.println( "Current Node is: " + myIt.getCurrentInt() );    // 13
        myIt.next();
        System.out.println( "Current Node is: " + myIt.getCurrentInt() );    // 17
        myList.insertAt(7,100);
        myIt = myList.getIteratorAt( 7 );
        System.out.println( "I inserted 100 into index 7" );
        System.out.println( "Index 7 Should be 100: " + myIt.getCurrentInt() );    // 100
        int removed = myList.removeAt(8);
        System.out.println( "I removed index 8 and value removed is: " + removed); // 19
        myIt = myList.getIteratorAt( 8 );
        System.out.println( "Index 8 Should be 23: " + myIt.getCurrentInt() );    // 23
        removed = myList.removeAt(0);
        System.out.println( "I removed index 0 and value removed is: " + removed); // 2
        myIt = myList.getIteratorAt( 0 );
        System.out.println( "Index 0 Should be 3: " + myIt.getCurrentInt() );
        removed = myList.removeAt(5);
        System.out.println( "I removed index 5 and value removed is: " + removed); // 17
        myIt = myList.getIteratorAt( 5 );
        System.out.println( "Index 5 Should be 100: " + myIt.getCurrentInt() );  // 100
        myList.insertAt(7,55);
        myIt = myList.getIteratorAt( 7 );
        System.out.println( "I inserted 55 into index 7" );
        System.out.println( "Index 7 Should be 55: " + myIt.getCurrentInt() );    // 55
        myList.insertAt(6,24);
        myIt = myList.getIteratorAt( 6 );
        System.out.println( "I inserted 24 into index 6" );
        System.out.println( "Index 6 Should be 24: " + myIt.getCurrentInt() );    // 24
        myList.insertAt(8,2);
        myIt = myList.getIteratorAt( 8 );
        System.out.println( "I inserted 2 into index 8" );
        System.out.println( "Index 8 Should be 2: " + myIt.getCurrentInt() );    // 2
        myList.insertAt(9,10);
        myIt = myList.getIteratorAt( 9 );
        System.out.println( "I inserted 10 into index 9" );
        System.out.println( "Index 9 Should be 10: " + myIt.getCurrentInt() );
        removed = myList.removeAt(8);
        System.out.println( "I removed index 8 and value removed is: " + removed); 
        myIt = myList.getIteratorAt( 8 );
        System.out.println( "Index 5 Should be 10: " + myIt.getCurrentInt() );
        removed = myList.removeAt(1);
        System.out.println( "I removed index 1 and value removed is: " + removed);
        myIt = myList.getIteratorAt( 1 );
        System.out.println( "Index 1 Should be 7: " + myIt.getCurrentInt() );  
    }
}
