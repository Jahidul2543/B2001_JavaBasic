package variable_type_according_to_scope;

public class VariableDemo2 {

    public static void main(String[] args) {

    }
    public void getFieldFromVariableDemo(){
        VariableDemo variableDemo = new VariableDemo();
        int y = variableDemo.x;
       // String name = variableDemo.name;
        String name = VariableDemo.name;

    }
}
