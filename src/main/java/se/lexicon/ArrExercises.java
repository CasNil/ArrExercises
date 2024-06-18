package se.lexicon;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class ArrExercises {
    public static void main(String[] args) {
        ex8();
    }

    public static void ex1() {
        int[] numbers = {11, 39, 23};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }

    public static void indexOf() {
        int[] numbers = {5, 6, 8, 9, 3, 1};
        Arrays.sort(numbers);
        int index = Arrays.binarySearch(numbers, 11); // 1, 3, 5, 6, 8, 9
        if (index >= 0) {
            System.out.print("index = " + index);
        } else System.out.println("index = " + -1);
    }

    public static void ex3() {
        String[] capitals = {"Paris", "London", "New York", "Stockholm"};
        System.out.println(Arrays.toString(capitals));

        Arrays.sort(capitals);
        System.out.println(Arrays.toString(capitals));

    }

    public static void ex4() {
        int[] numbers = {1, 15, 20};

        int[] copyOfNumbersArray = Arrays.copyOf(numbers, numbers.length);

        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(copyOfNumbersArray));
    }

    public static void ex5() {
        String[][] board = new String[2][2];

        board[0][0] = "Denmark";
        board[0][1] = "Copenhagen";

        board[1][0] = "Norway";
        board[1][1] = "Oslo";

        for (int i = 0; i < board.length; i++) {

            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + "\t");
            }
        }
    }

    public static void ex6() {
        int[] numbers = {43, 5, 23, 17, 2, 14};
        double sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        double average = (sum / numbers.length);
        System.out.printf("%.1f", average);
    }

    public static void ex7() {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int number : numbers) {
            if (number % 2 != 0) {
                System.out.print(number + ", ");
            }
        }
    }

    public static void ex8() {
        Integer[] numbers = new Integer[]{20, 20, 40, 20, 30, 40, 50, 60};
        System.out.println("Array: " + Arrays.toString(numbers));

        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>(Arrays.asList(numbers));

        Integer[] numbersWithoutDuplicates = linkedHashSet.toArray(new Integer[0]);

        System.out.println(Arrays.toString(numbersWithoutDuplicates));
    }

    public static void ex9() {

    }
}


