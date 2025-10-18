package show;

import person.Person;

public final class Ballet extends MusicalShow {

    private final String choreographer;

    public Ballet(String title, int duration, Person director,
                  String musicAuthor, String librettoText, String choreographer) {
        super(title, duration, director, musicAuthor, librettoText);
        this.choreographer = choreographer;
    }

    public String getChoreographer() {
        return choreographer;
    }
}
