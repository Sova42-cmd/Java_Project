public class main {
    public static void main(String[] args){

       // There are 4 main data types in Java
         // Int – integer number, same as in Python.
         // Double – Decimal number, same as Python's Float data type.
         // char – A character, e.g.  #$%
         // boolean – true/false state.

        int age = 42; //always end with semi-column ;
        double gpa = 42.5;
        char symbol = '&'; //in single brackets
        boolean isOnline = true;

//        System.out.println(age);
//        System.out.println(gpa);
//        System.out.println(symbol);
//        System.out.println(isOnline);

        if (isOnline) {
            System.out.println("User is online!");
        }
        else{
            System.out.println("User is offline");
        }
    }
}