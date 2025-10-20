package person;

public abstract class Person {

    protected final Gender gender;
    protected final String name;
    protected final String surname;

    public Person(Gender gender, String name, String surname) {
        this.gender = gender;
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
}
