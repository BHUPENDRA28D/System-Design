package SOLID_PRINCIPLE.Dependency_Inversition_Principle.CorrectCode;

public class RazorPayPaymentGateway implements PaymentGateway{

    @Override
    public void pay() {
        System.out.println("RazorPay Payment!");
    }
}
