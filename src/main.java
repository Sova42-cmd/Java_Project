import java.util.Scanner;

public class main{

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

            double initial;
            double rate;
            double timesCompounded;
            int years;
            double finalAmount;

        System.out.println("Enter an inital amount: ");
        initial = scanner.nextDouble();

        System.out.println("Enter the % rate: ");
        rate = scanner.nextDouble() / 100;

        System.out.println("Enter the amount of times compounded yearly: ");
        timesCompounded = scanner.nextDouble();

        System.out.println("Enter the amount of years: ");
        years = scanner.nextInt();

        finalAmount = initial * Math.pow(1 + rate / timesCompounded, timesCompounded * years);

        System.out.printf("You'll have $%.2f in %d", finalAmount, years);

        scanner.close();
    }

}