import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;


public class Lesson33 {

    // https://careers.epam.by/training/books
    // file:///home/dzmitry/Downloads/Java_from_EPAM_Blinov_2020.pdf
    public static void main(String[] args) throws SQLException, IOException {
        // Как установить соединение с БД ?
//        Connection connection1 = createConnectionFirstCase();

        // Параметры соединения можно задавать: с помощью прямой передачи значений в коде класса,
        // а также с помощью файлов properties, json, yaml или xml.
        // Чтение параметров соединения с базой данных и получение соединения
        // следует вынести в отдельный класс - e.x. ConnectorCreator

        Properties properties = new Properties();
        properties.put("user", "shag");
        properties.put("password", "shag");
        properties.put("autoReconnect", "true");
        properties.put("characterEncoding", "UTF-8");
        properties.put("useUnicode", "true");
        properties.put("serverTimezone", "UTC");
        String url = "jdbc:postgresql://localhost:5433/shag";
//        Connection connection2 = createConnectionSecondCase(properties, url);

        Connection connection = createConnectionThirdCase();

        // Как начать выполнять sql запросы в БД ?
        // Выполнение без предварительной подготовки запроса
        Statement statement = connection.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
        ResultSet resultSet = statement.executeQuery("select * from months");
        // executeQuery / executeUpdate / executeBatch / execute

        // Как обработать результаты выполнения запроса
        // При первом вызове метода next() указатель перемещается на таблицу результатов выборки в позицию 1 строки.
        // Когда строки закончатся, метод возвратит значение false.
        handleData(statement);

        // Объект ResultSet позволяет вставлять запись в базу данных без дополнительных запросов.
        Statement statement2 = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
        handleDataWithUpdate(statement2);

        // Работа с методанными
        connection.getMetaData();
        resultSet.getMetaData();

        // try with resources ?
        resultSet.close();
        statement.close();
        connection.close();

        // PreparedStatement и CallableStatement - для подготовленных запросов
        // PreparedStatement - используется при выполнении часто повторяющихся запросов SQL
        // Такой оператор предварительно готовится и хранится в объекте, что ускоряет обмен информацией
        // с базой данных при многократном выполнении однотипных запросов.
        // CallableStatement - используется для выполнения хранимых процедур, созданных средствами самой СУБД

        // sql injection attacks ?

        workWithPreparedStatement(connection, statement, resultSet);

        // batch // autocommit
    }

    private static void correctConectionHandling() {

    }

    private static void workWithPreparedStatement(Connection connection, Statement statement, ResultSet resultSet) throws SQLException {
        String sql = "INSERT INTO months(id, name, days) VALUES(?, ?, ?)";
        PreparedStatement ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        ps.setInt(1, 14);
        ps.setString(2, "14-month");
        ps.setInt(3, 10);
        ps.executeUpdate();

        ResultSet rs = statement.getGeneratedKeys();
        if(resultSet.next()) {
            int key = resultSet.getInt(1);
            System.out.println(key);
        }
    }

    private static void handleData(Statement statement) throws SQLException {
        ResultSet resultSet = statement.executeQuery("select * from months where days > 30");
        while (resultSet.next()) {

            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            int days = resultSet.getInt("days");
            System.out.println(String.format("%s %s %s", id, name, days));
        }
    }

    private static void handleDataWithUpdate(Statement statement) throws SQLException {
        ResultSet resultSet = statement.executeQuery("select * from months");
        resultSet.moveToInsertRow(); // insert row
        resultSet.updateInt(1, 13);
        resultSet.updateString(2, "13-month");
        resultSet.updateInt(3, 20);
        resultSet.insertRow();
        resultSet.moveToCurrentRow();


        while (resultSet.next()) {
            int id = resultSet.getInt(1);
            if (id == 2) {
                resultSet.updateInt("days", 777); // update row
                resultSet.updateRow();
            }
        }
    }

    private static Connection createConnectionFirstCase() throws SQLException {
        return DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/shag", "shag", "shag");
        // экземпляр драйвера загружается автоматически при попытке получения соединения с БД
    }

    private static Connection createConnectionSecondCase(Properties properties, String url) throws SQLException {
        return DriverManager.getConnection(url, properties);
    }

    public static Connection createConnectionThirdCase() throws IOException, SQLException {
        Properties properties = new Properties();
        properties.load(new FileReader(generateFilePath("work/30+/33lesson/resources/database.properties")));
//        String driverName = (String) properties.get("db.driver");
        String url = (String) properties.get("db.url");
        return createConnectionSecondCase(properties, url);
    }

    private static String generateFilePath(String fileName) {
        String dirName = System.getProperty("user.dir");
        return dirName + File.separator + fileName;
    }
}
