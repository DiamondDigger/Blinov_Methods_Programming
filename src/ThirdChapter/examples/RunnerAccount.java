package ThirdChapter.examples;

public class RunnerAccount {
    public static void main(String[] args) {
        Account account1 = new Account();
        Account account2 = new Account(25l);
        Account account3 = new Account(34,300.0);

        System.out.println(account1.createName("Alex")+"\n"+account1.getId()+"\n"+account1.getAmount()+"\n"+"__________________");
        System.out.println(account1.createName("Liana")+"\n"+account1.getId()+"\n"+account1.getAmount()+"\n"+"__________________");
        System.out.println(account1.createName("John")+"\n"+account1.getId()+"\n"+account1.getAmount()+"\n"+"__________________");
    }
}
