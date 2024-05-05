package decorator;

import decorator.base.Base;
import decorator.base.BaseImpl;
import decorator.decorator.FarmDecorator;
import decorator.decorator.NormalDecorator;

public class App {

    public static void main(String[] args) {
        final Base baseOrder = new FarmDecorator(new NormalDecorator(new BaseImpl()));
        System.out.println("Cost is"+ baseOrder.cost());
    }
}
