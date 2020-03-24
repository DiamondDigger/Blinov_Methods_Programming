package FouthChapter.examples;

public class AnotherCreditCardAction extends AbstractCardAction {

    public void printMessage(String text){
        System.out.println(text);
    }

    @Override
    public void doPayment(double amount) {
        System.out.println("Made some payment!");
    }
}
