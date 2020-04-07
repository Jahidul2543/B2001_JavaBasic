package loopdemo;

public class ForLoopDemo {

    public static void main(String[] args) {
        ForLoopDemo forLoopDemo = new ForLoopDemo();
        forLoopDemo.forLoopDemo();
    }

    public void forLoopDemo(){
        /**
         *
         * Keep eating until you are full
         * 1. When to start eating (0)
         * 2. Take one bite of food each time(1)
         * 3. When to stop eating (100%)
         *
         * for(whereToStart; whenToStop; HowToProceedTowardsEndPoint){
         *     // Do until you meet the criteria of "When to Stop"
         * }
         * == equlity
         * >
         * <
         * >=
         * <=
         * */

        //When this loop will stop??? 100

        int amountOfFoodInTheBelly;

        for(amountOfFoodInTheBelly=0; amountOfFoodInTheBelly<=100; amountOfFoodInTheBelly++){
            System.out.println("Amount Of Food In TheBelly " + amountOfFoodInTheBelly);
            // I want to write message "stop eating you are already 100%"
            // This message will be printed only once

            if(amountOfFoodInTheBelly==100){
                System.out.println("Stop eating you are already " + amountOfFoodInTheBelly);
            }
        }



    }

}
