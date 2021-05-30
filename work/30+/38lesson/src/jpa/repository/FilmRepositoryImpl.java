package jpa.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import exception.EntityRepositoryException;
import jpa.model.Film;
import mapping.FilmMapper;

public class FilmRepositoryImpl implements FilmRepository {

    private static final String FIND_ALL_QUERY = "select * from films";
    private static final String FIND_BY_ID_QUERY = "select * from films f WHERE f.id = ?";
    private final String FIND_BY_NAME_QUERY = "SELECT * FROM films where name = ?";
    private final String INSERT_PREPARED_STATEMENT = "INSERT INTO films (name, year, raiting) VALUES (?,?,?)";
    private final String DELETE_PREPARED_STATEMENT = "DELETE FROM films WHERE id = ?";
    private final String UPDATE_PREPARED_STATEMENT = "UPDATE films SET name = ?, year = ?, raiting = ? WHERE id = ?";

    private FilmMapper mapper = new FilmMapper();

    private Connection connection;


    @Override
    public List<Film> findByName(String name) throws EntityRepositoryException {
        try(PreparedStatement statement = connection.prepareStatement(FIND_BY_NAME_QUERY)) {
            statement.setString(1, name);
            ResultSet rs = statement.executeQuery();
            ResultSetMetaData metaData = rs.getMetaData();
            List<Film> result = new ArrayList<>();
            while (rs.next()) {
                result.add(mapper.map(rs));
            }
            return result;

        } catch (SQLException e) {
            throw new EntityRepositoryException("Exception in findByName method", e);
        }
    }

    @Override
    public Film save(Film entity) throws EntityRepositoryException {
        try(PreparedStatement statement = connection.prepareStatement(INSERT_PREPARED_STATEMENT, Statement.RETURN_GENERATED_KEYS)) {
            mapper.populate(entity, statement);
            statement.executeUpdate();
            ResultSet rs = statement.getGeneratedKeys();
            if (rs.next()) {
                entity.setId(rs.getInt("id"));
            }
            return entity;

        } catch (SQLException e) {
            throw new EntityRepositoryException("Exception in save method", e);
        }
    }

    @Override
    public Optional<Film> findById(Integer integer) throws EntityRepositoryException {
        return Optional.empty();
    }

    @Override
    public List<Film> findAll() throws EntityRepositoryException {
        return null;
    }

    @Override
    public Film update(Film entity) throws EntityRepositoryException {
        return null;
    }

    @Override
    public void deleteById(Integer integer) throws EntityRepositoryException {

    }

    @Override
    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }
}
