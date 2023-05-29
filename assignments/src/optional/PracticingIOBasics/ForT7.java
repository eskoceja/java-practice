package optional.PracticingIOBasics;

import java.io.Serializable;
//Serialize it to make it usable for I/O operations
public class ForT7 implements Serializable {
    private String name;
    private int age;

    public ForT7(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
