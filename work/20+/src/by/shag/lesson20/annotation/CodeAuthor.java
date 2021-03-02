package by.shag.lesson20.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Target;

//@Deprecated
//@Override
@Inherited
@Documented
@SuppressWarnings("unchecked")
@Target({ElementType.TYPE})
public @interface CodeAuthor {
    String name();
    int version() default 1;
    String edited();
    String[] assistants();
}
