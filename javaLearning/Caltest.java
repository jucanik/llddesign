package javaLearning;
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
        calc.display();
    }
}
