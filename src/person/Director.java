package person;

public final class Director extends Person {

    private final int numberOfShows;

    public Director(Gender gender, String name, String surName, int numberOfShows) {
        super(gender, name, surName);
        this.numberOfShows = numberOfShows;
    }

    @Override
    public String toString() {
        return "Director{" +
                "numberOfShows=" + numberOfShows +
                ", gender=" + gender +
                ", name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                '}';
    }
}
