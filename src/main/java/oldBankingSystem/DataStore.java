package oldBankingSystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DataStore {

    private static final String USER = null;
    private static final String PASS = null;

    public List<Account> loadAccounts(int clientId) {
        List<Account> result = new ArrayList<Account>();

        Connection connection;
        try {
            connection = createConnection();
            ResultSet resultSet = connection.createStatement().executeQuery("query");
            while (resultSet.next()) {
                Account account = new Account();
                account.setAccountNumber(resultSet.getString("accountNumber"));
                account.setAccountOwner(resultSet.getInt("accountOwner"));

                String type = resultSet.getString("accountType");
                if (type == null) {
                    type = AccountType.CHECKING;
                }

                account.setType(type);
                result.add(account);
            }
            return result;

        } catch (SQLException e) {
            return result;
        }
    }


    private static Connection createConnection() throws SQLException {
        Connection sqlConnection = null;
        sqlConnection = DriverManager.getConnection("someURl", USER, PASS);
        return sqlConnection;
    }
}
