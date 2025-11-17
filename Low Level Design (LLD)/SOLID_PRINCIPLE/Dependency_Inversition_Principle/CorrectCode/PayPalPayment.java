package SOLID_PRINCIPLE.Dependency_Inversition_Principle.CorrectCode;

public class PayPalPayment implements PaymentGateway{
    @Override
    public void pay() {
        System.out.println("PayPay Payment !");
    }
}
