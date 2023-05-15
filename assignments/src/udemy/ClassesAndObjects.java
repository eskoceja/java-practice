package udemy;

public class ClassesAndObjects {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Spongebob Squarepants";
        person1.age = 37;

        Person person2 = new Person();
        person2.name = "Sandy Cheeks";
        person2.age = 28;
    }
}

class Person {
    //Instance variables (data or "state")
    String name;
    int age;

    //Classes can contain
    //1. Data
    //2. subroutines (methods)
}