package show;

import person.Actor;
import person.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public abstract class Show {

    protected final String title;
    protected final int duration;
    protected final Person director;
    protected final List<Actor> listOfActors;
    private static final Logger log = Logger.getLogger(Show.class.getName());

    public Show(String title, int duration, Person director) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = new ArrayList<>();
    }

    public void printActors() {
        System.out.printf("%s \"%s\" actors list:\n", this.getClass().getSimpleName(), title);
        for (Actor actor : listOfActors) {
            System.out.printf("%s %s (%d)\n", actor.getName(), actor.getSurName(), actor.getHeight());
        }
    }

    public void addActor(Person actor) {
        if (!(actor instanceof Actor)) {
            log.warning("Rejected. Invalid type.");
            return;
        }
        if (listOfActors.contains((Actor) actor)) {
            log.warning("Rejected. Attempt to add existing actor: " + actor);
            return;
        }
        listOfActors.add((Actor) actor);
        log.info("Added new actor: " + actor);
    }

    public void changeActor(Person oldActor, Person newActor) {
        if (!(oldActor instanceof Actor && newActor instanceof Actor)) {
            log.warning("Rejected. Invalid types.");
            return;
        }
        int oldActorIndex = listOfActors.indexOf(oldActor);
        if (oldActorIndex == -1) {
            log.warning("Rejected. Actor not found: " + oldActor);
            return;
        }
        listOfActors.set(oldActorIndex, (Actor) newActor);
        log.info("Actors changed. Added actor: "
                + newActor + "\n" + "Removed actor: " + oldActor);
    }

    public void getDirector() {
        System.out.println("Show director is "
                + director.getName() + " " + director.getSurName() + ".");
    }
}
