package by.shag.lesson20.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Inherited
@Target({ElementType.METHOD, ElementType.TYPE})
@Documented
public @interface ThisCodeAuthor {

    String author() default "Dzmitry Rafalovich";
    String creationDate();
    int version() default 1;
}
