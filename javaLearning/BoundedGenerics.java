package javaLearning;

public class BoundedGenerics<T extends Number> {
    T value;
    public T getValue(){
        return value;
    }

    public void setValue(T value){
        this.value = value;
    }
}
