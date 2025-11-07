package show;

import person.Director;
import person.Person;

public abstract class MusicalShow extends Show {

    protected final Person musicAuthor;
    protected final String librettoText;

    public MusicalShow(String title, int duration, Director director,
                       Person musicAuthor, String librettoText) {
        super(title, duration, director);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }

    public void printLibretto() {
        System.out.println(librettoText);
    }
}
