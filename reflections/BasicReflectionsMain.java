package java_exercises_github.reflections;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class BasicReflectionsMain {
    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException {
        System.out.println("-----------------------------------------------------------------------");
        BasicReflections basicReflections = new BasicReflections("Arici", "doctor", 3);

        // Field
        Field[] fields = basicReflections.getClass().getDeclaredFields();          //  .getClass()  +  .getDeclaredFields()

        System.out.println(basicReflections);
        System.out.println(fields.length);

        for (Field field : fields) {
            System.out.println(field.getName());            //  .getName()

            if (field.getName().equals("name")) {
                field.setAccessible(true);                  //  .setAccessible(true) - to make the private fields accessible
                field.set(basicReflections, "Pogonici");    //  .set(object, "new_Name")
            }

            if (field.getName().equals("ocupation")) {
                field.setAccessible(true);                  //  .setAccessible(true) - to make the private fields accessible
                field.set(basicReflections, "profesor");    //  .set(object, "new_Name")
            }
        }

        System.out.println("-----------------------------------------------------------------------");
        System.out.println();

        System.out.println("Private name changed with Reflections:                          " + basicReflections.getName());
        basicReflections.setAge(5);
        System.out.println("Private age changed with setAge() method defined in the class:  " + basicReflections.getAge());
        System.out.println("Private occupation changed with Reflections:                    " + basicReflections.getOcupation());
        System.out.println();

        // Constructor
        Constructor[] constructors = basicReflections.getClass().getDeclaredConstructors();     //  .getDeclaredConstructors()

        for (Constructor constructor : constructors) {
            System.out.println(constructor.getName());
        }

        System.out.println("-----------------------------------------------------------------------");
        System.out.println();

        // Method
        Method[] methods = basicReflections.getClass().getDeclaredMethods();

        int s = 0;
        for (Method method : methods) {
            s += 1;
            System.out.println("Method " + s + ": " + method);

            if (method.getName().equals("publicMethod")) {
                System.out.println();
                method.invoke(basicReflections);    // one method invokes the object
                basicReflections.publicMethod();    // method called in the normal way, using an object of the type of the class
                System.out.println();
            }

            if (method.getName().equals("privateMethod")) {
                System.out.println();
                method.setAccessible(true);         //  .setAccessible(true) - to make the private method accessible
                method.invoke(basicReflections);    // one method invokes the object
                System.out.println();
            }

            if (method.getName().equals("publicStaticMethod")) {
                System.out.println();
                method.setAccessible(true);         //  .setAccessible(true) - to make the private method accessible
                method.invoke(null);            // one method from the array of the declared methods invokes null
                System.out.println();
            }

            if (method.getName().equals("privateStaticMethod")) {
                System.out.println();
                method.setAccessible(true);         //  .setAccessible(true) - to make the private method accessible
                method.invoke(null);            // one method from the array of the declared methods invokes null
                System.out.println();
            }
        }

        System.out.println("-----------------------------------------------------------------------");
        System.out.println();
    }
}
