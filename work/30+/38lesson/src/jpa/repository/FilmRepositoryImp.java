package jpa.repository;

import java.util.List;
import java.util.Optional;

import exception.EntityRepositoryException;
import jpa.model.Film;

public class FilmRepositoryImp implements FilmRepository {

    @Override
    public Film save(Film entity) throws EntityRepositoryException {
        throw new UnsupportedOperationException();
    }

    @Override
    public Optional<Film> findById(Integer integer) throws EntityRepositoryException {
        throw new UnsupportedOperationException();
    }

    @Override
    public List<Film> findAll() throws EntityRepositoryException {
        throw new UnsupportedOperationException();
    }

    @Override
    public Film update(Film entity) throws EntityRepositoryException {
        throw new UnsupportedOperationException();
    }

    @Override
    public void deleteById(Integer integer) throws EntityRepositoryException {

    }

    @Override
    public List<Film> findByName(String name) throws EntityRepositoryException {
        throw new UnsupportedOperationException();
    }
}
