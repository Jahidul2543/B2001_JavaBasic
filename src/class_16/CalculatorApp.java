package class_16;

public class CalculatorApp {

    /**
     * Unit Testing
     * */

    public static void main(String[] args) {
      int result =  multiply(4,0);
      int divisionResult = division(4, 0);
    }

    public int add(int x, int y){
        /**
         * 1. 2, 2 = 4  (valid)
         * 2. sd, 3 = error/exception (invalid)
         * 3. 3.3333, 5 = error/exception (invalid)
         * */
        int result = x + y;
        return result;
    }

    public static int multiply(int x, int y){
        int result = x*y;
        return result;
    }

    public static int division(int x, int y){
        int result = x/y;
        try {
            result = x / y;
        }
        catch (Exception e){
            e.printStackTrace();
            System.out.println("You are entering invalid number, please check");
        }
        finally {
            System.out.println("Execute me whatever happens, I don't care");
        }
        return result;
    }
}
