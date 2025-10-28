package SOLID_PRINCIPLE.Leskove_Subsitution_Principle.BetterCode;

import java.util.ArrayList;
import java.util.List;

public class LSPFollowed {

    public static void main(String[] args) {

        List<WithdrawableAccount> withdrawableAccounts = new ArrayList<>();
        withdrawableAccounts.add(new SavingAccount());
        withdrawableAccounts.add(new CurrentAccount());


        List<NonWithdrawableAccount> depositOnlyAccount = new ArrayList<>();
        depositOnlyAccount.add(new FixedDepositAccount());

        Client client = new Client(withdrawableAccounts,depositOnlyAccount);
        client.processTransaction();
    }
}
