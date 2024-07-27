package javaLearning;
public class Calculator implements ConcreteSample extends {
    
    public static void main(String[] args) {

        // print () will throw error as static method can not access non static methods / instance variables
        Calculator calculator = new Calculator();
        calculator.canPerform();
        InterfaceSample.canDo();
        System.out.println(calculator.print());
    }

    @Override
    public boolean canPerform() {
        return true;
    }
    public void abstractPerform() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    static class NestedCalculator {
        public void print(){
            System.out.println("Hello world");
        }
    }

    class NestedCalculatorNonStatic {
        public void print(){

        }
    }

    public int print() {
        return 10;
    }
}
