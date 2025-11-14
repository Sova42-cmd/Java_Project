import java.util.Scanner;

public class main{

    public static void main(String[] args){

//        Scanner scanner = new Scanner(System.in);

            // HYPOTENUSE
//
//        double a;
//        double b;
//        double c;
//
//        System.out.println("Enter the lenght of first page: ");
//        a = scanner.nextDouble();
//
//        System.out.println("Enter the lenght of second page: ");
//        b = scanner.nextDouble();
//
//        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
//
//        System.out.println("The hypotenuse is: " + c);
//
//        scanner.close();

        // Circumference -> 2πr
        // Area -> πr^2
        // Volume -> 4/3πr^3

        Scanner scanner = new Scanner(System.in);

        double radius;
        double circumference;
        double area;
        double volume;

        System.out.println("Enter the radius of the circle: ");
        radius = scanner.nextDouble();

        circumference = 2*Math.PI*radius;
        area = Math.PI*Math.pow(radius, 2);
        volume = (4.0 / 3.0)*Math.PI*Math.pow(radius,3);

        System.out.printf("The circumference of the circle is... → %.1f\n", circumference);
        System.out.printf("The area of the circle is... → %.1f\n", area);
        System.out.printf("The volume of the circle is... → %.1f\n", volume);

        scanner.close();
    }

}