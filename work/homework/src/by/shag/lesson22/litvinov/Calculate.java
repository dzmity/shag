package by.shag.lesson22.litvinov;

@FunctionalInterface
public interface Calculate<A, B, C, R> {
    R run(A a, B b, C c);
}
