package SOLID_PRINCIPLE.Leskove_Subsitution_Principle.BetterCode;

import java.util.List;

public class Client {

    private List<WithdrawableAccount> withdrawableAccounts;
    private List<NonWithdrawableAccount> nonWithdrawableAccounts;


    public Client (List<WithdrawableAccount> withdrawableAccounts,List<NonWithdrawableAccount> nonWithdrawableAccounts){

        this.withdrawableAccounts = withdrawableAccounts;
        this.nonWithdrawableAccounts=nonWithdrawableAccounts;
    }


    public void processTransaction(){
        for (WithdrawableAccount acc : withdrawableAccounts){
            acc.deposti(5000);
            acc.withDrawable(500);
        }

        for (NonWithdrawableAccount nonAcc:nonWithdrawableAccounts){
            nonAcc.deposti(10000);
        }
    }

}
