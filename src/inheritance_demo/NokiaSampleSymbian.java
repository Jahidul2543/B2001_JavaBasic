package inheritance_demo;

public abstract class NokiaSampleSymbian implements Symbian {

    /**
     * At least one unimplemented method
     * */
    public void call(){
        System.out.println("Make call");
    }
    public void text(){
        System.out.println("Send text");
    }
    public abstract void phoneBook();
}
