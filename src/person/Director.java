package person;

public final class Director extends Person {

    private final int numberOfShows;

    public Director(Gender gender, String name, String surname, int numberOfShows) {
        super(gender, name, surname);
        this.numberOfShows = numberOfShows;
    }

    @Override
    public String toString() {
        return "Director{" +
                "numberOfShows=" + numberOfShows +
                ", gender=" + gender +
                ", name='" + name + '\'' +
                ", surName='" + surname + '\'' +
                '}';
    }
}
