import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionCreator {

    public Connection createConnection() {
        Properties properties = new Properties();
        try {
            properties.load(new FileReader(generateFilePath("work/30+/33lesson/resources/database.properties")));
        } catch (IOException e) {
            throw new RuntimeException("Can not read connection properties", e);
        }
        String url = (String) properties.get("db.url");
        try {
            return DriverManager.getConnection(url, properties);
        } catch (SQLException e) {
            throw new RuntimeException("Impossible to create connection", e);
        }
    }

    private String generateFilePath(String fileName) {
        String dirName = System.getProperty("user.dir");
        return dirName + File.separator + fileName;
    }

}
