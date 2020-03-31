public class Car {

    public static void main(String[] args) {

        // Car() -->  Has capacity to build/construct Car type of object when called/ordered
        // new --> Invoke or CEO asks employees to start building car using Car()
        // Someone who build we can name them Constructor --> Car() --> ClassName()
        // Car() --> Constructor
        Car sedanCar = new Car();
        // By this way you can use the functionality of useMapToNavigation() method
        sedanCar.useMapToNavigate();
    }

    public void useMapToNavigate(){
        // We should implement some code to use Map for navigation
        System.out.println("Show route in Map");
    }
}
