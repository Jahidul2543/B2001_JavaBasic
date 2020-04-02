package control_flow;

public class ControlFlowDemo {

    /**
     *
     * Requesting a route from point A to B
     * 1. Head towards road 10 and take left
     * 2. Take right on road 12 (if road is blocked take alternative route)
     * 3. Take left after 1000 Ft
     * 4. Head East 2000 ft
     * 5. You have arrived in point B
     *
     * */

    public static void main(String[] args) {
        ControlFlowDemo obj = new ControlFlowDemo();
        obj.calculateRoute();
    }

    public void calculateRoute(){
        int roadNumber= 10;
        if (roadNumber==10){
            System.out.println("1. Take left on road 10");

            boolean isRoad11IsBolcked = true;

            if(isRoad11IsBolcked == true){
                System.out.println("2. Take right on road 12");
                System.out.println("3. After 1000 ft take left");

                int distanceWalked = 1000;
                if(distanceWalked==1000){
                    System.out.println("Take left");

                    distanceWalked = 2000;
                    if(distanceWalked==2000){
                        System.out.println("5. You have arrived in point B");
                    }
                }

            }

        }
        else{
            System.out.println("Check your location");
        }


    }


}
