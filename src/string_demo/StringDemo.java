package string_demo;

public class StringDemo {
    public static void main(String[] args) {
        int x = 6;
        x = 10;
        String name = "Jahidul";
       // name= "John";

        System.out.println(name.replace('J', 'K'));
       // System.out.println(x);

        String name1 = new String("Jack");
        System.out.println("Nmae1 " + name1.replace('J', 'M'));
        stringBufferDemo();
        stringBuilder();

    }

    public static void stringBufferDemo(){
        System.out.println("*******Start of stringBuilder() Method******");
        StringBuffer stringBuffer = new StringBuffer("Navid");
        System.out.println(stringBuffer.replace(0, 1,"Ji" ));
    }
    public static void stringBuilder(){
        System.out.println("*******Start of StringbufferDemo() Method******");
        StringBuilder stringBuilder = new StringBuilder("Eashan");
        System.out.println(stringBuilder.replace(0, 1,"Je" ));
    }
}
