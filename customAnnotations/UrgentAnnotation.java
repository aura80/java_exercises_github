package java_exercises_github.customAnnotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)       // it shows to us on which kind of element this annotation can be used on, ElementType.TYPE - used on classes only
@Retention(RetentionPolicy.RUNTIME)     // RetentionPolicy.RUNTIME - 'UrgentAnnotation' is available during the running of the program
//@Retention(RetentionPolicy.SOURCE)      // RetentionPolicy.SOURCE  - 'UrgentAnnotation' is eliminated before compiling (important for annotation used before the code is even compiled like @SuppressWarnings annotation)
//@Retention(RetentionPolicy.CLASS)       // RetentionPolicy.CLASS   - 'UrgentAnnotation' is eliminated after compiling
public @interface UrgentAnnotation {

}
