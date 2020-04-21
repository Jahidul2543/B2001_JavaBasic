package collection_framework;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

    /**
     * 1. Do we know how to use loops?
     * 2. What is Generic?
     * 3. Every class has methods?
     *
     * */

    public static void main(String[] args) {
        List<String> newList = arrayListDemo();
        System.out.println("Size of the newList array " + newList.size());
    }

    public static List<String> arrayListDemo(){
        int[] array = new int[6];
        int lenthg = array.length;

        List<String> studentName = new ArrayList<String>();

        studentName.add("Navid");
        studentName.add("Navid");
        studentName.add("Ferhan");
        studentName.add("Kawser");
        studentName.add("Shawn");
        studentName.add("Michael");
        studentName.add("Kamrun Nahar");
        studentName.add("Eashan");
        studentName.add(null);

        System.out.println("Size of the studentName array " + studentName.size());
        System.out.println("Element at index 6:  " + studentName.get(6));

        int counter = 0;
        for (String str: studentName) {
           // System.out.println("Name of the student at index of " + studentName.indexOf(str) + ' ' + str);
            System.out.println("Name of the student at index of " + counter + ' ' + str);
            counter++;
        }

        for(int x=0; x<studentName.size(); x++){
            System.out.println("Using for loop " + studentName.get(x) );
        }

       studentName.forEach(str -> System.out.println("Using foreach method " + str));

       /* try {
            System.out.println("Element at index 6:  " + studentName.get(6));
        }catch (IndexOutOfBoundsException e){
            e.printStackTrace();
        }*/


        return studentName;
    }
}
