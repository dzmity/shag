package mapping;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import jpa.model.Film;

public class FilmMapper implements EntityMapper<Film> {

    private static final String ID = "id";
    private static final String NAME = "name";
    private static final String YEAR = "year";
    private static final String RATING = "raiting";

    @Override
    public Film map(ResultSet resultSet) throws SQLException {
        Film film = new Film();
        film.setId(resultSet.getInt(ID));
        film.setName(resultSet.getString(NAME));
        film.setYear(resultSet.getInt(YEAR));
        film.setRating(resultSet.getDouble(RATING));
        return film;
    }

    @Override
    public void populate(Film model, PreparedStatement statement) throws SQLException {
        statement.setString(1, model.getName());
        statement.setInt(2, model.getYear());
        statement.setDouble(3, model.getRating());
    }
}
