package SOLID_PRINCIPLE.Leskove_Subsitution_Principle.BetterCode.Cards;



public class VisaCard extends CreditCard{


    public VisaCard(String ccNumber, String ownerName, int cvv) {
        super(ccNumber, ownerName, cvv);
    }

    @Override
    public void tapAndPay() {
        System.out.println("Tap and Pay impl of VISA");
    }

    @Override
    public void onlineTransfer() {
        System.out.println("Online Transfer impl of VISA");
    }

    @Override
    public void swipeAndPay() {
        System.out.println("Swipe and Pay impl of VISA");
    }

    @Override
    public void mandatePayment() {
        System.out.println("Mandate payment impl of VISA");
    }

/*    @Override
    public void upiPayments() {
 // throw some exceptions..
    }

    @Override
    public void internationalPayments() {
        System.out.println("Intl payment impl of VISA");
    }*/


}

