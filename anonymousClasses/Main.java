package java_exercises_github.anonymousClasses;

import static java_exercises_github.anonymousClasses.AbstractClassAnonymous.VAR_ABSTRACT;

public class Main {
    public static void main(String[] args) {
        AbstractClassAnonymous abstractClass = new AbstractClassAnonymous("Abstract class argument") {
            @Override
            String abstractMethod() {
                return getMessage() + "  +  " + InterfaceAnonymous.CONST + "  =  " + (VAR_ABSTRACT + InterfaceAnonymous.VAR_INTERFACE);
            }

            @Override
            Integer abstractINTMethod() {
                return 30;
            }

            @Override
            Integer abstractSumMethod() {
                return (VAR_ABSTRACT + InterfaceAnonymous.VAR_INTERFACE) + abstractINTMethod();
            }
        };

        System.out.println(abstractClass.abstractMethod());
        System.out.println(abstractClass.abstractINTMethod());
        System.out.println(abstractClass.abstractSumMethod());
        System.out.println(abstractClass.getName());

        System.out.println();

        InterfaceAnonymous interfaceAnonymous = new InterfaceAnonymous() {
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
