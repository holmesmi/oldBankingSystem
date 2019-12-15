package oldBankingSystem;

import java.util.List;
import java.util.stream.Collectors;

public class AccountBl {


    private DataStore dataStore = new DataStore();

    public List<Account> GetInvestmentAccounts(int clientId, String accountType) {
        if (accountType == AccountType.INVESTMENT) {
            List<Account> accounts = dataStore.loadAccounts(clientId);
            return accounts.stream().filter(a -> a.getType() == AccountType.INVESTMENT).collect(Collectors.toList());
        }
        throw new RuntimeException("Invalid account type provided");
    }
}
