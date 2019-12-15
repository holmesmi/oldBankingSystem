package oldBankingSystem;

public class Account {

    private String accountNumber;
    private Integer accountOwner;
    private String type;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Integer getAccountOwner() {
        return accountOwner;
    }

    public void setAccountOwner(Integer accountOwner) {
        this.accountOwner = accountOwner;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
