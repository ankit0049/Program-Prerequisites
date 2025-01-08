import java.util.Scanner;

public class VolumeOfCylinder {
    public static double calculateVolume(double radius, double height) {
        return Math.PI * radius * radius * height;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter radius of the cylinder: ");
        double radius = scanner.nextDouble();
        System.out.print("Enter height of the cylinder: ");
        double height = scanner.nextDouble();
        double volume = calculateVolume(radius, height);
        System.out.println("Volume of the cylinder: " + volume);
    }
}
