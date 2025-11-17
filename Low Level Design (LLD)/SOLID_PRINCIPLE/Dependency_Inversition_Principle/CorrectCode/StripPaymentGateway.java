package SOLID_PRINCIPLE.Dependency_Inversition_Principle.CorrectCode;

public class StripPaymentGateway implements PaymentGateway{
    public void pay() {
        System.out.println("Strip Payment!");
    }
}
