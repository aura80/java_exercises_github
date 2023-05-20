package java_exercises_github.functional_programming;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class TheOptional {
    public static void main(String[] args) {

        //        Optional.of(.....) - can not take a null value

        Optional<String> optional1 = Optional.of("Have a nice day!");

        System.out.println(optional1);

        Optional<Integer> optional2 = Optional.of(54);

        System.out.println(optional2);

        Optional<List<Integer>> optional3 = Optional.of(Arrays.asList(2,46,3,58,22,16));

        System.out.println(optional3);

        Optional<List<String>> optional4 = Optional.of(List.of("a", "b", "north", "away", "south"));

        System.out.println(optional4);

        System.out.println();

        //        Optional.ofNullable(.....) - can take null values
        //        the optional will be an empty box in this case

        Integer arr[] = {24,1,2,4,5};

        String optMsg1 = null;
        if ((Integer.parseInt(String.valueOf(arr[2])) % 2 == 0)) {
            optMsg1 = "The middle value is even";
        }

        Integer optMsg2 = null;

        if (arr[3] % 2 == 0) {
            optMsg2 = arr[0] + arr[4];
        }

        Integer optMsg3 = null;

        if (arr[3] % 2 != 0) {
            optMsg3 = arr[1] + arr[3];
        }

        String optMsg4 = null;

        Optional<String> possibleEmptyOptional1 = Optional.ofNullable(optMsg1);
        final Optional<Integer> possibleEmptyOptional2 = Optional.ofNullable(optMsg2);
        final Optional<Integer> possibleEmptyOptional3 = Optional.ofNullable(optMsg3);
        final Optional<String> possibleEmptyOptional4 = Optional.ofNullable(optMsg4);

        System.out.println(optMsg1);
        System.out.println(optMsg2);
        System.out.println(optMsg3);
        System.out.println(optMsg4);

        System.out.println();

        System.out.println(possibleEmptyOptional1);
        System.out.println(possibleEmptyOptional2);
        System.out.println(possibleEmptyOptional3);
        System.out.println(possibleEmptyOptional4);
    }
}
