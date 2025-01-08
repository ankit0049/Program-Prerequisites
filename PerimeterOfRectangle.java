import java.util.Scanner;

public class PerimeterOfRectangle {
    public static double calculatePerimeter(double length, double width) {
        return 2 * (length + width);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length of the rectangle: ");
        double length = scanner.nextDouble();
        System.out.print("Enter width of the rectangle: ");
        double width = scanner.nextDouble();
        double perimeter = calculatePerimeter(length, width);
        System.out.println("Perimeter of the rectangle: " + perimeter);
    }
}
