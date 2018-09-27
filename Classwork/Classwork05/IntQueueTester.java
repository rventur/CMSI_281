/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *  File name     :  IntQueueTester.java
 *  Purpose       :  Provides a class to test methods in the IntQueue class
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
 *  @version 1.0.0  2018-09-26  Bob           Test IntQueue class
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */
public class IntQueueTester {

    public static void main( String[] args ) {

        IntQueue myQ = new IntQueue();
        myQ.enQueue( 4 );
        myQ.enQueue( 1 );
        myQ.enQueue( 3 );
        myQ.enQueue( 10 );
        myQ.enQueue( 14 );
        myQ.enQueue( 610 );
        myQ.enQueue( -4 );
        myQ.enQueue( 42 );
        myQ.enQueue( 326 );
        myQ.enQueue( 999 );
        myQ.enQueue( -20 );
        myQ.enQueue( -56 );
        myQ.enQueue( 45 );
        myQ.enQueue( 62 );
        myQ.enQueue( 264 );
        myQ.enQueue( 6274 );
        myQ.enQueue( -27168 );
        
        
        System.out.println("\n\nAt the top of this Queue is: " + "" + myQ.peek());
        System.out.println("I have removed the the top which is: " + "" + myQ.deQueue());
        System.out.println("So the top of this Queue is now: " + "" + myQ.peek());
        
        System.out.println("\n\nAt the top of this Queue is: " + "" + myQ.peek());
        System.out.println("I have removed the the top which is: " + "" + myQ.deQueue());
        System.out.println("So the top of this Queue is now: " + "" + myQ.peek());
        
        System.out.println("\n\nAt the top of this Queue is: " + "" + myQ.peek());
        System.out.println("I have removed the the top which is: " + "" + myQ.deQueue());
        System.out.println("So the top of this Queue is now: " + "" + myQ.peek());
        
        System.out.println("\n\nAt the top of this Queue is: " + "" + myQ.peek());
        System.out.println("I have removed the the top which is: " + "" + myQ.deQueue());
        System.out.println("So the top of this Queue is now: " + "" + myQ.peek());
        
        System.out.println("\n\nAt the top of this Queue is: " + "" + myQ.peek());
        System.out.println("I have removed the the top which is: " + "" + myQ.deQueue());
        System.out.println("So the top of this Queue is now: " + "" + myQ.peek());
        
        System.out.println("\n\nAt the top of this Queue is: " + "" + myQ.peek());
        System.out.println("I have removed the the top which is: " + "" + myQ.deQueue());
        System.out.println("So the top of this Queue is now: " + "" + myQ.peek());
        
        System.out.println("\n\nAt the top of this Queue is: " + "" + myQ.peek());
        System.out.println("I have removed the the top which is: " + "" + myQ.deQueue());
        System.out.println("So the top of this Queue is now: " + "" + myQ.peek());
        
        System.out.println("\n\nAt the top of this Queue is: " + "" + myQ.peek());
        System.out.println("I have removed the the top which is: " + "" + myQ.deQueue());
        System.out.println("So the top of this Queue is now: " + "" + myQ.peek());
        
        System.out.println("\n\nAt the top of this Queue is: " + "" + myQ.peek());
        System.out.println("I have removed the the top which is: " + "" + myQ.deQueue());
        System.out.println("So the top of this Queue is now: " + "" + myQ.peek());
        
        System.out.println("\n\nAt the top of this Queue is: " + "" + myQ.peek());
        System.out.println("I have removed the the top which is: " + "" + myQ.deQueue());
        System.out.println("So the top of this Queue is now: " + "" + myQ.peek());
        
        System.out.println("\n\nAt the top of this Queue is: " + "" + myQ.peek());
        System.out.println("I have removed the the top which is: " + "" + myQ.deQueue());
        System.out.println("So the top of this Queue is now: " + "" + myQ.peek());
        
        System.out.println("\n\nAt the top of this Queue is: " + "" + myQ.peek());
        System.out.println("I have removed the the top which is: " + "" + myQ.deQueue());
        System.out.println("So the top of this Queue is now: " + "" + myQ.peek());
        
        System.out.println("\n\nAt the top of this Queue is: " + "" + myQ.peek());
        System.out.println("I have removed the the top which is: " + "" + myQ.deQueue());
        System.out.println("So the top of this Queue is now: " + "" + myQ.peek());
        
        System.out.println("\n\nAt the top of this Queue is: " + "" + myQ.peek());
        System.out.println("I have removed the the top which is: " + "" + myQ.deQueue());
        System.out.println("So the top of this Queue is now: " + "" + myQ.peek());
        
        System.out.println("\n\nAt the top of this Queue is: " + "" + myQ.peek());
        System.out.println("I have removed the the top which is: " + "" + myQ.deQueue());
        System.out.println("So the top of this Queue is now: " + "" + myQ.peek());
        
        System.out.println("\n\nAt the top of this Queue is: " + "" + myQ.peek());
        System.out.println("I have removed the the top which is: " + "" + myQ.deQueue());
        
        
        System.out.println("\n\n\nThis should be the last value in the Queue (-27168): " + "" + myQ.peek() + "\n");
    }
}
