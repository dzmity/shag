import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class MonthService {

    private ConnectionCreator creator = new ConnectionCreator();

    public List<Month> getAllMonth() {
        List<Month> months = new ArrayList<>();

        try(Connection connection = creator.createConnection();
                Statement statement = connection.createStatement(
                        ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE);
                ResultSet rs = statement.executeQuery("select * from months")) {

            while (rs.next()) {
                months.add(handleResultSetRecord(rs));
            }
        } catch (SQLException e) {

        }
        return months;
    }

    private Month handleResultSetRecord(ResultSet resultSet) throws SQLException {
        int id = resultSet.getInt("id");
        String name = resultSet.getString("name");

        if (name.equalsIgnoreCase("March")) {
            resultSet.updateInt("days", 37);
            resultSet.updateRow();
        }
        int days = resultSet.getInt("days");

        if (id == 1) {
            resultSet.moveToInsertRow();
            resultSet.updateInt("id", 998);
            resultSet.updateString("name", "Lucky month");
            resultSet.updateInt("days", 777);
            resultSet.insertRow();
            resultSet.moveToCurrentRow();
        }

        return new Month(id, name, days);
    }
}
