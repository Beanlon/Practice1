import java.util.Scanner;


public class Circle {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        final double pi = 3.14;
        System.out.print("Enter radius: ");
        int radius = scn.nextInt();

        double area = pi * Math.pow(radius, 2);
        double circumference = 2 * pi * radius;
        double diameter = 2 * radius;

        System.out.println("Created by: Jeric Mata");
        System.out.println ("The Radius is " + radius );
        System.out.println ("Area = " + area);
        System.out.println ("Circumference = " + circumference);
        System.out.println ("Diameter = " + diameter);



        // By Jeric Mata

    }
}
