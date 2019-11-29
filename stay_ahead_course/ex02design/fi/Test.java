package ex02design.fi;

@FunctionalInterface
public interface Test<T>{
    boolean test(T t);
}