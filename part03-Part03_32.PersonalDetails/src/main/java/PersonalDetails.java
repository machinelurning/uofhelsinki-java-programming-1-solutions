
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int longestLength = 0;
        int sum = 0;
        int counter = 0;
        String longestName = "";

        while (true) {
            String nameAndAge = scanner.nextLine();

            if (nameAndAge.equals("")) {
                break;
            }

            String[] split = nameAndAge.split(",");

            int currentLength = split[0].length();

            if (currentLength > longestLength) {
                longestLength = currentLength;
                longestName = split[0];
            }

            sum = sum + Integer.valueOf(split[1]);
            counter++;

        }

        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + (sum * 1.0 / counter));

    }
}
