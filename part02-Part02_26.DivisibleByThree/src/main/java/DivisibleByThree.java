
import java.util.Scanner;

public class DivisibleByThree {

    public static void main(String[] args) {
        divisibleByThreeInRange(0, 21);
    }

    public static void divisibleByThreeInRange(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            } else {
                continue;
            }
        }
    }

}
