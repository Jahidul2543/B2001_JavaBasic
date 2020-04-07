package loopdemo;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.ArrayList;

public class ForeachDemo {

    public static void main(String[] args) {
         ForeachDemo foreachDemo = new ForeachDemo();
        foreachDemo.storeStudentInfoInArray();
        //foreachDemo.foreachDemo();
    }

    public void storeStudentInfoInArray(){
        //final int size = 6;
        int[] studentId = new int[6];

        /*studentId[0] = 200101;
        studentId[1] = 200102;
        studentId[2] = 200103;
        studentId[3] = 200104;*/

        for (int x = 0; x<studentId.length; x++ ) {
            studentId[x] = 200101 + x;
          //  System.out.println("Index " + x + " contains id number " + studentId[x]);
        }

     /**
      * I want to grab
     *  for( Integer x : studentId){
     *       System.out.println(x); // 200101, 200102.......
     *   }
     * */

     for( int x : studentId  ){
         System.out.println("----" + x);
     }
    }

    public void foreachDemo(){
        // What is wrapper class?
       Integer[] studentIDArray = new Integer[6];

       /*
       * Store student ID using for loop
       * */
        for (int x = 0; x<studentIDArray.length; x++ ) {
            // 200101 + 0 = 200101
            // 200101 = 1 = 200102
            studentIDArray[x] = 200101 + x;
           // System.out.println("Index " + x + " contains id number " + demoArray[x]);
        }

        /*
        * Take out all the student id from studentIDArray
        *
        * */
        for (int x = 0; x<studentIDArray.length - 3; x++ ) {
             System.out.println("Index " + x + " contains id number " + studentIDArray[x]);
        }

        /**
         * foreach loop
         * It grabs all element from target
         * In for each loop programmer has no control over iteration
         * for ( TargetedELementType y :  target ) {
         *
         *  }
         * */

        for( Integer x : studentIDArray){
            System.out.println(x); // 200101, 200102.......
        }
    }

}
