package SOLID_PRINCIPLE.Leskove_Subsitution_Principle.BetterCode;

public class FixedDepositAccount implements NonWithdrawableAccount{

    public double balance;

    public FixedDepositAccount() {
        this.balance = 0;
    }

    @Override
    public void deposti(double amount) {
        balance+= amount;
        System.out.println("Deposited: " + amount + " from Fixed Term Account. New Balance: " + balance);
    }
}

