package decorator.decorator;

import decorator.base.Base;

public class NormalDecorator extends Decorator{

    private Base base;

    public NormalDecorator(final Base base){
        this.base=base;
    }

    @Override
    public int cost() {
        // TODO Auto-generated method stub
        return this.base.cost()+100;
    }

}
