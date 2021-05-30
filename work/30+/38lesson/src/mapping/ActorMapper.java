package mapping;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import jpa.model.Actor;

public class ActorMapper implements EntityMapper<Actor> {

    private static final String ID = "id";
    private static final String NAME = "name";
    private static final String LAST_NAME = "last_name";
    private static final String DATE_OF_BIRTH = "date_of_birth";

    @Override
    public Actor map(ResultSet resultSet) throws SQLException {

        Actor actor = new Actor();
        long aLong = resultSet.getLong(ID);
        String string = resultSet.getString(NAME);

        actor.setId(aLong);
        actor.setName(string);
        actor.setLastName(resultSet.getString(LAST_NAME));
        actor.setDateOfBirth(resultSet.getDate(DATE_OF_BIRTH));
        return actor;
    }

    @Override
    public void populate(Actor model, PreparedStatement statement) throws SQLException {
        statement.setString(1, model.getName());
        statement.setString(2, model.getLastName());
        statement.setDate(3, new Date(model.getDateOfBirth().getTime()));
    }
}
