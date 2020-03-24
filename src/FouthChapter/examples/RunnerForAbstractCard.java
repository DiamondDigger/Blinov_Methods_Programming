package FouthChapter.examples;

public class RunnerForAbstractCard {
    public static void main(String[] args) {

        AbstractCardAction action = new AnotherCreditCardAction();

        action.doPayment(-3);
        action.checkList(34);
//      action.printMessage("Good work! Method from AbstractCardAction");  - нельзя вызвать метод наследника
//      потому что нету сигнатуры в абстрактном классе



        AnotherCreditCardAction anotherAction = new AnotherCreditCardAction();

        anotherAction.doPayment(32);
        anotherAction.checkList(-3);
        anotherAction.printMessage("Good work! Method from AnotherCardAction");
    }
}
