package java_exercises_github.customAnnotations;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UsingAnnotations {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {   // it throws exceptions because we have private annotated method 'message()' which is invoked from StoreOne class

        @SuppressWarnings("unused")
        UsingAnnotations usingAnnotations = new UsingAnnotations();
        @SuppressWarnings("unused") StoreOne store = new StoreOne("apples", 2.8);

        StoreOne storeOne = new StoreOne("cherries", 9.5);
        StoreTwo storeTwo = new StoreTwo("bananas", 4.99D);

        List<Object> objectsList = new ArrayList<>(Arrays.asList(storeOne,storeTwo));

        for (Object obj : objectsList) {
            // the class has the annotation on it, not the object and that's why we use the .getClass() method
            if (obj.getClass().isAnnotationPresent(UrgentAnnotation.class)) {
                System.out.println(obj);
                System.out.println(obj.hashCode() + " - Urgent thing announced by the annotation on the class");

                invokeAnnotatedMethod(obj);

            } else {
                System.out.println();
                System.out.println(obj);
                System.out.println(obj.hashCode() + " - Thing not urgent, without annotation on the class");

                invokeAnnotatedMethod(obj);

            }

            invokeAnnotatedField(obj);
        }
    }

    private static void invokeAnnotatedField(Object obj) throws IllegalAccessException {
        Field[] fields = obj.getClass().getDeclaredFields();

        for (Field field : fields) {
            if (field.isAnnotationPresent(RunOnlyAnnotatedFields.class)) {
                field.setAccessible(true);
                System.out.println("+++ " + field.get(obj));

                Object fieldValueAsAnObject = field.get(obj);
                if (fieldValueAsAnObject instanceof String newStringVariable) {         // if the object is an instance of a String, we create a new String variable
                    System.out.println(newStringVariable.toUpperCase());
                }
            }
        }
    }

    private static void invokeAnnotatedMethod(Object obj) throws IllegalAccessException, InvocationTargetException {
        Method[] methods = obj.getClass().getDeclaredMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(RunItNow.class)) {
                method.setAccessible(true);
                System.out.println(method.invoke(obj));
            }

            if (method.isAnnotationPresent(RunMultipleTimes.class)) {
                RunMultipleTimes annotation = method.getAnnotation(RunMultipleTimes.class);

                for (int i = 0; i < annotation.times(); i++) {
                    System.out.println(method.invoke(obj));
                }
                System.out.println(annotation.times());
            }
        }
    }
}
