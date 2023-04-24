package java_exercises_github.localClasses;

import java.util.Map;
import java.util.TreeMap;

public class LocalClassesMaps {
    public static void main(String[] args) {
        Map<String, Integer> map = new TreeMap<>();

        class Sportivi {
            private String name;
            private int age;

            public Sportivi(String name, int age) {
                this.name = name;
                this.age = age;
            }

            public String getName() {
                return name;
            }

            public int getAge() {
                return age;
            }

            @Override
            public String toString() {
                return "Sportivi{" +
                        "name='" + name + '\'' +
                        ", age=" + age +
                        '}';
            }
        }

        System.out.println();

        Sportivi sportiv1= new Sportivi("Elisabeta", 22);
        map.put(sportiv1.getName(), sportiv1.getAge());
        Sportivi sportiv2= new Sportivi("Ioana", 14);
        map.put(sportiv2.getName(), sportiv2.getAge());
        Sportivi sportiv3= new Sportivi("George", 28);
        map.put(sportiv3.getName(), sportiv3.getAge());
        Sportivi sportiv4= new Sportivi("Anisoara", 35);
        map.put(sportiv4.getName(), sportiv4.getAge());
        System.out.println(map);

        System.out.println();

        System.out.println(sportiv1);
        System.out.println(sportiv2);
        System.out.println(sportiv3);
        System.out.println(sportiv4);
    }
}
