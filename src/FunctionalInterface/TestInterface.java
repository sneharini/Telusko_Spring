package FunctionalInterface;


@FunctionalInterface
public interface TestInterface {
    void fun();

    default void fun2(){
        System.out.println("Hello this is default method");
    }
}
