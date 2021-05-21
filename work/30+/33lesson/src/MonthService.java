import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class MonthService {
    private final String PREPARED_INSERT =
            "insert into months (id, name, days) values (?, ?, ?)";

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



    public void create(Month month) {
        try (Connection connection = creator.createConnection();
        Statement statement = connection.createStatement(
                ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE)) {

            Integer id = month.getId();
            String name = month.getName();
            Integer days = month.getDays();

            String insertQuery;
            insertQuery = "insert into months (id, days, name) values (%s, %s, '%s')";
            insertQuery = String.format(insertQuery, id, days, name);
            statement.addBatch(insertQuery);
            statement.executeBatch();

        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public void createWithPreparedStatement(Month month) {
        try (Connection connection = creator.createConnection();
                PreparedStatement statement = connection.prepareStatement(PREPARED_INSERT)) {

            Integer id = month.getId();
            String name = month.getName();
            Integer days = month.getDays();

            statement.setInt(1, id);
            statement.setString(2, name);
            statement.setInt(3, days);
            statement.executeUpdate();


        } catch (SQLException e) {
            System.out.println(e);
        }
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
