# java_exercises_github
/*
Exceptions - events that occur during the execution of a program;
           - it breaks the normal process;
           - at runtime it is searched a way to handle the situation;
           - handling it is done in a stacktrace;
           - stacktrace is an ordered list of methods to follow to reach to the method that thrown the exception;
           - the search for a handler begins at runtime with the method that thrown the exception and ends with the method that handles it;
           - the Throwable class is the parent class for Error and Exception classes;
           - the Error class contains the low-level JVM exceptions like OutOfMemoryError and StackOverflowError; 
           - the Error class and it's subclasses are considered unchecked exceptions; 
           - * from class Exception inherit checked exceptions and RuntimeException class wich represents the unchecked exceptions;
           - * checked exceptions: FileNotFoundException, IOException, IllegalAccessException;
           - * checked exceptions must be specified in the declaration of the method near it's signature using the keyword throws;
           - * the compiler checks for the occurence of the checked exceptions in the program; 
           - * unchecked exceptions: NullPointerException, NumberFormatException, ArithmeticException, etc;
           - * unchecked exceptions do not have to be specified in the declaration of the method;
           - * the compiler does not check for the occurence of the unchecked exceptions in the program;
           - the checked exceptions can be handled by passing them up or handled inside the method; 
           - the try-catch-finally block handles both checked and unchecked exceptions;
           - inside the try block are written the lines that might throw the exceptions;
           - the catch block handles the exceptions if they occurs and inside parentheses are specified the type of the exception and it's instance;
           - there can be more than one catch block inside a try-catch block;
           - in a catch block the handling of the exceptions is done in order of the inheritance: children are specified first and parent at the end; 
           - in the catch block we also could specify all the not related exceptions separated by | on the same line, between the parentheses;
           - the finally block is always executed;
           - finally is used to close the resources after an exception occured (memory, files, database connections);  
           - try with resources it is used to replace the manually closing of the resources from the finally block;
           - a list of resources it is passed between parentheses to the try block;
           - resources are objects that implement the java.lang.AutoCloseable or from the java.io.Closeable;
           - we can also use the throw clause to throw exceptions;
           - the custom exceptions are exceptions made by the programmer;
           - the Throwable, Error, Exception and RuntimeException resides in java.lang package;


Abstract class - abstract keyword is specified between the access modifier and the abstract class name;
               - class that can't be instantiated, objects of the abstract class can't be created;
               - used to share information between related classes;
               - contains normal methods and abstract methods;
               - contains fields (interfaces don't contain normal fields but constants declared public static final);
               - to create objects of the type of abstract class, first we have to extend it;
               - a non-abstract child class extends the abstract class;
               - all the methods from the abstract class must be implemented inside the child class;
               - abstract classes can implement interfaces but don't specify their body;
               - abstract classes can extend other abstract classes but may/or not implement their abstract methods inside;
               - all the methods of an abstract class will be implemented inside the child class that extends the abstract class;
               - even the abstract methods from the interfaces implemented by the abstract classes are implemented inside the child class of the abstyract class;
               - the abstract keyword is not mentioned anymore when implementing the overriden methods in the child class;
               - default keyword it's not used for methods in abstract classes;

Abstract methods - can be declared only in abstract classes and in interfaces;
                 - can't have a body inside abstract classes;
                 - keyword abstract it is used between the access modifier and the return type;
                 - can't be declared private because it must be implemented inside the classes that extend/implement the abstract classes/interfaces; 

Inner/Nested classes - classes declared inside other classes;
                     - two types: static nested and inner non-static classes;
                     - inner non-static classes have access to all the static, non-static or private fields and methods from the outer class
                     - static-nested classes have access only to the static fields and methods from the outer class;
                     - can use access modifiers; 
                     - Outer objOuter = new Outer(); Outer.Inner objInner = objOuter.new Inner();
                     - Outer.StaticNested objStaticNested = new Outer.StaticNested();
                     - local classes and anonymous classes;

Local classes - classes declared inside a block of code like a method, an if or a for loop;
              - can't be an interface;
              - a local class has access to the fields of the method that contains the local class;
              - without an access modifier;
              - does not have static fields or methods;
              - can have static constants - static final;

Anonymous classes - classes without name which can be used only once;
                  - declared after the constructor call, between { } ;  
                  - may contain constants and static/non-static fields and methods;
                  - it can't have constructors, interfaces and static initialization blocks (like try ... catch, ststic {...});
                  - can access only final (constants) fields of outer classes or final local variables of the methods;

Interfaces - it is a reference type;
           - it is specified by using the interface keyword between the access modifier and the name of the interface, in the interface definition;
           - used to share information between unrelated classes;
           - it contains: constants, methods declarations, default methods, static methods, definitions of nested types;
           - it does not have a constructor; 
           - it can not be instantiated; 
           - methods can be abstract, default, private with implementation and static only;
           - static, default and private methods should have implementation inside the interface; 
           - *** non static methods without body are public abstract by default;
           - *** static methods are public by default;
           - *** constants are public static final by default;
           - abstract keyword before a method it means that the method should not have a body;  
           - *** default methods are used to modify the existing interface and make it compatible with older versions;  
           - the default keyword is needed before the default method which contains implementation; 
           - the static keyword is needed before the static method which contains implementation; 
           - default methods can be overriden inside the interface or not; 
           - *** static methods must have implementation, can be invoked directly from the interface and define utility functionalities common for all classes implementing the interface; 
           - an interface could be empty - marker or tagged interfaces;
           - Serializable, Clonable, Remote are marker interfaces and are empty;
           - functional interfaces are single abstract methods (SAM) interfaces;
           - methods need to be implemented in classes that extend the interface;
           - can be implemented by other class, using implements keyword after the class name;
           - multiple inheritance - a class can implement more than one interface at the same time, on the same line, using comma ',' betweend the parent interfaces;
           - can be extended by other interfaces by using the extends keyword after the name of the child interface;
           - an interface can extend more than one interface by using ',' betweend the parent interfaces;
           - a class can extend another class and implement more than one interface at the same time, on the same line, using comma ',' betweend the parent interfaces;

Enums      - are special types of objects;
           - objects/instances of enum type have a fix number, defined inside the enum;
           - the enum keyword it is used in the enum definition, before it's name;
           - extend keyword can not be used with enums;
           - enums can implement interfaces;
           - enums can have values, fields, multiple private constructors and methods;
           - the values in the enum must be declared at the beginning;
           - values of the enum are written with capital letters at the beginning of the enum and are separated by a comma ',';
           - if we declare other elements but the values, then we must insert a semicolon ';' following the list of values written with capital letters; 
           - private keyword before constructors name can be specified or not;
           - the fields/input parameters from the constructors must be specified in each enum value;
           - we can only access the enum's values by using the enum's name and a dot '.' followed by the value written with the capital letter; 
           - all the enum's elements are accessed by using the dot notation '.' (instance of enum dot enum's method);
           - we can't create new objects from an enum by using the new keyword;
           - enum's instances are created only once at the beginning of the application;
           - enum's instances are comparable with equals and '==';
           - enums may call two predefined static methods which are: values() and valueOf("..."); 
           - Enum_Name.values() ---> returns all the enum values as an array;
           - Enum_Name.valueOf("ORANGE") ---> returns the enum's instance specified by the string "ORANGE";

Generics   - templates which allow the parametrization of the classes, methods and interfaces;
           - it allows the reuse of the same code;
           - name of the generic types defined in brackets <, > ;
           - used to avoid mistakenly passing different types of objects to the same object (see Object class use);
           - the generic parameter is specified with a single uppercase letter;
           - the specific type for the generic parameter is passed when creating an instance of the class or using static methods of the class;
           - multiple generics can be declared inside a class;
           - generic classes can be extended;
           - methods allow the use of generic types, both static and non-static, with limited visibility inside the class;
           - parametric types are placed before the return type in methods;
           - we can use bounded types parameters to limit the use of some values: <parametric_type extends type> ;
           - parametric types are different from generic classes: Integer is a subtype of Number, but A_Class<Integer> is not a subtype of A_Class<Number> ;
           - ? represents the unknown type and it is called a wildcard;
           - upper bound limit - upper-bounded wildcard: ? extends, ex. List<? extends Number> ;
           - lower bound limit - lower-bounded wildcard: ? super, ex. List<? super Integer> ; 

Reflection - process by which a computer program can be modified at runtime;
           - it does not allow the validation at compilation;
           - specific to high-level languages;
           - using the objects available in the java.lang.reflect package.
*/