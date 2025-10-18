package show;

import person.Person;

public final class Opera extends MusicalShow {

    private final int choirSize;

    public Opera(String title, int duration, Person director,
                 String musicAuthor, String librettoText, int choirSize) {
        super(title, duration, director, musicAuthor, librettoText);
        this.choirSize = choirSize;
    }

    public int getChoirSize() {
        return choirSize;
    }
}
