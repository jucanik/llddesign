package template;

public class MerchantPaymentPlan extends PaymentPlan{

    @Override
    protected void createPlan() {
        // TODO Auto-generated method stub
        System.out.println("Plan Created");
    }

    @Override
    protected void creditMoney() {
        // TODO Auto-generated method stub
        System.out.println("Money Credited");
    }

    @Override
    protected void platformFee() {
        // TODO Auto-generated method stub
        System.out.println("PlatformFee debited");
    }

    @Override
    protected void debitMoney() {
        // TODO Auto-generated method stub
        System.out.println("Money Debited");
    }

}
