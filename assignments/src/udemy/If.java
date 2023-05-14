package udemy;

public class If {
    public static void main(String[] args) {
        boolean cond = 3 > 8;
        System.out.println(cond); //prints false

        if (4 == 4) {
            System.out.println("Yes, it's true!");
        }

        if (5 != 5) {
            System.out.println("true");
        } else {
            System.out.println("false"); //this prints
        }

        int myInt = 10;

        if(myInt > 100) {
            System.out.println(myInt + " is greater than 100.");
        } else {
            System.out.println(myInt + " is not greater than 100"); //this prints
        }

        int anotherEx = 15;

        if(anotherEx < 10) {
            System.out.println("Yes, it's true");
        } else if (anotherEx > 20) {
            System.out.println("No, not true");
        } else {
            System.out.println("None of the above"); //this prints
        }

        int loop = 0;

        while(true) {
            System.out.println("Looping: " + loop);
//            loop++;
            if(loop == 5) {
                break;
            }
            loop++;
            System.out.println("Running");
        }
    }
}
