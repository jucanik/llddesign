package javaLearning;

public interface  ConcreteSample extends InterfaceSample{

    default boolean canPerform(){
        return InterfaceSample.super.canPerform();
    }

}
