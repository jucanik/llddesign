package template;

public abstract class PaymentPlan {

    protected abstract void createPlan();

    protected abstract void creditMoney();

    protected abstract void platformFee();

    protected abstract void debitMoney();

    public final void sendMoney(){
        createPlan();
        creditMoney();
        platformFee();
        debitMoney();
    }
}
