package SOLID_PRINCIPLE.Leskove_Subsitution_Principle.BetterCode.Cards;

public class MasterCard extends CreditCard implements InternationalPayments{

    public MasterCard(String ccNumber, String ownerName, int cvv) {
        super(ccNumber, ownerName, cvv);
    }

    @Override
    public void tapAndPay() {
        System.out.println("Tap and Pay impl of MasterCard");
    }

    @Override
    public void onlineTransfer() {
        System.out.println("Online Transfer impl of MasterCard");
    }

    @Override
    public void swipeAndPay() {
        System.out.println("Swipe and Pay impl of MasterCard");
    }

    @Override
    public void mandatePayment() {
        System.out.println("Mandate payment impl of MasterCard");

    }

    @Override
    public void internationalPayments() {
        System.out.println("International Payment implemented In here of MasterCard!");

    }
}
