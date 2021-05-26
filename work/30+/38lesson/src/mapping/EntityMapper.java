package mapping;

import java.sql.ResultSet;

public interface EntityMapper<E> {

    E map(ResultSet resultSet);
}
