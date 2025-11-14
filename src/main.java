import java.util.Scanner;

public class main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Adult Website: Are you 18+ (y/n)?:  ");
        String confirmation = scanner.nextLine();

        if(confirmation.equals("y")){
            System.out.println("Welcome to pornhub!");
        } else{
            System.out.println("No porn for you kiddo ;<");
        }

        scanner.close();
    }
}