package javaLearning;

public class Genericclass<T> {
    T value;
    public T getValue(){
        return value;
    }
    public void setValue(T val){
        this.value= val;
    }
    public <K> void setval(K value){
        System.out.println(value);
    }
    //HERE k is for the scope of method only
}
// if we want to create non generic subclass of this parent class then we need to initialize like 
// public class color extends Genericclass<String> .Generic class can heklp us to avoid typecasting. in the compile time we can tell what is the T and which datatype can replace T
// className<Generic type parameter>
// Not the whole class Generic . instead only methods will be generic public <K,V> <Returntype>
// Raw type: Name of the generic class or interface without any type argument

// Bounded Generics: It can be used at generic class and method. uPPER bOUND AND mULTIbOUND
// UpperBound(<T extends Number>) means T can be of number or its subclass only .Here superclass (in this case Number) can have interface too
// public class A extends ParenetClass implements Interface 1 Interface 2 .java subclass can extends only one super/parent class but csn implement multiple classes

// public Class Print<T extends number & Interface1 & interface2>

// public class A extends Number Implements Interface 1, Interface 2{

//} -> Print<A> printobj = new Print<A>(); T should be something like which can extend a class along with implements multiple interfaces

// Wildcards: -> 1. upper bound wildcard 2. lower bound wildcard 3. unboundwildcrd

// Type erasure: While creating byte code compiler replace4s type parameter withits supercalss value . e.g <T extends Number> here T will be replaced by number