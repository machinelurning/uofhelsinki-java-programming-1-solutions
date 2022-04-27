
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String string = scanner.nextLine();

            if (string.equals("")) {
                break;
            }

            String[] split = string.split(" ");

            for (String i : split) {
                if (i.contains("av")) {
                    System.out.println(i);
                }
            }
        }

    }
}
