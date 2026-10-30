import java.util.Scanner;

public class NumberPatternGenerator {

    public static void main(String[] args) {
        generatePattern();
    }

    public static void generatePattern() {
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int row = reader.nextInt();

        System.out.println("Choose the pattern type:");
        System.out.println("1 - Right Triangle");
        System.out.println("2 - Inverted Right Triangle");
        System.out.println("3 - Pyramid");
        System.out.println("4 - Inverted Pyramid");
        System.out.println("5 - Square Pattern");
        System.out.print("Your choice: ");
        int pattern = reader.nextInt();

        System.out.println();
        System.out.println("Size: " + row);

        switch (pattern) {
            case 1:
                System.out.println("Pattern: Right Triangle");
                printRightTriangle(row);
                break;
            case 2:
                System.out.println("Pattern: Inverted Right Triangle");
                printInvertedRightTriangle(row);
                break;
            case 3:
                System.out.println("Pattern: Pyramid");
                printPyramid(row);
                break;
            case 4:
                System.out.println("Pattern: Inverted Pyramid");
                printInvertedPyramid(row);
                break;
            case 5:
                System.out.println("Pattern: Square Pattern");
                printSquare(row);
                break;
            default:
                System.out.println("Invalid pattern choice.");
        }

        reader.close();
    }

    public static void printRightTriangle(int row) {
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void printInvertedRightTriangle(int row) {
        for (int i = row; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void printPyramid(int row) {
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void printInvertedPyramid(int row) {
        for (int i = row; i >= 1; i--) {
            for (int j = 1; j <= row - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void printSquare(int row) {
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}