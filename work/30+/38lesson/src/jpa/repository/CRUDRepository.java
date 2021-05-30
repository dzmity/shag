package jpa.repository;

import java.sql.Connection;
import java.util.List;
import java.util.Optional;

import exception.EntityRepositoryException;

public interface CRUDRepository<E, ID> {

    // C - create
    E save(E entity) throws EntityRepositoryException;

    // R - read
    Optional<E> findById(ID id) throws EntityRepositoryException;

    // R - read
    List<E> findAll() throws EntityRepositoryException;

    // U - update
    E update(E entity) throws EntityRepositoryException;

    // D -delete
    void deleteById(ID id) throws EntityRepositoryException;


    Connection getConnection();

    void setConnection(Connection connection);
}
