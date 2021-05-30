package mapping;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public interface EntityMapper<E> {

    E map(ResultSet resultSet) throws SQLException;

    void populate(E model, PreparedStatement statement) throws SQLException;
}
