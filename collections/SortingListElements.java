package java_exercises_github.collections;

import java.util.*;

import static java.lang.Integer.compare;

public class SortingListElements {
    public static void main(String[] args) {
        Integer e = 35;
        System.out.println(e.compareTo(2));
        System.out.println(e.compareTo(38));
        System.out.println(compare(e,40));
        System.out.println(compare(e,5));

        List<Integer> firstList = new ArrayList<>();
        firstList.add(23);
        firstList.add(5);
        firstList.add(11);
        firstList.add(8);
        firstList.add(24);
        System.out.println("Unsorted list:               " + firstList);
        Collections.sort(firstList);
        System.out.println("Sorted ascending list:       " + firstList);
        Collections.sort(firstList, Collections.reverseOrder());
        System.out.println("Sorted descending list:      " + firstList);

        List<String> secondList = Arrays.asList("Mirabela", "Corina", "Liliana", "Dorina", "Niculina", "Anisoara");

        System.out.println("Unsorted list:               " + secondList);

        Collections.sort(secondList);
        System.out.println("Sorted ascending list:       " + secondList);

        Collections.sort(secondList, Collections.reverseOrder());
        System.out.println("Sorted descending list:      " + secondList);

        Collections.reverse(secondList);
        System.out.println("Sorted reversed list:        " + secondList);

        System.out.println();

        List<Double> thirdList = List.of(42.5, 23.4d, 82.6D, 15.23, 9.41d, 3.14d, 99.9D);

        System.out.println("Unsorted List.of():          " + thirdList);

        List<Double> fourthList = new LinkedList<>();

        // adding elements on top of the list
        fourthList.add(0, 29.5);
        fourthList.add(0, 18.22d);
        fourthList.add(0, 0.25D);
        fourthList.add(0, 7.87);
        fourthList.add(0, 37.56);
        System.out.println("Unsorted list:               " + fourthList + "                                   Adding elements on top of the list");

        Collections.sort(fourthList);
        System.out.println("Sorted ascending list:       " + fourthList);
        Collections.reverse(fourthList);
        System.out.println("Sorted descending list:      " + fourthList);

        fourthList.clear();

        fourthList.addAll(thirdList);
        System.out.println("Unsorted copied List.of():   " + fourthList);
        Collections.sort(fourthList);
        System.out.println("Sorted ascending List.of():  " + fourthList);
        Collections.reverse(fourthList);
        System.out.println("Sorted descending List.of(): " + fourthList);

        System.out.println();

        fourthList.clear();

        // adding elements at the end of the list
        fourthList.add(10.54d);
        fourthList.add(0.28d);
        fourthList.add(23.45);
        fourthList.add(1.57d);
        fourthList.add(15.56);
        fourthList.add(100.37d);
        System.out.println("Unsorted list:               " + fourthList + "                          Adding elements at the end of the list");
        fourthList.add(0,1000.0);
        fourthList.add(0, 10001.0);
        System.out.println("Unsorted list:               " + fourthList + "         Adding elements on top and at the end of the list");
        Collections.sort(fourthList);
        System.out.println("Sorted ascending list:       " + fourthList);

        System.out.println();

        List<String> fifthList = Arrays.asList("bread", "milk", "water", "sugar", "meat", "fish", "salad", "onion", "garlic");
        Collections.sort(fifthList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (int) o1.charAt(0) - (int) o2.charAt(0);
            }
        });

        System.out.println("Sorted ascending list:       " + fifthList);

        Collections.sort(fifthList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (int) o2.charAt(0) - (int) o1.charAt(0);
            }
        });

        System.out.println("Sorted descending list:      " + fifthList);

        Collections.sort(fifthList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo("k") - o2.compareTo("k");
            }
        });

        System.out.println("Sorted ascending list:       " + fifthList);

    }
}
