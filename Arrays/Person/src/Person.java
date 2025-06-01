public class Person {
    private String lastName;
    private String firstName;
    private int age;

    public Person(String lastName, String firstName, int age ) {
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public void displayPerson() {
        System.out.print(" Last name: " + lastName);
        System.out.print(", First name: " + firstName);
        System.out.println(", Age: " + age);
    }
    public String getLastName() {
        return lastName;
    }
}