package java_exercises_github.functional_programming;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.function.Supplier;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TheOptional2 {
    private String name;
    private Integer age;

    public static void main(String[] args) {
        Optional<TheOptional2> optional1 = getNameOptional("Georgia");
        System.out.println(optional1);
        System.out.println(optional1.get());
        System.out.println(optional1.get().getName());
        System.out.println(optional1.get().getAge());

        Optional<TheOptional2> optional2 = getAgeOptional(15);
        System.out.println(optional2);
        System.out.println(optional2.get());
        System.out.println(optional2.get().getName());
        System.out.println(optional2.get().getAge());

        Optional<TheOptional2> optional3 = getNameOptional(null);
        System.out.println(optional3);
        System.out.println(optional3.get());
        System.out.println(optional3.get().getName());
        System.out.println(optional3.get().getAge());

        Optional<TheOptional2> optional4 = getAgeOptional(null);
        System.out.println(optional4);
        System.out.println(optional4.get());
        System.out.println(optional4.get().getName());
        System.out.println(optional4.get().getAge());

        System.out.println();
        System.out.println(".isPresent / .get()   ");

        Optional<TheOptional2> optional5 = getNameEmptyOptional();
        if (optional5.isPresent()) {
            System.out.println("*" + optional5);
            System.out.println("**" + optional5.get());
        } else if (optional5.isEmpty()) {
            System.out.println("*** Optional is empty");
        }

        if (optional5.isEmpty()) {
            System.out.println("*** I told you. The Optional is empty.");
        }

        System.out.println();
        System.out.println(".orElse()   ");

        TheOptional2 obj1 = optional5.orElse(new TheOptional2("Mugurel", 5));
        System.out.println(obj1);

        System.out.println();
        System.out.println(".orElseGet()   ");

        Optional<TheOptional2> obj2 = Optional.of(optional5.orElseGet(() -> {
            return Optional.of(new TheOptional2("Italy", 2023)).get();
        }));
        System.out.println(obj2);

        Optional<TheOptional2> obj3 = Optional.of(optional5).orElseGet(() -> {
            return Optional.ofNullable(Optional.of(new TheOptional2("France", 2023)).get());
        });
        System.out.println(obj3);

        Optional<TheOptional2> obj4 = Optional.of(optional5).orElseGet(() -> Optional.of(new TheOptional2("France", 2023)));
        System.out.println(obj4);

        Optional<TheOptional2> obj5 = Optional.of(optional5.orElseGet(() -> {
            TheOptional2 o = new TheOptional2("France", 2023);
            return getNameOptional(o.getName()).get();
        }));

        if (obj5.isPresent()) {
            System.out.println("*" + obj5.get());
        } else {
            System.out.println("Optional not present!");
        }

        System.out.println();
        System.out.println(".ifPresent()   ");

        obj5.ifPresent(System.out::println);

        System.out.println();
        System.out.println(".orElseThrow()  ->  it is equivalent to .get() method");

        try {
            TheOptional2 obj6 = optional5.orElseThrow();
            System.out.println(obj6);
        } catch (NoSuchElementException e) {
            System.out.println("The exception message is:  " + e.getMessage());
        }

        try {
            TheOptional2 obj7 = optional2.orElseThrow();
            System.out.println(obj7);
        } catch (NoSuchElementException e) {
            System.out.println("The exception message is:  " + e.getMessage());
        }

        System.out.println();
        System.out.println(".map()");
        System.out.println();

        System.out.println(optional2.map(TheOptional2::getName).orElse("No name"));
        System.out.println(optional3.map(TheOptional2::getName).orElse("No name"));
        System.out.println(obj2.map(TheOptional2::getName).orElse("No name"));
        System.out.println(obj5.map(TheOptional2::getName).orElse("No name"));

        System.out.println();

        System.out.println(optional2.map(TheOptional2::getAge).orElse(1000));
        System.out.println(optional5.map(TheOptional2::getAge).orElse(100));
        System.out.println(optional4.map(TheOptional2::getAge).orElse(100));
        System.out.println(optional3.map(TheOptional2::getAge).orElse(100));

    }

    public static Optional<TheOptional2> getNameOptional(String name) {
        TheOptional2 opt1 = new TheOptional2();
        opt1.setAge(23);
        TheOptional2 opt2 = new TheOptional2(name, opt1.getAge());
        return Optional.of(opt2);
    }

    public static Optional<TheOptional2> getAgeOptional(Integer age) {
        TheOptional2 opt1 = new TheOptional2();
        opt1.setName("Europe");
        TheOptional2 opt2 = new TheOptional2(opt1.getName(), age);
        return Optional.ofNullable(opt2);
    }

    public static Optional<TheOptional2> getNameEmptyOptional() {
        return Optional.ofNullable(null);       // an empty Optional -> will give NoSuchElementException
    }

}
