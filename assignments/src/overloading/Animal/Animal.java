package overloading.Animal;
public class Animal {
    private String name;
    private boolean isCat;
    private int age;
    private String breed;
    private double weight;
    private boolean isBaby;

    Animal(String name, boolean isCat){
        this.name = name;
        this.isCat = isCat;
    }
    Animal(String name, boolean isCat, int age) {
        this.name = name;
        this.isCat = isCat;
        this.age = age;
    }
    Animal(String name, boolean isCat, String breed, double weight){
        this.name = name;
        this.isCat = isCat;
        this.breed = breed;
        this.weight = weight;
    }
    Animal(String name, boolean isCat, int age, String breed, double weight, boolean isBaby){
        this.name = name;
        this.isCat = isCat;
        this.age =age;
        this.breed = breed;
        this.weight = weight;
        this.isBaby = isBaby;
    }

    public String getName() {
        return name;
    }

    public boolean isCat() {
        return isCat;
    }

    public int getAge() {
        return age;
    }

    public String getBreed() {
        return breed;
    }

    public double getWeight() {
        return weight;
    }

    public boolean isBaby() {
        return isBaby;
    }

    public String toString() {
        return this.name + " is a cat = " + this.isCat + " \n" +
                this.name + " has the age of " + this.age + " in months and their breed is " + this.breed + " \n" +
                this.name + " weighs " + this.weight + ". \n" +
                "Now, you may be wondering if " + this.name + " is a baby. Well ... " + this.isBaby + " \n ";
    }
}
