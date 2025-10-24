package person;

import java.util.Objects;

public final class Actor extends Person {

    private final int height;

    public Actor(Gender gender, String name, String surname, int height) {
        super(gender, name, surname);
        this.height = height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Actor otherActor)) return false;
        return Objects.equals(gender, otherActor.gender)
                && Objects.equals(name, otherActor.name)
                && Objects.equals(surname, otherActor.surname)
                && height == otherActor.height;
    }

    @Override
    public int hashCode() {
        return Objects.hash(gender, name, surname, height);
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "height=" + height +
                ", gender=" + gender +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
