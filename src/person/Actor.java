package person;

import java.util.Objects;

public final class Actor extends Person {

    private final int height;

    public Actor(Gender gender, String name, String surName, int height) {
        super(gender, name, surName);
        this.height = height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Actor otherActor)) return false;
        return Objects.equals(gender, otherActor.gender)
                && Objects.equals(name, otherActor.name)
                && Objects.equals(surName, otherActor.surName)
                && height == otherActor.height;
    }

    @Override
    public int hashCode() {
        return Objects.hash(gender, name, surName, height);
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
                ", surName='" + surName + '\'' +
                '}';
    }
}
