public class Calculator {

    public double add(double a, double b) {
        return a + b;
    }

    public double minus(double a, double b) {
        return a - b;
    }

    public double multiple(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        if (b == 0)
            return -1;
        else
            return a / b;
    }

    private double sin(double a) {
        return Math.sin(a);
    }

    private double cos(double a) {
        return Math.cos(a);
    }



}
