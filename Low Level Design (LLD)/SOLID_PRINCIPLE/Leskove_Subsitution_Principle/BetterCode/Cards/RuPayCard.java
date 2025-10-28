package SOLID_PRINCIPLE.Leskove_Subsitution_Principle.BetterCode.Cards;

public class RuPayCard extends CreditCard implements UPICompatableCreditCard{

    public RuPayCard(String ccNumber, String ownerName, int cvv) {
        super(ccNumber, ownerName, cvv);
    }

    public void tapAndPay() {
        System.out.println("Tap and Pay impl of RuPay");
    }

    @Override
    public void onlineTransfer() {
        System.out.println("Online Transfer impl of RuPay");
    }

    @Override
    public void swipeAndPay() {
        System.out.println("Swipe and Pay impl of RuPay");
    }

    @Override
    public void mandatePayment() {
        System.out.println("Mandate payment impl of RuPay");

    }

    @Override
    public void upiPayment() {
        System.out.println("UPI payment can be implemented in RuPay!");
    }
}
