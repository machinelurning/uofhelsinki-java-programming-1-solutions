
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int oldest = 0;

        while (true) {
            String nameAndAge = scanner.nextLine();

            if (nameAndAge.equals("")) {
                break;
            }

            String[] split = nameAndAge.split(",");
            int currentAge = Integer.valueOf(split[1]);

            if (currentAge > oldest) {
                oldest = currentAge;
            }

        }

        System.out.println("Age of the oldest: " + oldest);

    }
}
