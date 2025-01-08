import java.util.Scanner;

public class KilometersToMiles {
    public static double convertToMiles(double kilometers) {
        return kilometers * 0.621371;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter distance in kilometers: ");
        double kilometers = sc.nextDouble();
        double miles = convertToMiles(kilometers);
        System.out.println("Distance in miles: " + miles);
    }
}
