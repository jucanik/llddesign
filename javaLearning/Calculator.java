package javaLearning;
public class Calculator {
    
    public static void main(String[] args) {

        // print () will throw error as static method can not access non static methods / instance variables
        Calculator calculator = new Calculator();
        System.out.println(calculator.print());
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
