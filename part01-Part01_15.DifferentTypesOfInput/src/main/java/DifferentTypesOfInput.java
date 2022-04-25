
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here

        System.out.println("Give a string:");
        String string_ = scan.nextLine();

        System.out.println("Give an integer:");
        int int_ = Integer.valueOf(scan.nextLine());

        System.out.println("Give a double:");
        double double_ = Double.valueOf(scan.nextLine());

        System.out.println("Give a boolean:");
        boolean bool_ = Boolean.valueOf(scan.nextLine());

        System.out.println("You gave the string " + string_);
        System.out.println("You gave the integer " + int_);
        System.out.println("You gave the double " + double_);
        System.out.println("You gave the boolean " + bool_);

    }
}
