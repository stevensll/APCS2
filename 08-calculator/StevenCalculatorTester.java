public class StevenCalculatorTester {
    public static void main(String[] args) {
        System.out.println(Calculator.eval("11 3 - 4 + 2.5 *"));
        System.out.println(Calculator.eval("10 +"));
        System.out.println(Calculator.eval("8 2 + 99 9 - * 2 + 9 -"));
        System.out.println(Calculator.eval("1 2 3 4 5 % * - -"));
        System.out.println(Calculator.eval("99 -1 - 10 100 * +"));
        // System.out.println( 1 - (2 - (3 * (4 % 5))));
    }
}