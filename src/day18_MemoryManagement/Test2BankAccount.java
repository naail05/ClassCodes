package day18_MemoryManagement;

public class Test2BankAccount {

    public static void main(String[] args) {
        WarmUp2_BankAccount account1 = new WarmUp2_BankAccount();
        account1.setInfo("Nazir",2232453214l);
        System.out.println(account1);
        account1.deposit(1000);
        account1.checkBalance();

        account1.withdraw(450);
        account1.checkBalance();

        account1.deposit(-100);
        account1.checkBalance();

        account1.withdraw(1500);
        account1.checkBalance();

        System.out.println("------------------------------------------------------------------");

        WarmUp2_BankAccount account2 = new WarmUp2_BankAccount();
        account2.setInfo("Rashid",21345323563l);

        WarmUp2_BankAccount account3 = new WarmUp2_BankAccount();
        account3.setInfo("Maryam",23435256125l);

        account2.deposit(2000);
        account2.checkBalance();

        account3.deposit(18000);
        account3.checkBalance();
// that is the advantage of instance variable as each object will have its own copy and if there is any activity done on one object as account in this case, that will not impact the other objects

    }
}
