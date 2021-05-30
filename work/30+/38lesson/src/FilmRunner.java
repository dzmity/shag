import java.time.Instant;
import java.util.Date;
import java.util.List;

import jpa.model.Actor;
import jpa.model.Film;
import service.FilmService;

public class FilmRunner {

    public static void main(String[] args) {
        Film film = new Film();
        film.setName("123");
        film.setYear(2021);
        film.setRating(5.5);

        Actor actor = new Actor();
        actor.setName("Dima");
//        actor.setLastName("Pushkin");
        actor.setDateOfBirth(Date.from(Instant.now()));

        FilmService service = new FilmService();
        service.saveWithActors(film, List.of(actor));
    }
}
