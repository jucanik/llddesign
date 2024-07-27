package javaLearning;

import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@FunctionalInterface
public interface InterfaceSample {

    void abstractPerform();

    default boolean canPerform() {
        perform();
        performStatic();
        return true;
    }

    // // static method can not be overriden by the implementation classes . but default method can be overridden by implementation class
    static boolean canDo() {
        performStatic();
        return true;
    }

    private void perform(){

    }

    private static void performStatic(){

    }

    String toString(); // //Object class method not considered as abstract method. Every class is child of Object. No need to provide the implementation

    // // These private and private sttaic methods are callable inside interface becaise default and sdtatic can use this
    // // static method can only access static memebers / methods because these are class memeberts

    // // functional interface and lambda expression -> If an interface contains only one abstract method , that is known as Funxtional interface
    // //SAM -> Single abstract method
    // // Functional interface can be used at the top of the interface

    // // Lambda expression is a way to implement functional interface

    // Types of functional interface-> Consumer Supplier Functional Predicate . Java.util .function

    // // Consumer -->

    @FunctionalInterface
    public interface Consumer<T> {
        void accept(T t);
    }

    @FunctionalInterface
    public interface Supplier<T>{
        T get();
    }

    @FunctionalInterface
    public interface Function<T, R> {
        R apply(T t);
    }

    public interface Predicate<T> {
        boolean test (T t);
    }

    // // Reflection: used to examine Classes methods interface fields at runtime and also possible to change the behavious of class at runtime
    // // To reflect the class we first need to get an object of class Class. Instance of class Class represents classes during runtime
    // // JVM loads the class , class object is also created. this class object has metadata information (e.g methods fields)
    // // Class class =Class.forName("Bird") / Bird.class 
    // Bird bird = new Bird();
    // bird.getClass()
    // // Java.lang.reflect() getmethods() getDeclaredMethods()

    // // Refelection violates Oops as priv ate fields acn also be set true. Reflection breaks singleton

    // Annotation -> adding metadata in java code. reflection is used to access metadata. its usage is optional; we can use metadata at runtime and add ceratin logic
    // //annotations can be apllued anywhere classes fields method. Metadata is optional You can use this metadata information at runtime to use certailn logic if wanted @Override
    // // Predefined annotations-> used on java code -> @Deprecated @Overriode @SuppressWarnings@FunctionalInterface @SafeVarargs
    // // Meta annotations: used on annotations
    // // @Deprecated-> shows compile time warning
    // // @FunctionalInterface -> restricts interface tro have only one abstract method
    // // @SafeVarargs -> suppress heap pollution warnings . used over methods and constructoes with variable arguments as parameter
    // // methods can not be overridden
    ////Object of one type storing the reference of another type object. Stack and heap memory and heap stores object 
    // //Heap pollution. Object of one type stores the reference of anothjer type
    // // Meta Annotation: used on top of annotation
    ////@Target(ElementType.METHOD)
    ////@Retention(RetentionPolicy.SOURCE) -> annotation will not be stored in .class file
    ////@Retention(RetentionPolicy.CLASS) -> annotation will be available in class. but not available at runtime . So reflection can not be used
    ////@Retention(RetentionPolicy.RUNTIME) -> annotation will be available at Runtime at JVM
    // // public @interface Override
    //// safe varargs constructor and method
    ////@Retention -> this meta annottaion tells how annotations will be stored in Java


}
