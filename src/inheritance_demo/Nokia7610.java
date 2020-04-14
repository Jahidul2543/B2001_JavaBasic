package inheritance_demo;

public class Nokia7610 extends Nokia1100{

    public Nokia7610(){
        super();
    }

    public static void main(String[] args) {
        Nokia7610 nokia7610 = new Nokia7610();
        nokia7610.doSomething();
        nokia7610.newFeature();
    }
    public void doSomething(){
        super.call();

    }
    public void doSomething(String game){
       // super.call();
        System.out.println("Play " + game);
    }

    public void phoneBook(){
        System.out.println("You are over riding method from super class ");
    }

}
