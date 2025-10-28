package SOLID_PRINCIPLE.Leskove_Subsitution_Principle.BetterCode;

public class CurrentAccount implements WithdrawableAccount{

    private double balance;

    public CurrentAccount(){
        balance=0;
    }


    @Override
    public void deposti(double amount) {
        balance +=amount;
        System.out.println("Deposited: " + amount + " in Current Account. New Balance: " + balance);
}

    @Override
    public void withDrawable(double amount) {

        if(balance>=amount){
            balance-=amount;
            System.out.println("Withdrawn: " + amount + " from Current Account. New Balance: " + balance);
        } else {
            System.out.println("Insufficient funds in Current Account!");
        }

    }
}
