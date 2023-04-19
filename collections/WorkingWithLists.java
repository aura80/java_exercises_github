package java_exercises_github.collections.equals_hashcode;

import java.util.*;

public class WorkingWithLists {
    public static void main(String[] args) {
        List<String> productsList = Arrays.asList("brocoli", "onion", "wine", "bread", "garlic", "ham", "meat", "water", "juice");
        Collections.sort(productsList);
        System.out.println(productsList);
        showList(productsList);

        System.out.println();

        showList(Arrays.asList("pencil", "book", "notebook", "bag"));

        System.out.println();

        List<String> newList = new ArrayList<>();
        newList.add("paper");
        newList.add("dress");
        newList.add("perfume");
        newList.add("balsam");
        newList.add("shampoo");
        System.out.println(newList);

        newList.remove("paper");
        System.out.println(newList);

        newList.remove(newList.indexOf("shampoo"));
        System.out.println(newList);

        Collections.sort(newList);
        System.out.println(newList);

        System.out.println();

        newList.clear();

        newList.add("radio");
        newList.add("tv");
        newList.add("stove");
        newList.add("clock");
        newList.add("fridge");
        System.out.println(newList);
        System.out.println();
        System.out.println(Collections.min(newList) + "   -   is the minimum from the list in alphabetical order");
        System.out.println(Collections.max(newList) + "   -   is the maximum from the list in alphabetical order");
        System.out.println();
        Collections.sort(newList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (int) o1.charAt(0) - (int) o2.charAt(0);
            }
        });
        System.out.println(newList);
        System.out.println();
        System.out.println(Collections.min(newList) + "   -   is the minimum from the list in alphabetical order");
        System.out.println(Collections.max(newList) + "   -   is the maximum from the list in alphabetical order");

        System.out.println();

        List<String> emptyImmutableList = Collections.emptyList();
        List<Integer> oneElemImmutableList = Collections.singletonList(200);
        System.out.println(emptyImmutableList + " " + oneElemImmutableList);

        List<Integer> immutableList = List.of(5, 7, 8, 10, 2, 3);
        System.out.println(immutableList);
        System.out.println();
        List<String> immutableList2 = List.of("m", "a", "b", "h", "g", "g", "g", "d", "n", "p", "z");
        System.out.println(immutableList2);
        showList(immutableList2);
        System.out.println(immutableList2);

        // a way to sort an immutable list is to copy it in another list with addAll()
        List<String> l = new ArrayList<>();
        l.addAll(immutableList2);
        Collections.sort(l);
        System.out.println(l);

        Collections.replaceAll(l, "g", "i");
        System.out.println(l);
        l.remove(4);
        System.out.println(l);
        Collections.reverse(l);
        System.out.println(l);
        l.remove("i");
        System.out.println(l);
        l.add("i");
        System.out.println(l);
        System.out.println(l.size());
        l.remove(9);
        System.out.println(l);
    }

    public static void showList(List<String> lista) {
        List<String> element = new ArrayList<>();
        int sum1 = 0, sum2 = 0;
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.indexOf(lista.get(i))+1 + " " + lista.get(i));
            sum1 += 1;
            if (lista.get(i).charAt(0) > 'm') {
                element.add(String.valueOf(lista.get(i)));
                sum2 += 1;
            }
        }
        System.out.println("From a total of " + sum1 + " products the following " + sum2 + " will be paid separately: " + element);
    }
}
