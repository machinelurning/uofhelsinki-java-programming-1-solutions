
import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println();

        int sum = 0;
        int counter = 0;

        while (true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());

            if (number == 0) {
                break;
            }

            if (number < 0) {
                continue;
            }

            sum += number;
            counter += 1;
            continue;

        }

        if (counter == 0) {
            System.out.println("Cannot calculate the average");
        }

        System.out.println(sum * 1.0 / counter);
    }
}