package variable_type_according_to_scope;

public class VariableDemo {
    //Instance variable
    int x = 4;
    // Class variable
    static String name = "Shawn";

    public static void main(String[] args) {
        System.out.println(name);
    }

    public void myMethod(){
        int y = x;
        System.out.println(name);
        /*if(){

        }*/
        String yourName = "Navid";
    }
}
