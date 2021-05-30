package service;

import java.util.List;

import exception.EntityRepositoryException;
import jpa.model.Actor;
import jpa.model.Film;
import jpa.repository.ActorRepository;
import jpa.repository.ActorRepositoryImpl;
import jpa.repository.FilmRepository;
import jpa.repository.FilmRepositoryImpl;
import jpa.transaction.EntityTransaction;

public class FilmService {

    private FilmRepository filmRepository = new FilmRepositoryImpl();
    private ActorRepository actorRepository = new ActorRepositoryImpl();

    public void saveAll(List<Film> films) {

        FilmRepository filmRepository = new FilmRepositoryImpl();

        EntityTransaction tx = new EntityTransaction();
        try {
            tx.initTransaction(filmRepository);
            for (Film film : films) {
                filmRepository.save(film);
            }
            tx.commit();
        } catch (EntityRepositoryException e) {
            try {
                tx.rollback();
            } catch (EntityRepositoryException ex) {
                ex.printStackTrace();
            }
            e.printStackTrace();
        } finally {
            try {
                tx.endTransaction();
            } catch (EntityRepositoryException e) {

            }
        }
    }


    public void saveWithActors(Film film, List<Actor> actors) {

        EntityTransaction tx = new EntityTransaction();
        try {
            tx.initTransaction(filmRepository, actorRepository);
            filmRepository.save(film);
            for (Actor actor : actors) {
                actorRepository.save(actor);
            }
            tx.commit();
        } catch (EntityRepositoryException e) {
            try {
                tx.rollback();
            } catch (EntityRepositoryException ex) {
                ex.printStackTrace();
            }
            throw new RuntimeException(e);
        } finally {
            try {
                tx.endTransaction();
            } catch (EntityRepositoryException e) {
                e.printStackTrace();
            }
        }
    }
}
