package FouthChapter.examples;

public class CardRunner {
    public static void main(String[] args) {
        CreditCard card1 = new CreditCard();
        CreditCard card2 = new CreditCardAction();
        CreditCardAction card3 = new CreditCardAction();

        card1.doPayment(10.2);
        card2.doPayment(13.2);  // динмаческий полиморфизм
        card3.doPayment(9.99);  // динмаческий полиморфизм

        card3.checkCreditLimit();             // неполиморфный метод
    }
}
