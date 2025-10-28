package SOLID_PRINCIPLE.Leskove_Subsitution_Principle.BetterCode.Cards;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
// ✅ Polymorphism in action
        List<CreditCard> cards = new ArrayList<>();

        cards.add(new VisaCard("4111111111111111", "Bhupendra Makode", 123));
        cards.add(new RuPayCard("6070111122223333", "Kanchan Makode", 456));
        cards.add(new MasterCard("5555666677778888", "Rohit Sharma", 789));

        // ✅ Iterate over each card — Liskov principle in action
        for (CreditCard card : cards) {
            System.out.println("\n===============================");
            card.displayCreditCardDetails();
            card.tapAndPay();
            card.onlineTransfer();
            card.swipeAndPay();
            card.mandatePayment();

            // Extra behavior depending on capabilities
            if (card instanceof UPICompatableCreditCard) {
                ((UPICompatableCreditCard) card).upiPayment();
            }

            if (card instanceof InternationalPayments) {
                ((InternationalPayments) card).internationalPayments();
            }
        }

        System.out.println("\n=== All Cards Processed Successfully ===");

    }
}
