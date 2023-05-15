package udemy;

public class Methods {
    public static void main(String[] args) {
        PersonA person1 = new PersonA();
        person1.name = "Spongebob Squarepants";
        person1.age = 37;
        person1.speak();
        person1.sayHello();

        PersonA person2 = new PersonA();
        person2.name = "Sandy Cheeks";
        person2.age = 28;
        person2.speak();
        person2.sayHello();



    }
}

class PersonA {
    //Instance variables (data or "state")
    String name;
    int age;

    //Classes can contain
    //1. Data
    //2. Subroutines (methods)
    void speak() {
        for(int i = 0; i < 3; i++) {
            System.out.println("My name is " + name + " and I am " + age + " years old.");
        }
    }
    void sayHello() {
        System.out.println("Hello there!");
    }

}