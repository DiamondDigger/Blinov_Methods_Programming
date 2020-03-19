package ThirdChapter.examples;

public class RunnerAccount {
    public static void main(String[] args) {
        Account account1 = new Account();
        Account account2 = new Account(25l);
        Account account3 = new Account(34,300.0);

        System.out.println(account1.getId()+"\n"+account1.getAmount()+"\n"+"__________________");
        System.out.println(account2.getId()+"\n"+account2.getAmount()+"\n"+"__________________");
        System.out.println(account3.getId()+"\n"+account3.getAmount()+"\n"+"__________________");
    }
}
