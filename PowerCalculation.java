import java.util.Scanner;

public class PowerCalculation {
    public static double calculatePower(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter base: ");
        double base = scanner.nextDouble();
        System.out.print("Enter exponent: ");
        double exponent = scanner.nextDouble();
        double result = calculatePower(base, exponent);
        System.out.println("Result: " + result);
    }
}