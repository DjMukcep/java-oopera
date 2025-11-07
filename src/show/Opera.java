package show;

import person.Director;
import person.Person;

public final class Opera extends MusicalShow {

    private final int choirSize;

    public Opera(String title, int duration, Director director,
                 Person musicAuthor, String librettoText, int choirSize) {
        super(title, duration, director, musicAuthor, librettoText);
        this.choirSize = choirSize;
    }

    public int getChoirSize() {
        return choirSize;
    }
}
