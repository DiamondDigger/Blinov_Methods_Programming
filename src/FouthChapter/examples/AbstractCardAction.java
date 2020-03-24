package FouthChapter.examples;

public abstract class AbstractCardAction {
        AbstractCardAction(){

        }

        public boolean checkList(double amount){
            return amount > 0;
        }

        public abstract void doPayment(double amount);
}

