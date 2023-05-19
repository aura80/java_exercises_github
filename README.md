# java_exercises_github

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
           - for checked exceptions we use throws in method signature; 
           - for unchecked exceptions (RuntimeExceptions) we don't use throws in method signature; 
           - the Throwable, Error, Exception and RuntimeException resides in java.lang package;

Abstract class - abstract keyword is specified between the access modifier and the abstract class name;
               - class that can't be instantiated, objects of the abstract class can't be created;
               - used to share information between related classes;
               - contains normal methods with implementation and abstract methods without implementation;
               - contains fields (interfaces don't contain normal fields, but constants declared public static final);
               - it may have a constructor; 
               - to create objects of the type of abstract class, first we have to extend it;
               - a non-abstract child class extends the abstract class;
               - all the methods from the abstract class must be implemented inside the child class;
               - abstract classes can implement interfaces but don't have to specify all the methods;
               - not all the methods from the interface must be written in the abstract class, but if written they must have implementation;
               - abstract classes can extend other abstract classes but may/or not implement their abstract methods inside;
               - all the methods of an abstract class will be implemented inside the child class that extends the abstract class;
               - even the abstract methods from the interfaces implemented by the abstract classes are implemented inside the child class of the abstract class;
               - those methods described above should have public keyword before them; 
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
                  - it can't have constructors, interfaces and static initialization blocks (like try ... catch, static {...});
                  - can access only final (constants) fields of outer classes or final local variables of the methods;
                  - it suppose object and class creation on the same step;
                  - it begins either from abstract classes or from interfaces;
                  - inside abstract class Anonymous class, the access modifier public is not written before the abstract method; 
                  - inside interface Anonymous class, the access modifier public is written before the abstract method; 

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
           - using the objects available in the java.lang.reflect package;
           - Class <?> objectReflectionClass = object.getClass(); 
           - or Class <?> objectReflectionClass = Class.forName("package_class_name");
           - Field[] allFields = objectReflectionClass.getDeclaredFields();
           - Constructor[] allConstructors = objectReflectionClass.getDeclaredConstructors();
           - Method[] allMethods = objectReflectionClass.getDeclaredMethods();  
           - constructorOne.setAccessible(true);
           - setAccessible(true) method used to make accessible a private element; 
           - inside a try-catch block * ClassName newClassNameObject = (ClassName) constructorOne.newInstance(); 
           - newInstance() method throws three exceptions handled in catch block; 
           - to call a method we use the getDeclaredMethod() method;
           - Method method = objectReflectionClass.getDeclaredMethod("methodName_as_String"); 
           - if the method is private we have to make it accessible with method.setAccessible(true);  
           - now we may call the method methodName_as_String() with invoke, method.invoke(newClassNameObject);
           - it slows the program; 

Collections - are containers that store and manipulate information;
            - we don't have to implement data structures from scratch and we can reuse what was already implemented in java;
            - the starting point for all the collections is the generic interface Collection, declared as: public interface Collection<> ...;
            - collections: Set, List, Queue, Deque (double-ended queue), Map;
            - Set, List, Queue interfaces are present in java.util package and extend the Collection interface;
            - Deque interface extends the Queue interface;
            - Map interface does not extend the Collection interface because Map assumes entries of type key/value pairs and Collection assume elements of one value;
            - there is a difference between add(Object) from Collection and put(k,v) from Map;
            - there is a difference between Collection.remove(Object) - which removes an element and Map.remove(Object) - which removes by key, not by entry;
            - Map.Entry is a nested interface defined in the Map interface;
            - Set: an unordered collection without duplicates;
            - Set: -> HashSet (not ordered, stored in hash table);
                   -> TreeSet (ordered over natural order(indexed, sorted) or over a comparator and stored in a tree);
                   -> LinkedHashSet (it keeps the order of adding, stored in a hash table with a linked list);
            - List: an ordered (over indexes) collection with duplicates;
            - List: -> ArrayList - array structure - it is easier to find elements over indexes;
                    -> LinkedList - organized in nodes that points to the next node - add(index, element) is faster with LinkedList; it inherited the toString() method from a superclass and not from Object class;
            - Queue: collection ordered over FIFO, LIFO mechanism;
            - Queue: -> elements are added at the end of the queue and taken from both end (LIFO) or start (FIFO) of the queue;
                     -> LinkedList;
                     -> it implements methods from Collection interface, but it has it's own also: element(), peek(), offer(), poll();
                     -> peek(), offer(), poll() does not throw exceptions;
            - Deque: queue collection which applies operations, for adding and deletion, at both the beginning and the end of the queue;
            - Deque: -> allows elements to be added both from the start and the end of the queue;
                     -> ArrayDeque; 
                     -> LinkedList;
                     -> peek(), offer(), poll() does not throw exceptions;
            - Map: collection of key-value pairs;
            - Map: -> HashMap (not ordered, stored in hash table);
                   -> TreeMap (ordered over key natural order(indexed, sorted) or over a key comparator);
                   -> LinkedHashMap (it keeps the order of adding pairs, stored in a hash table with a linked list);
            - Map: null value may be a key; 
                   - methods: put, get, remove, size, isEmpty, containsKey, containsValue; 
                   - methods: keySet - it returns a Set of the keys; 
                              values - it returns a Collection of all the values; 
                              entrySet - it returns a Set of all the key-value pairs; 
                              Map.Entry - it represents a single key-value pair; 
                              getKey - it returns a key from an entry; 
                              getValue - it returns a value from an entry;
Contracts in Java - agreements, promises to keep;
                  - the Object class defines the equals() and hashCode() methods;
                  - this means that those two methods are implicitly defined in every class we create;
                  - equals() is: - reflexive: a.equals(a); 
                                 - symmetric: if a.equals(b) then b.equals(a);
                                 - transitive: if a.equals(b) and b.equals(c), then also a.equals(c);
                                 - consistent: the value of equals() changes only if a property inside equals it changes; 
                                 - consistent: calling the method several times should give the same result; 
                                 - == compares primitive types;
                                 - == compares references to the objects (their addresses);
                                 - equals() compares the objects;
                                 - comparing with null should return false;
                  - hashCode(): - returns an integer representing the current instance of a class;
                                - it is defined by the class Object;
                                - consistency: value of hashCode() changes only if a property of equals() changes;
                                - consistency: multiple calls of hashCode() on the same object should give the same result;
                                - equals relation: if a.equals(b) then a.hashCode() == b.hashCode();
                                - hash collision: unequal objects can have the same hashCode();
                  - contains() - overrides equals() method, but for HashSet the hashCode() method must be overridden too;    
                               - always override hashCode() when we override equals();    
                               - override hashCode() and equals() for value objects;    

Sorting collections - to sort in collections we have to compare elements first;
                    - comparison of the collections elements it is done using generic interfaces Comparator <T> and Comparable <T>;
                    - Comparator <T> compares two objects of the same type, using the compare() method;
                    - Comparable <T> compares an object with another object of any type, using the compareTo() method;
                    - compare() and compareTo() methods return an int value and that one could be negative, zero or positive (-1, 0, 1);
                    - those three values indicate the order of sorting;
                    - lists created with List.of() are immutable and can not be sorted;

Annotations - metadata, supplementary information that does not affect directly the code;
            - can be processed by a compiler or at runtime when using our own code;
            
Functional Interfaces   - interfaces with one single abstract method, without implementation;
                        - in addition it may have default and static methods, with implementation;

Lambda  - implementation of functional interface added with Java 8;
        - it allows to an anonymous class to be treated as a normal method;
        - when using lambda we don't use Override annotation anymore;
        - it converts a segment of code into an argument;
        - a lambda function can be created without belonging to any class / without instantiating any class;
        - it can be treated as an object;
        - the name of the abstract method from the interface has no relevance;
        - () parentheses for more than 1 arguments; 
        - () parentheses for no arguments at all; 
        - without parentheses when we have just 1 argument;
        - -> between the list of arguments and the body of the method;
        - the body of the method may contain curly braces {} or may not, if there is only one statement or if an exception is thrown in that one statement;
        - if the expression raises an exception, then curly braces are mandatory;
        - if the body contains just one statement, then we don't have to use curly braces {};
        - if the body contains more than one statement, then we have to use curly braces {};
        - the return keyword may be omitted or not;
        - when the expression returns an object, then we may not use the return keyword;
        - for simple lambda expressions, with one single argument, we can write method reference, which means using the name of a method only instead of the method call;
        - :: symbol separates the class from the name of the method;
        - the single argument of the lambda should be an argument of a class method;
        - the single argument of the lambda calls a method without arguments;

Functional programming - it uses generic functional interfaces from the java.util.function package;
                       - Supplier<T> with get() method without arguments;
                       - Consumer<T> and BiConsumer<T>, with accept(.....) method with arguments;  
                       - Predicate<T> and BiPredicate<T>, with test(.....) method with arguments, which returns a boolean value;
                       - Function<T, R> and BiFunction<T, R>, with apply(.....) method with arguments;
                       - others; 
