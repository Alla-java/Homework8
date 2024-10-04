import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        /* Задание 1. */

        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;


        double[] pig = {1.57, 7.654, 9.98690};

        boolean[] bear = {true, false, true, false};


        /* Задание 2. */

        for (int y = 0; y < numbers.length; y++) {
            if (y == numbers.length - 1) {
                System.out.println(numbers[y]);
                break;
            }
            System.out.print(numbers[y] + ", ");
        }

        for (int y = 0; y < pig.length; y++) {
            if (y == pig.length - 1) {
                System.out.println(pig[y]);
                break;
            }
            System.out.print(pig[y] + ", ");
        }

        for (int y = 0; y < bear.length; y++) {
            if (y == bear.length - 1) {
                System.out.println(bear[y]);
                break;
            }
            System.out.print(bear[y] + ", ");
        }


        /* Задание 3. */

        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();


        for (int i = pig.length - 1; i >= 0; i--) {
            System.out.print(pig[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = bear.length - 1; i >= 0; i--) {
            System.out.print(bear[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();


        /* Задание 4. */

        for (int y = 0; y < numbers.length; y++) {
            if (numbers[y] % 2 == 1) {
                numbers[y] = numbers[y] + 1;
            }
            if (y == numbers.length - 1) {
                System.out.println(numbers[y]);
                break;
            }
            System.out.print(numbers[y] + ", ");
        }
    }
}