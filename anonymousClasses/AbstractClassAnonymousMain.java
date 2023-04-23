package java_exercises_github.anonymousClasses;

import static java_exercises_github.anonymousClasses.AbstractClassAnonymous.VAR_ABSTRACT;

public class AbstractClassAnonymousMain {
    public static void main(String[] args) {
        AbstractClassAnonymous abstractClass = new AbstractClassAnonymous("Abstract class argument") {
            @Override
            String abstractMethod() {
                return getMessage() + "  +  " + AbstractClassAnonymousInterface.CONST + "  =  " + (VAR_ABSTRACT + AbstractClassAnonymousInterface.VAR_INTERFACE);
            }

            @Override
            Integer abstractINTMethod() {
                return 30;
            }

            @Override
            Integer abstractSumMethod() {
                return (VAR_ABSTRACT + AbstractClassAnonymousInterface.VAR_INTERFACE) + abstractINTMethod();
            }
        };

        System.out.println(abstractClass.abstractMethod());
        System.out.println(abstractClass.abstractINTMethod());
        System.out.println(abstractClass.abstractSumMethod());
        System.out.println(abstractClass.getName());

        System.out.println();

        AbstractClassAnonymousInterface interfaceAnonymous = new AbstractClassAnonymousInterface() {
            @Override
            public String abstractMethodInterface() {
                return CONST + "  + " + abstractClass.getMessage() + " = " + abstractMethodInterface2();
            }

            @Override
            public Integer abstractMethodInterface2() {
                return VAR_INTERFACE + VAR_ABSTRACT;
            }
        };

        System.out.println(interfaceAnonymous.abstractMethodInterface());
        System.out.print("" + interfaceAnonymous.abstractMethodInterface2() + " + " + abstractClass.getINTMessage() + " = ");
        System.out.println(interfaceAnonymous.abstractMethodInterface2() + abstractClass.getINTMessage());
    }
}
