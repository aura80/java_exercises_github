package java_exercises_github.sortingAlgorithms;

import java.util.Random;

public class BubbleSort {
    public static void main(String[] args) {
        Random random = new Random();
        Integer[] toBeSorted = new Integer[15];

        for (int i = 0; i < toBeSorted.length; i++) {
            toBeSorted[i] = random.nextInt(100);
        }

        System.out.print("Unsorted: ");
        printingArray(toBeSorted);

        System.out.println();

        bobbleSort(toBeSorted);

        System.out.print("Sorted:   ");
        printingArray(toBeSorted);

    }

    private static void bobbleSort(Integer[] toBeSorted) {
        Boolean bool = true;

        while (bool) {
            bool = false;
            for (int i = 0; i < toBeSorted.length - 1; i++) {
                if (toBeSorted[i] > toBeSorted[i + 1]) {
                    Integer temp = toBeSorted[i];
                    toBeSorted[i] = toBeSorted[i + 1];
                    toBeSorted[i + 1] = temp;
                    bool = true;
                }
            }
        }
    }

    public static void printingArray(Integer[] element) {
        for (int i = 0; i < element.length; i++) {
            System.out.printf("%d ", element[i]);
        }
    }
}
