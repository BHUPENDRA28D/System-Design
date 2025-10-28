package SOLID_PRINCIPLE.Leskove_Subsitution_Principle.BetterCode;

// Allows to deposit and withdraw both...
public interface WithdrawableAccount extends NonWithdrawableAccount{
    @Override
    void deposti(double amount);

    void withDrawable(double amount);
}
