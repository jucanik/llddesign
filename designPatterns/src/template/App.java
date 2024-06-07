package template;

public class App {

    public static void main(String[] args) {
        PaymentPlan familyPaymentPlan = new FamilyPaymentPlan();
        familyPaymentPlan.sendMoney();
        PaymentPlan merchantPaymentPlan = new MerchantPaymentPlan();
        merchantPaymentPlan.sendMoney();
    }
    
}
