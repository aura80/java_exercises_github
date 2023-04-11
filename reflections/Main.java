package java_exercises_github.reflections;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        Astronomer astronomer = new Astronomer();
        Class<?> astroReflectClass = astronomer.getClass();

        System.out.println("PRINT CLASS METHODS AND RETURN TYPE");
        Method[] methods = astroReflectClass.getDeclaredMethods();

        for (Method m : methods) {
            System.out.println("    " + m);
        }

        System.out.println("PRINT CLASS FIELDS");
        Field[] fields = astroReflectClass.getDeclaredFields();

        for (Field f : fields) {
            System.out.println("    " + f);
        }

        System.out.println("PRINT CLASS CONSTRUCTORS");
        Constructor[] constructors = astroReflectClass.getDeclaredConstructors();

        for (Constructor c : constructors) {
            System.out.println("    " + c);
        }

        System.out.println();

        Constructor constrWithoutParam = constructors[0];

        Astronomer mike = null;
        try{

            mike = (Astronomer) constrWithoutParam.newInstance();
            System.out.println(mike);

        } catch (InvocationTargetException e) {
            System.out.println(e.getMessage());
        } catch (InstantiationException e) {
            System.out.println(e.getMessage());
        } catch (IllegalAccessException e) {
            System.out.println(e.getMessage());
        }

        assert mike != null;
        mike.setName("Michael");
        mike.setYears(43);
        mike.setYearsInSpace(3.5f);
        mike.setInSpace(true);
        System.out.println("The astronomer " + mike.getName() + ", " + mike.getYears() + " years old, has now "
                + mike.getYearsInSpace() + " years in space and he" + mike.getInSpace());

        mike.setYears(44);
        mike.setYearsInSpace(3.6f);
        mike.setInSpace(false);
        System.out.println("The astronomer " + mike.getName() + ", " + mike.getYears() + " years old, has now "
                + mike.getYearsInSpace() + " years in space and he" + mike.getInSpace());

        System.out.println();

        // accessing constructors one by one

        Constructor constrWithParam = constructors[1];
        constrWithParam.setAccessible(true);

        Astronomer astro = null;
        Astronomer astroFemale = null;

        try {

            astro = (Astronomer) constrWithParam.newInstance("Costel", 38, 10.8F, false);
            astroFemale = (Astronomer) constrWithParam.newInstance("Marioara", 41, 12F, false);
            System.out.println(astro);  // printing object with reflection
            System.out.println(astroFemale);

        } catch (InvocationTargetException e) {
            System.out.println(e.getMessage());
        } catch (InstantiationException e) {
            System.out.println(e.getMessage());
        } catch (IllegalAccessException e) {
            System.out.println(e.getMessage());
        }

        System.out.println();

        assert astro != null;  // equivalent to:    if (astro == null) throw new AssertionError();
        System.out.println(astro.getInfo());

        // calling a method

        try {

            // getDeclaredMethod() returns an object of type Method
            Method oneMethod = astroReflectClass.getDeclaredMethod("getInfo");  // method getInfo() given as String
            // making the method accessible
            oneMethod.setAccessible(true);
            // we call the method getInfo() using invoke / all param constructor is private
            oneMethod.invoke(astro);
            System.out.println(oneMethod.invoke(mike));
            System.out.println(oneMethod.invoke(astroFemale));

            System.out.println();
            Method oneMethod3 = astroReflectClass.getDeclaredMethod("getSalary");
            oneMethod3.setAccessible(true);
            oneMethod3.invoke(astro);
            oneMethod3.invoke(mike);
            oneMethod3.invoke(astroFemale);

            System.out.println();
            Method oneMethod2 = astroReflectClass.getDeclaredMethod("getInffo");
            oneMethod2.setAccessible(true);
            oneMethod2.invoke(astro);
            System.out.println(oneMethod2.invoke(mike));

        } catch (NoSuchMethodException e) {
            System.out.println("Method was not found");
        } catch (InvocationTargetException e) {
            System.out.println("Method can't be called");
        } catch (IllegalAccessException e) {
            System.out.println("Method is not accessible");
        }

        System.out.println();

        // accessing a field

        Field age = fields[1];
        Field yearsInSpace = fields[2];

        age.setAccessible(true);
        yearsInSpace.setAccessible(true);

        System.out.println(mike);
        System.out.println(astroFemale);

        try {
            age.set(mike, 45);
            yearsInSpace.set(mike, 4.5f);
            age.set(astroFemale, 42);
            yearsInSpace.set(astroFemale, 12.5f);
        } catch (IllegalAccessException e) {
            System.out.println("Field not accessible");
        }

        System.out.println(mike);
        System.out.println(astroFemale);
    }
}
