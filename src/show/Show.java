package show;

import person.Actor;
import person.Director;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public abstract class Show {

    protected final String title;
    protected final int duration;
    protected final Director director;
    protected final List<Actor> listOfActors;
    private final String className;
    private static final Logger log = Logger.getLogger(Show.class.getName());

    public Show(String title, int duration, Director director) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        listOfActors = new ArrayList<>();
        className = getClass().getSimpleName();
    }

    public void printActors() {
        System.out.printf("%s \"%s\" actors list:\n", className, title);
        for (Actor actor : listOfActors) {
            System.out.printf("%s %s (%d)\n",
                    actor.getName(), actor.getSurname(), actor.getHeight());
        }
    }

    public void addActor(Actor actor) {
        if (actor == null) {
            log.warning("Rejected. " + className + " - null not allowed.");
            return;
        }

        if (listOfActors.contains(actor)) {
            log.warning("Rejected. "
                    + className + " - attempt to add existing actor: " + actor.getSurname());
            return;
        }

        listOfActors.add((Actor) actor);
        System.out.printf("%s - added new actor: %s\n", className, actor);
    }

    public void changeActor(String surnameToDelete, Actor newActor) {
        int oldActorIndex = listOfActors.indexOf(listOfActors.stream()
                .filter(actor -> actor.getSurname().equals(surnameToDelete))
                .findAny().orElse(null));

        if (oldActorIndex == -1) {
            log.warning("Rejected. " + className
                    + " - actor with surname \"" + surnameToDelete + "\" not found.");
            return;
        }

        listOfActors.set(oldActorIndex, newActor);
        System.out.printf("%s - actors changed. Added actor: \"%s\" Removed actor: \"%s\"\n",
                className, newActor.getSurname(), surnameToDelete);
    }

    public void printDirector() {
        System.out.printf("%s director is %s %s.\n",
                className, director.getName(), director.getSurname());
    }
}
