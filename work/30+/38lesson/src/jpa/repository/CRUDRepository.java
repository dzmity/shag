package jpa.repository;

import java.util.List;
import java.util.Optional;

import exception.EntityRepositoryException;

public interface CRUDRepository<E, ID> {

    E save(E entity) throws EntityRepositoryException;

    Optional<E> findById(ID id) throws EntityRepositoryException;

    List<E> findAll() throws EntityRepositoryException;

    E update(E entity) throws EntityRepositoryException;

//    void delete(E id) throws EntityRepositoryException;

    void deleteById(ID id) throws EntityRepositoryException;
}
