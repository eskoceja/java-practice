package HandlingExceptions.IllegalArgumentException;

public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;

        if (name == null || name.isEmpty() || name.length() > 40) {
            throw new IllegalArgumentException("Name must not be: null, empty or greater than 40 characters.");
        }

        if (age < 0 || age > 120) {
            throw new IllegalArgumentException("Age must be between 0 and 120.");
        }
        System.out.println("Name: " + name + " Age: " + age);

    }
}
