package oldBankingSystem;

public class Main {

    public static void main(String[] args) {
        Integer vipClientId = 25;
        AccountBl accountBl = new AccountBl();

        accountBl.GetInvestmentAccounts(vipClientId, AccountType.INVESTMENT);
    }
}
