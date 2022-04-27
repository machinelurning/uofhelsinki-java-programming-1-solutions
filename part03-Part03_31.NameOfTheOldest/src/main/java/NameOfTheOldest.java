
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String oldestName = "";
        int oldestAge = 0;

        while (true) {
            String nameAndAge = scanner.nextLine();

            if (nameAndAge.equals("")) {
                break;
            }

            String[] split = nameAndAge.split(",");
            int currentAge = Integer.valueOf(split[1]);

            if (currentAge > oldestAge) {
                oldestAge = currentAge;
                oldestName = split[0];
            }

        }

        System.out.println("Name of the oldest: " + oldestName);

    }
}
