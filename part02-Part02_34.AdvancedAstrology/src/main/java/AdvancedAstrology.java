
public class AdvancedAstrology {

    public static void printStars(int number) {
        // first part of the exercise
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }

    public static void printSpaces(int number) {
        // first part of the exercise
        for (int i = 0; i < number; i++) {
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        for (int i = 0; i < size; i++) {
            printSpaces(size - i - 1);
            printStars(i + 1);
        }
    }

    public static void christmasTree(int size) {
        // part 2 of the exercise
        for (int i = 0; i < size; i++) {
            // top of the tree
            printSpaces(size - i - 1);
            printStars(2 * i + 1);
        }

        for (int s = 0; s < 2; s++) {
            printSpaces(size - 2);
            printStars(3);
        }
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
