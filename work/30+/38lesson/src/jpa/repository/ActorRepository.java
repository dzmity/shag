package jpa.repository;

import java.util.List;

import exception.EntityRepositoryException;
import jpa.model.Actor;

public interface ActorRepository extends CRUDRepository<Actor, Long> {

    List<Actor> findByNameAndLastName(String name, String lastName) throws EntityRepositoryException;

}
