
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String string = scanner.nextLine();

            if (string.equals("")) {
                break;
            }

            String[] split = string.split(" ");
            System.out.println(split[split.length - 1]);
        }

    }
}
