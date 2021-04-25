import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;


public class Lesson33 {

    public static void main(String[] args) throws SQLException, IOException {
//        Connection connection = DriverManager.getConnection(
//                "jdbc:postgresql://localhost:5433/shag", "shag", "shag");

        Properties properties = new Properties();
        properties.put("user", "shag");
        properties.put("password", "shag");
        properties.put("autoReconnect", "true");
        properties.put("characterEncoding", "UTF-8");
        properties.put("useUnicode", "true");
        properties.put("serverTimezone", "UTC");
        String url = "jdbc:postgresql://localhost:5433/shag";
        Connection connection = DriverManager.getConnection(url, properties);

                // necessary for sql query execution
                Statement
                statement = connection.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
        ResultSet resultSet = statement.executeQuery("select * from months");
        while (resultSet.next()) {
            System.out.println(String.format("%s %S %s",
                    resultSet.getInt("id"), resultSet.getString("name"), resultSet.getInt("days")));
        }
        connection.close();
        createConnection();
    }

    public static Connection createConnection() throws IOException, SQLException {
        Properties properties = new Properties();
        properties.load(new FileReader(generateFilePath("work/30+/33lesson/resources/database.properties")));
//        String driverName = (String) properties.get("db.driver");
        String url = (String) properties.get("db.url");
        Connection connection = DriverManager.getConnection(url, properties);
        return connection;
    }

    private static String generateFilePath(String fileName) {
        String dirName = System.getProperty("user.dir");
        return dirName + File.separator + fileName;
    }
}
