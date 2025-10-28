package SOLID_PRINCIPLE.Leskove_Subsitution_Principle.BetterCode;

public class SavingAccount implements WithdrawableAccount{


    private double balance;

    public SavingAccount() {
        this.balance = 0;
    }


    @Override
    public void deposti(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + " in Savings Account. New Balance: " + balance);
    }

    @Override
    public void withDrawable(double amount) {

        if(balance >=amount){
        balance -= amount;
        System.out.println("Withdrawed : "+ amount +" from Saving Account.New Balance: "+balance);
        }else{
            System.out.println("Insufficent funds in Saving Account!");
        }

    }
}
