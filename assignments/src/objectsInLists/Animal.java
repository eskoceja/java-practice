package objectsInLists;

public class Animal {
    private String name;
    private boolean isCat;

    Animal(String name, boolean isCat){
        this.name = name;
        this.isCat = isCat;
    }

    public String getName() {
        return name;
    }

    public boolean isCat() {
        return isCat;
    }
    public String toString() {
        return this.name + " is a cat = " + this.isCat;
    }
}
