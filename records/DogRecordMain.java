package java_exercises_github.records;

public class DogRecordMain {
    public static void main(String[] args) {
        DogRecordClass dog1 = new DogRecordClass("Max", 5, true);
        System.out.println(dog1);
        System.out.println(dog1.name());
        System.out.println(dog1.age());
        System.out.println(dog1.pedigree());
        System.out.println(dog1.hashCode());
        System.out.println(dog1.equals(new DogRecordClass("Minnie", 3, false)));
        System.out.println(dog1.equals(new DogRecordClass("Max", 5, true)));

        DogRecordClass dog2 = new DogRecordClass("Max", 5, true);
        System.out.println(dog1.equals(dog2));
        System.out.println(dog1.hashCode());
        System.out.println(dog2.hashCode());
        System.out.println(dog1.compare(dog1, dog2));

        System.out.println();

        DogRecordClass dog3 = new DogRecordClass("Jimmy", 2);
        System.out.println(dog3);
        System.out.println(dog3.name());
        System.out.println(dog3.age());
        System.out.println(dog3.pedigree());
        System.out.println(dog3.hashCode());
        System.out.println(dog1.compare(dog1, dog3));
        System.out.println(dog1.compare(dog2, dog3));

        System.out.println();

        DogRecordClass dog4 = new DogRecordClass("Luna");
        System.out.println(dog4);
        System.out.println(dog4.name());
        System.out.println(dog4.age());
        System.out.println(dog4.pedigree());
        System.out.println(dog4.hashCode());
        System.out.println(dog1.compare(dog1, dog4));
        System.out.println(dog1.compare(dog3, dog4));
    }
}
