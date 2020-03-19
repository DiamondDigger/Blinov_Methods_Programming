package ThirdChapter.examples;

public class RunnerAccount {
    public static void main(String[] args) {
        Account account1 = new Account();
        Account account2 = new Account(25l);
        Account account3 = new Account(34, 300.0);

        double totalAmountOfMoney = account1.getAmount() + account2.getAmount() + account3.getAmount();

        System.out.println(account1.createName("Alex") + "\n" + account1.getId() + "\n" + account1.getAmount() + "\n" + "__________________");
        System.out.println(account2.createName("Liana") + "\n" + account2.getId() + "\n" + account2.getAmount() + "\n" + "__________________");
        System.out.println(account3.createName("John") + "\n" + account3.getId() + "\n" + account3.getAmount() + "\n" + "__________________");
        System.out.println("TOTAL BANK IS :  " + totalAmountOfMoney + " $"
                + "\n" + "_______________________________________________________");

        account1.setId(12l);
        account1.addAmount(4000d);

        account2.addAmount(1200d);


        System.out.println("After recalculation:"
                + "\n" + "********************"
                + "\n" + "*************"
                + "\n" + "*****");

        System.out.println(account1.createName("Alex") + "\n" + account1.getId() + "\n" + account1.getAmount() + "\n" + "__________________");
        System.out.println(account2.createName("Liana") + "\n" + account2.getId() + "\n" + account2.getAmount() + "\n" + "__________________");
        System.out.println(account3.createName("John") + "\n" + account3.getId() + "\n" + account3.getAmount() + "\n" + "__________________");
        totalAmountOfMoney = account1.getAmount() + account2.getAmount() + account3.getAmount();
        System.out.println("TOTAL BANK IS :  " + totalAmountOfMoney + " $"
                + "\n" + "_______________________________________________________");
    }
}
