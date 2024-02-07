package homework_method_objects;

public class Author {

    private String firstName;
    private String lastName;

    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "Автор: " + firstName + " " + lastName;
    }

    @Override
    public boolean equals(Object obj) {
        Author a2 = (Author) obj;
        return firstName.equals(a2.firstName) && lastName.equals(a2.lastName);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(firstName, lastName);
    }

}
