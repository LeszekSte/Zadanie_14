package zadanie_2;

import java.util.Objects;

public class Person implements Comparable<Person> {
    private String firstName;
    private String lastName;
    private int place;

    public Person(String firstName, String lastName, int place) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.place = place;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getPlace() {
        return place;
    }

    public void setPlace(int place) {
        this.place = place;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return getPlace() == person.getPlace() &&
                Objects.equals(getFirstName(), person.getFirstName()) &&
                Objects.equals(getLastName(), person.getLastName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirstName(), getLastName(), getPlace());
    }

    @Override
    public String toString() {
        return firstName+ ";"+ lastName + ";" + place +"\n";

    }


    @Override
    public int compareTo(Person o) {
        if (this.place > o.place) return 1;
        else if (this.place == o.place)
            return this.lastName.compareTo(o.lastName);
        else return -1;


    }
}
