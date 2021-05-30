package jpa.transaction;

import java.sql.Connection;
import java.sql.SQLException;

import exception.EntityRepositoryException;
import jpa.repository.CRUDRepository;
import jpa.repository.ConnectionCreator;

public class EntityTransaction {

    private Connection connection;

    public void initTransaction(CRUDRepository... repositories) throws EntityRepositoryException {
        if (connection == null) {
            connection = ConnectionCreator.createConnection();
        }
        try {
            connection.setAutoCommit(false);
        } catch (SQLException e) {
            throw new EntityRepositoryException("Impossible to disable autocommit", e);
        }
        for (CRUDRepository repo : repositories) {
            repo.setConnection(connection);
        }
    }

    public void endTransaction() throws EntityRepositoryException {
        try {
            connection.setAutoCommit(true);
        } catch (SQLException e) {
            throw new EntityRepositoryException("Impossible to return autocommit", e);
        }
    }

    public void commit() throws EntityRepositoryException {
        try {
            connection.commit();
        } catch (SQLException e) {
            throw new EntityRepositoryException("Impossible to commit transaction", e);
        }
    }


    public void rollback() throws EntityRepositoryException {
        try {
            connection.rollback();
        } catch (SQLException e) {
            throw new EntityRepositoryException("Impossible to rollback transaction", e);
        }
    }
}
