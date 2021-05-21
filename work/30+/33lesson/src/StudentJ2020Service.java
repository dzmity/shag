import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.sql.Statement;

public class StudentJ2020Service {

    private final String PREPARED_INSERT =
            "insert into j2020 (name, last_name, phone_number) values (?, ?, ?)"; /* +
                    "on conflict do nothing";
*/
    private ConnectionCreator connectionCreator = new ConnectionCreator();

    public StudentJ2020 create(StudentJ2020 student) throws Exception {
        Connection ourConnection = null;
        try (
                Connection connection = connectionCreator.createConnection();
                PreparedStatement statement = connection.prepareStatement(PREPARED_INSERT, Statement.RETURN_GENERATED_KEYS)) {
            ourConnection = connection;
            connection.setAutoCommit(false);
            statement.setString(1, student.getName());
            statement.setString(2, student.getLastName());
            statement.setString(3, student.getPhoneNumber());
            statement.executeUpdate();
            connection.commit();
            Savepoint sp2 = connection.setSavepoint();

            ResultSet generatedKeys = statement.getGeneratedKeys();
            if (generatedKeys.next()) {
                int id = generatedKeys.getInt(1);
                student.setId(id);
            }

        } catch (SQLException e) {
            if (ourConnection != null) {
                ourConnection.rollback();
            }
            throw new StudentJ2020Exception(e);
        }
        return student;
    }
}
