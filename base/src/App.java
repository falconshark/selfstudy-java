public class App {
    // Comment and some code come from https://java.sevendays-study.com/
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        //Base math
        int mathAddResult = add(5, 6);
        System.out.println(mathAddResult);
        int mathSubtractResult = subtract(10, 6);
        System.out.println(mathSubtractResult);
        int mathMultiResult = multi(5, 6);
        System.out.println(mathMultiResult);
        int mathDividResult = divid(30, 6);
        System.out.println(mathDividResult);
    }
    private static int add(Integer number1, Integer number2) {
        int result = number1 + number2;
        return result;
    }
    private static int subtract(Integer number1, Integer number2) {
        int result = number1 - number2;
        return result;
    }
    private static int multi(Integer number1, Integer number2) {
        int result = number1 * number2;
        return result;
    }
    private static int divid(Integer number1, Integer number2) {
        int result = number1 / number2;
        return result;
    }
}
