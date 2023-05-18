package udemy;

public class toStringMethod {
    public static void main(String[] args) {
        Rana frog1 = new Rana(7, "Freddie");
        Rana frog2 = new Rana(5, "Roger");

        System.out.println(frog1);
        System.out.println(frog2);

    }
}

class Rana {
    private String name;
    public int id;
    public Rana(int id, String name) {
        this.name = name;
        this.id = id;
    }
    public String toString() {

        return String.format("%-4d: %s", id, name);
        //same as below with formatting ^^

        /*StringBuilder sb = new StringBuilder();
        sb.append(id)
                .append(": ")
                .append(name);
        return sb.toString();*/
    }
}