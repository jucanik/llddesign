package javaLearning;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class Caltest {
    public static void main(String[] args) {
        Calculator.NestedCalculator nestedCtest = new Calculator.NestedCalculator();
        nestedCtest.print();
        AbstractCalculator calc = new AbstractCalculator() {
            @Override
            public void display(){
                System.out.println("Sum of A and B");
            }
        };

        AnnotationSample annotationSample = new AnnotationSample();
        System.out.println(annotationSample.getClass().getAnnotation(CustomAnnotation.class));

        Consumer<Integer> loggingObject = (Integer val) -> {
            if(val>10){
                System.out.println("Value is greater than 10");
            }
        };
        // // Here logging Object is the Object reference variable

        loggingObject.accept(10);

        Supplier<String> logStatement = ()->{
            return "Data Reading";
        };

        System.out.println(logStatement.get());

        Function<Integer, String> integerToString = (Integer in) -> {
            return in.toString();
        };

        integerToString.apply(10);

        InterfaceSample interfaceSample = ()->{
            System.out.println("hello");
        };
        interfaceSample.abstractPerform();
        calc.display();
        Genericclass<Integer> generic = new Genericclass<Integer>();
        generic.setValue(1);
        Integer val = generic.getValue();
        if(val == 1){
            // do something
        }
        Genericclass genericclass = new Genericclass();
        genericclass.setValue(1);
        genericclass.setValue("helloworld");// internally object is passed as parameter

        BoundedGenerics<Integer> boundedGenerics = new BoundedGenerics<Integer>();
        boundedGenerics.setValue(1);
        //BoundedGenerics<String> bg = new BoundedGenerics<String>();
        // here if we want to pass String as T then it will throw compile time error.

        Wildcard wildcard = new Wildcard();
        final List<Integer> iList = new ArrayList<>();
        iList.add(1);
        final List<Float> fList = new ArrayList<>();
        fList.add(0.7f);
        final List<Integer> secondIList = new ArrayList<>();
        wildcard.computeList(iList, fList);
        wildcard.computeListWithGenericType(iList, secondIList);

        // A single wildcard (<? extends Number>) can accept any subclass of Number e.g Integer Float . but if we represent the same as generic type
        // then we need to use multiple generic types (e.g T for integer , K for float). then we can do the same.
        // Also in wildcard we can do <? super Number> . Also unbounded wild card is possible.
        EnumSample fridaySample = EnumSample.FRIDAY;
        fridaySample.dummyMethod();
        Singleton singleton = new Singleton();
        Singleton.SingletonEagerInitialization.getSingletonInstance();
    }
}
