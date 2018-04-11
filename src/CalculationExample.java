public class CalculationExample {
    public static void main(String[] args) {
        CalculationExample calc = new CalculationExample();
        calc.calculate(5, 5);

        calc.calculate(0, 1);

        calc.calculate(5, 0);

        calc.calculate(0, 0);

    }

    private void calculate(int x, int y) {
        try {
            int summation = x + y;
            int subtraction = x - y;
            int multiplication = x * y;
            int division = x / y;
            System.out.println("x + y = " + summation);
            System.out.println("x - y = " + subtraction);
            System.out.println("x * y = " + multiplication);
            System.out.println("x / y = " + division);
        } catch (Exception e) {
            System.err.println("Exception: " + e.getMessage());
        }
    }
}
