package jpa.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import exception.EntityRepositoryException;
import jpa.model.Actor;
import jpa.model.Film;
import mapping.ActorMapper;

public class ActorRepositoryImpl implements ActorRepository {

    private final String FIND_ALL_QUERY = "SELECT * FROM actors";
    private final String FIND_ALL_QUERY_BY_ID = "SELECT * FROM actors where id = ?";
    private final String FIND_ALL_QUERY_BY_NAME = "SELECT * FROM actors where name = ? and last_name = ?";
    private final String INSERT_PREPARED_STATEMENT = "INSERT INTO actors (name, last_name, date_of_birth) VALUES (?,?,?)";
    private final String DELETE_PREPARED_STATEMENT = "DELETE FROM actors WHERE id = ?";
    private final String UPDATE_PREPARED_STATEMENT = "UPDATE actors SET name = ?, last_name = ?, date_of_birth = ? WHERE id = ?";

    private Connection connection;

    private ActorMapper mapper = new ActorMapper();

    @Override
    public List<Actor> findByNameAndLastName(String name, String lastName) throws EntityRepositoryException {
        return null;
    }

    @Override
    public Actor save(Actor entity) throws EntityRepositoryException {
        try(PreparedStatement statement = connection.prepareStatement(INSERT_PREPARED_STATEMENT, Statement.RETURN_GENERATED_KEYS)) {
            mapper.populate(entity, statement);
            statement.executeUpdate();
            ResultSet rs = statement.getGeneratedKeys();
            if (rs.next()) {
                entity.setId(rs.getLong("id"));
            }
            return entity;

        } catch (SQLException e) {
            throw new EntityRepositoryException("Exception in save method", e);
        }
    }

    @Override
    public Optional<Actor> findById(Long id) throws EntityRepositoryException {
        try(PreparedStatement statement = connection.prepareStatement(FIND_ALL_QUERY_BY_ID)) {
            statement.setLong(1, id);
            ResultSet rs = statement.executeQuery();
            Optional<Actor> optionalActor = Optional.empty();
            if (rs.next()) {
                optionalActor = Optional.of(mapper.map(rs));
            }
            return optionalActor;

        } catch (SQLException e) {
            throw new EntityRepositoryException("Exception in findById method", e);
        }
    }

    @Override
    public List<Actor> findAll() throws EntityRepositoryException {
        return null;
    }

    @Override
    public Actor update(Actor entity) throws EntityRepositoryException {
        return null;
    }

    @Override
    public void deleteById(Long aLong) throws EntityRepositoryException {

    }

    @Override
    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }
}
