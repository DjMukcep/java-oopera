package show;

import person.Person;

public abstract class MusicalShow extends Show {

    protected final String musicAuthor;
    protected final String librettoText;

    public MusicalShow(String title, int duration, Person director,
                       String musicAuthor, String librettoText) {
        super(title, duration, director);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }

    public void printLibretto() {
        System.out.println(librettoText);
    }
}
