package udemy;

public class GettersAndReturnValues {
    public static void main(String[] args) {
        PersonB person1 = new PersonB();
        person1.name = "Spongebob Squarepants";
        person1.age = 37;
//        person1.speak();
        int years = person1.calculateYearsToRetirement();
        System.out.println("Years till retirement: " + years);
        int age = person1.getAge();
        String name = person1.getName();

        System.out.println("Name is: " + name + "\n" +
                "Age is: " + age);

    }
}

class PersonB {
    String name;
    int age;

    void speak() {
        System.out.println("My name is " + name);
    }
    int calculateYearsToRetirement() {
        int yearsLeft = 65 -age;
//        System.out.println("I get to retire in " + yearsLeft + " years.");
        return yearsLeft;
    }

    int getAge() {
        return age;
    }

    String getName() {
        return name;
    }

}
