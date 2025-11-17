package SOLID_PRINCIPLE.Dependency_Inversition_Principle.CorrectCode;

public class PaymentServices {

    public static void main(String[] args) {
        PaymentServices paymentServices = new PaymentServices(new StripPaymentGateway());
        paymentServices.pay();
    }

    PaymentGateway paymentGateway;

    PaymentServices(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    void pay() {
        paymentGateway.pay();
    }
}
