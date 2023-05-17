package java_exercises_github.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListVsArrays {
    public static void main(String[] args) {
        String[] array = {"Roma", "Paris", "Madrid", "Praga"};
        System.out.println(array.toString());                       // it gives only the address
        System.out.println("Array: " + Arrays.toString(array));     // it gives the array

        String arr = Arrays.toString(array);
        System.out.println("String: " + arr);

        // convert array to list
        List<String> cities = new ArrayList<>(Arrays.asList(array));
        List<String> citiesList = new ArrayList<>(List.of(array));
        List<String> citiesList2 = List.of(array);

        System.out.println("List1: " + cities);
        System.out.println("List2: " + citiesList);
        System.out.println("List3: " + citiesList2);

        System.out.println();

        ArrayList<String> names = new ArrayList<>();

        // add elements to the list
        names.add("John");
        names.add("Betty");
        names.add("Michel");
        System.out.println("ArrayList: " + names);

        // create a new array of String type
        String[] arrs = new String[names.size()];
        System.out.println(Arrays.toString(arrs));

        // convert the List into the array of String above
        names.toArray(arrs);

        System.out.print("Array1: ");

        for(String item : arrs) {
            System.out.print(item+", ");
        }

        System.out.println();
        System.out.print("Array2: ");

        for(String item : names) {
            System.out.print(item+", ");
        }

        System.out.println();
        System.out.print("Array3: ");

        for(Object item : names.toArray()) {
            System.out.print(item+", ");
        }

        System.out.println();
        System.out.println();
    }
}
