package FouthChapter.examples;

public abstract class AbstractCardAction {
        AbstractCardAction(){

        }

        public boolean checkList(double amount){
            if (amount > 0) {
                return true;
            } else {
                return false;
            }
        }

        public abstract void doPayment(double amount);
}

