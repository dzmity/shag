package jpa.repository;

import java.util.List;

import exception.EntityRepositoryException;
import jpa.model.Film;
import jpa.repository.CRUDRepository;

public interface FilmRepository extends CRUDRepository<Film, Integer> {

    List<Film> findByName(String name) throws EntityRepositoryException;
}
