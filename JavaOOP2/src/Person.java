import java.util.Objects;

public class Person {
    String name;
    String EGN;
    int age;

    public Person(String name, String EGN, int age) {
        this.name = name;
        this.EGN = EGN;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name) &&
                Objects.equals(EGN, person.EGN);
    }

    @Override
    public int hashCode() {
        return Objects.hash( EGN);
    }
}
