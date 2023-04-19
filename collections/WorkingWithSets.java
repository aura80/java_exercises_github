package java_exercises_github.collections;

import java.util.*;

public class WorkingWithSets {
    public static void main(String[] args) {
        Set<Integer> setOne = new HashSet<>();
        setOne.add(1);
        setOne.add(55);
        setOne.add(28);
        setOne.add(3);
        setOne.add(1);
        setOne.add(28);
        setOne.add(1);
        setOne.add(18);
        System.out.println("HashSet elements:               " + setOne);

        List<Integer> listOfSetElements = new ArrayList<>(setOne);

        Collections.reverse(listOfSetElements);
        System.out.println("Reversed list of set elements:  " + listOfSetElements);

        Set<Integer> setTwo = new TreeSet<>(setOne);
        System.out.println("TreeSet elements:               " + setTwo);

        Set<Integer> setThree = new LinkedHashSet<>(setOne);
        System.out.println("LinkedHashSet elements:         " + setThree);

        System.out.println();

        Set<String> setFour = new TreeSet<>();
        System.out.println("Set empty:  " + setFour.isEmpty());
        setFour.add("embroidery");
        setFour.add("glass");
        setFour.add("blanket");
        setFour.add("table");
        setFour.add("glass");
        setFour.add("blanket");
        setFour.add("carpet");
        setFour.add("pillow");
        System.out.println(setFour);
        System.out.println("Set empty:  " + setFour.isEmpty());
        System.out.println("Set contains \'glass\':  " + setFour.contains("glass"));

        System.out.println();

        Set<String> setFive = new LinkedHashSet<>(setFour);
        System.out.println(setFive);
        setFive.add("coffee table");
        setFive.add("armchair");
        setFive.add("curtains");
        setFive.add("picture");
        System.out.println(setFive);
        System.out.println("We bought " + setFive.size() + " articles in the house");

        System.out.println();

        Set<String> setSix = new TreeSet<>(setFive);
        setSix.add("wardrobe");
        setSix.add("lamp");
        setSix.add("lamp");
        setSix.add("decorations");
        setSix.add("frill");
        setSix.add("frill");
        System.out.println(setSix);
        System.out.println("We have " + setSix.size() + " articles bought now");
    }
}
