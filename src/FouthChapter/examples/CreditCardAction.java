package FouthChapter.examples;

public class CreditCardAction extends CreditCard{

        public boolean checkCreditLimit() {
            System.out.println("Some money on the card."+ "--- "+getClass());
            return true;// stub
        }

    @Override
    public void doPayment(double amountPayment) {
        System.out.println("complete from debt card(CreditCardAction)!");
    }
}
