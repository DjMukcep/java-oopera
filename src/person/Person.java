package person;

public abstract class Person {

    protected final Gender gender;
    protected final String name;
    protected final String surName;

    public Person(Gender gender, String name, String surName) {
        this.gender = gender;
        this.name = name;
        this.surName = surName;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }
}
