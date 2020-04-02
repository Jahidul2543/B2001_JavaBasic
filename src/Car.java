public class Car {

    /**
     * Why to use IDE?
     * Your Answer
     * 1. Easy to use
     * 2. Easy to navigate, easy to identify errors
     * 3. Auto completion and hints
     * 4. Less time consuming
     * 5. Help to code easily and efficiently
     * 6. Organizing Project
     * 7. Refactoring, Suggestions
     * 8. Looks aesthetic
     * 5/10, 20/30, 10/15, 10, 50, 10, 15
     * */

    /**
     *
     * Default Constructor
     *
     * */

    public Car(){
        System.out.println("I am default constructor");
    }

    public Car(String model, int x){
        System.out.println("Building a car of " + model +" " + x);
    }

    public static void main(String[] args) {

        // Car() -->  Has capacity to build/construct Car type of object when called/ordered
        // new --> Invoke or CEO asks employees to start building car using Car()
        // Someone who build we can name them Constructor --> Car() --> ClassName()
        // Car() --> Constructor
        Car sedanCar = new Car();
        // By this way you can use the functionality of useMapToNavigation() method
        sedanCar.useMapToNavigate();
        sedanCar.doSomething();
       // sedanCar.increaseSpeed(70);
        sedanCar.increaseSpeed(140, "Kilometers");

        Car suv = new Car("SUV ",  2020);
        suv.increaseSpeed(80);

    }

    public void useMapToNavigate(){
        // We should implement some code to use Map for navigation
        System.out.println("Show route in Map");
    }
    // Write code to complete a task
    // How you make sure a method is capable of doing something as per your requirements?
    // Return Type
    // 1. void --> Return nothing
    // 2. Any data type --> int, double, byte, float, char, [Object Type(!!!)--> Strange Type -->Non-Primitive --> Unlimited]

    public void doSomething(){
        // Write some code to do something
        System.out.println("Write some code to do something");
    }

    public void increaseSpeed(int speed){

        System.out.println("Increase speed up to " + speed );
    }
    public void increaseSpeed(int speed, String unit){

        System.out.println("Increase speed up to  " + speed  + unit);
    }

    public void increaseSpeed(String unit, int speed){

        System.out.println("Increase speed " + speed  + unit);
    }
}
// Line 43 is going to be executed? Yes/No
// Kawser Yes --> Yes
//