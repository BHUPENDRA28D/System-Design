package SOLID_PRINCIPLE.Leskove_Subsitution_Principle.BetterCode.Cards;

public abstract class CreditCard {

    private String ccNumber;
    private String ownerName;
    private int cvv;


    public CreditCard(String ccNumber, String ownerName, int cvv) {
        this.ccNumber = ccNumber;
        this.ownerName = ownerName;
        this.cvv = cvv;
    }

    String cvvString = String.valueOf(cvv);
    char firstchar = cvvString.charAt(0);
    String makedCvv= firstchar+"***42N";

    public abstract void tapAndPay();
    public abstract void onlineTransfer();
    public abstract void swipeAndPay();
    public abstract void mandatePayment();
 //  public abstract void upiPayments();
 //   public abstract void internationalPayments();

    public void displayCreditCardDetails(){
        System.out.println("---------------------");
        System.out.println("  CC Number -- "+ccNumber);
        System.out.println("  Owner Name -- "+ownerName);
        System.out.println("  Card CVV -- "+(makedCvv));
    }
}
