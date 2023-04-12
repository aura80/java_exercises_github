# java_exercises_github
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