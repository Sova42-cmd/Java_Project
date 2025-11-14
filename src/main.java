import java.util.Scanner;

public class main{
    public static void main(String[] args){

        System.out.println("|______________|");
        System.out.println("Price List:");
        System.out.println("Item1 – $19.99");
        System.out.println("Item2 – $29.99");
        System.out.println("Iten3 – $49.99");
        System.out.println("Item4 – $99.99");
        System.out.println("|______________|");

        double item1 = 19.99;
        double item2 = 29.99;
        double item3 = 49.99;
        double item4 = 99.99;

        Scanner scanner = new Scanner(System.in);

        System.out.println("What would you like to buy? (item1/item2/item3/item4):");
        String items = scanner.nextLine();

        System.out.println("How many would you like?: ");
        double quantity = scanner.nextDouble();

        System.out.println("Your cart: " + items + " quantity: " + quantity);

        if(items.equals("item1")){
            System.out.println("price: " + item1 * quantity);
        } else if(items.equals("item2")){
            System.out.println("price: " + item2 * quantity);
        } else if(items.equals("item3")){
            System.out.println("price: " + item3 * quantity);
        } else if(items.equals("item4")){
            System.out.println("price: " + item4 * quantity);
        } else {
            System.out.println("Something went wrong");
        }


        scanner.close();

    }
}