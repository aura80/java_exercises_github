package java_exercises_github.anonymousClasses;

public class AnonymousWithGenericsMain {
    public static void main(String[] args) {
        AnonymousWithGenerics obj = new AnonymousWithGenerics();
        obj.setNameSurname("Marina", "Popescu", new AnonymousWithGenericsInterface<String, String>() {
            @Override
            public boolean check(String arg1, String arg2) {
                return arg1 != null && !arg1.isEmpty() && Character.isUpperCase(arg1.charAt(0))
                        && arg2 != null && !arg2.isEmpty() && Character.isUpperCase(arg2.charAt(0));
            }
        });

        obj.setAgeHeight(23, 1.73, new AnonymousWithGenericsInterface<Integer, Double>() {
            @Override
            public boolean check(Integer arg1, Double arg2) {
                return arg1 != null && arg1.compareTo(0) >= 0 && arg1.compareTo(120) <= 0;
            }
        });

        System.out.println(obj);

        AnonymousWithGenerics obj1 = new AnonymousWithGenerics();
        obj1.setNameSurname("Valentina", "Ion", new AnonymousWithGenericsInterface<String, String>() {
            @Override
            public boolean check(String arg1, String arg2) {
                return arg1 != null && !arg1.isEmpty() && Character.isUpperCase(arg1.charAt(0))
                        && arg2 != null && arg2.length() > 5 && Character.isUpperCase(arg2.charAt(0));
            }
        });

        obj1.setAgeHeight(33, 1.65, new AnonymousWithGenericsInterface<Integer, Double>() {
            @Override
            public boolean check(Integer arg1, Double arg2) {
                return arg1 != null && arg1.compareTo(0) >= 0 && arg1.compareTo(120) <= 0
                        && arg2 != null && arg2.compareTo(1.70) >= 0;
            }
        });

        System.out.println(obj1);        
        
        AnonymousWithGenerics obj2 = new AnonymousWithGenerics();
        obj2.setNameSurname("Valentina", "Merisoreanu", new AnonymousWithGenericsInterface<String, String>() {
            @Override
            public boolean check(String arg1, String arg2) {
                return arg1 != null && !arg1.isEmpty() && Character.isUpperCase(arg1.charAt(0))
                        && arg2 != null && arg2.length() > 5 && Character.isUpperCase(arg2.charAt(0));
            }
        });

        obj2.setAgeHeight(132, 1.77, new AnonymousWithGenericsInterface<Integer, Double>() {
            @Override
            public boolean check(Integer arg1, Double arg2) {
                return arg1 != null && arg1.compareTo(0) >= 0 && arg1.compareTo(120) <= 0
                        && arg2 != null && arg2.compareTo(1.70) >= 0;
            }
        });

        System.out.println(obj2);        
        
        AnonymousWithGenerics obj3 = new AnonymousWithGenerics();
        obj3.setNameSurname("Elena", "Loboda", new AnonymousWithGenericsInterface<String, String>() {
            @Override
            public boolean check(String arg1, String arg2) {
                return arg1 != null && !arg1.isEmpty() && Character.isUpperCase(arg1.charAt(0))
                        && arg2 != null && arg2.length() > 5 && Character.isUpperCase(arg2.charAt(0));
            }
        });

        obj3.setAgeHeight(38, 1.76, new AnonymousWithGenericsInterface<Integer, Double>() {
            @Override
            public boolean check(Integer arg1, Double arg2) {
                return arg1 != null && arg1.compareTo(0) >= 0 && arg1.compareTo(120) <= 0
                        && arg2 != null && arg2.compareTo(1.70) >= 0;
            }
        });

        System.out.println(obj3);
    }
}
