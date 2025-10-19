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
    private static final Logger log = Logger.getLogger(Show.class.getName());

    public Show(String title, int duration, Director director) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = new ArrayList<>();
    }

    public void printActors() {
        System.out.printf("%s \"%s\" actors list:\n", getClass().getSimpleName(), title);
        for (Actor actor : listOfActors) {
            System.out.printf("%s %s (%d)\n", actor.getName(), actor.getSurName(), actor.getHeight());
        }
    }

    public void addActor(Actor actor) {
        if (actor == null) {
            log.warning("Rejected. Null not allowed.");
            return;
        }

        if (listOfActors.contains(actor)) {
            log.warning("Rejected. Attempt to add existing actor: " + actor.getSurName());
            return;
        }

        listOfActors.add((Actor) actor);
        System.out.printf("Added new actor: %s\n", actor);
    }

    public void changeActor(String surName, Actor newActor) {
        int oldActorIndex = listOfActors.indexOf(listOfActors.stream()
                .filter(actor -> actor.getSurName().equals(surName))
                .findAny().orElse(null));

        if (oldActorIndex == -1) {
            log.warning("Rejected. Actor with sur name \"" + surName + "\" not found.");
            return;
        }

        listOfActors.set(oldActorIndex, newActor);
        System.out.printf("Actors changed. Added actor: \"%s\" Removed actor: \"%s\"\n",
                newActor.getSurName(), surName);
    }

    public void printDirector() {
        System.out.printf("%s director is %s %s.\n",
                getClass().getSimpleName(), director.getName(), director.getSurName());
    }
}
