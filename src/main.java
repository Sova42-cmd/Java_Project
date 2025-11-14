import java.util.Scanner;

public class main {

    public static void main(String[] args){

//        Scanner scanner = new Scanner(System.in);
//
//        double height = 0;
//        double widht = 0;
//        double area = 0;
//
//        System.out.println("Enter the height's size: ");
//        height = scanner.nextDouble();
//
//        System.out.println("Enter the width's size: ");
//        widht = scanner.nextDouble();
//
//        area = height*widht;
//
//        System.out.println("The area of your rectangle is: " + area);
//
//        scanner.close();

        Scanner scanner = new Scanner(System.in);

        String adjective1;
        String adjective2;
        String noun1;
        String noun2;
        String verb1;

        System.out.println("Enter a place name: ");
        noun1 = scanner.nextLine();

        System.out.println("Enter a person's name: ");
        noun2 = scanner.nextLine();

        System.out.println("Enter the first adjective: ");
        adjective1 = scanner.nextLine();

        System.out.println("Enter the second adjective: ");
        adjective2 = scanner.nextLine();

        System.out.println("Enter a verb: ");
        verb1 = scanner.nextLine();

        System.out.println("Today I went to the " + noun1 + " and met there " + noun2 +
        " He/She was really " + adjective1 + " and rather " + adjective2 +
                " After that I " + verb1 + " and died.");

        //sorry for mid quality

        scanner.close();

    }

}