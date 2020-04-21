package collection_framework;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        mapDemo();
    }

    public static void mapDemo(){
        Map<Integer, String > studentName = new HashMap<>();
        studentName.put(04, "Navid");
        studentName.put(02, "Eashan");
        studentName.put(03, "Shawn");

        System.out.println(studentName.size());
        System.out.println(studentName.get(01));
        System.out.println(studentName.getOrDefault(01, "Hello"));

        for (Map.Entry<Integer, String> entry: studentName.entrySet()) {
            System.out.println( "Name of Key " + entry.getKey() +" Name of value " + entry.getValue());
        }
    }
}
