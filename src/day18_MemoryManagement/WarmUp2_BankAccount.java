package day18_MemoryManagement;

public class WarmUp2_BankAccount {

public String accountHolder;
public long accountNumber;// as it could be long number and outside the int range
public double balance;// we will include this after there is deposit or withdrawal

    public void setInfo(String accountHolder, long accountNumber) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
    }
//this is when you call it will set the info of the desired account object


    public String toString() {
        return "WarmUp2_BankAccount{" +
                "accountHolder='" + accountHolder + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance= $" + balance +
                '}';
    }
//to display the separate copy of the above-mentioned information for each object

    public void checkBalance (){
        System.out.println(" Your available balance is: $"+balance);
    }


    public void deposit (double amount){

        if (amount<1){// this area will remove the bug of depositing negative amount
            System.out.println("Invalid entry");
            return;
        }
        if (amount>10000){
            System.out.println("Deposit amount over the set limit ");
            return;
        }
        System.out.println("Depositing "
        +amount +" to "+accountHolder);
        balance += amount;
    }

    public void withdraw (double amount){

        if (amount>balance){// this area removes the bug of withdrawing amount more than the available balance
            System.out.println("Insufficient account balance!");
            return;
        }
        System.out.println("withdrawing "
                +amount +" from "+accountHolder);// this print statement only shows the process
        balance -= amount;



    }
}
/*

Create a custom class named BankAccount:
			Attributes:
				1. accountHolder
				2. accountNumber
				3. balance

			Actions:
				1. setInfo(): sets the accountHolder and accountNumber attributes
		            	2. toString(): displays the full account info
		                3. checkBalance():displays the available balance
		                4. deposit(amount): increases the balance by the specified amount
		        	5. withdraw(amount): decreases the balance by the specified amount
 */