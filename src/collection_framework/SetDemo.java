package collection_framework;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        hashSetDemo();
    }

    public static void hashSetDemo(){
        Set<String> studentName = new HashSet<>();

        studentName.add("Navid");
        studentName.add(null);
        studentName.add("Ferhan");
        studentName.add("Micheal");
        studentName.add("Eashan");
        studentName.add("Kamrun Nahar");

        System.out.println(studentName.size());

        for (String str: studentName) {
            System.out.println(str);
        }
       // Set<Integer> rollname = new HashSet<>();
    }
}
