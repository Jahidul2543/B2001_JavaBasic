package control_flow;

public class SwitchDemo {

    SwitchDemo  obj;


   // SwitchDemo  obj;
    public static void main(String[] args) {
       // String monthString = "January";
        SwitchDemo objSwitchDemo = new SwitchDemo();
      //  objSwitchDemo.switchDemo();
        objSwitchDemo.switchUsingMethodAsStatement();
    }

    public void switchDemo(){

        int lightNumber = 2;
        switch (lightNumber){
            case 1:
                System.out.println("Turning on light number 1");
                break;
            case 2:
                System.out.println("Turning on light number 2");
                break;
            case 3:
                System.out.println("Turning on light number 3");
                break;
            case 4:
                System.out.println("Turning on light number 3");
                break;
            default:
                System.out.println("No lights is on");
        }

    }

    public void switchUsingMethodAsStatement(){
         obj = new SwitchDemo();
        int caseNumber = 2;
        switch (caseNumber){
            case 1:
                obj.turnOnLight(1);
                break;
            case 2:
                obj.turnOnLight(2);
                break;
            case 3:
                obj.turnOnLight(3);
                break;
            case 4:
                obj.turnOnLight(4);
                break;
            default:
                System.out.println("No lights is on");
        }

    }
    /*
    * This method will help us to turn on light
    * */
    public void turnOnLight(int lightNumber){
        System.out.println("Turning on light number " + lightNumber);
    }
}
