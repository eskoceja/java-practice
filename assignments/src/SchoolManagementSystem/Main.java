package SchoolManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teacher julieta = new Teacher(1, "Julietta Venegas", 500);
        Teacher ana = new Teacher(2, "Ana Gabriel", 700);
        Teacher becky = new Teacher(3, "Becky G", 600);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(julieta);
        teacherList.add(ana);
        teacherList.add(becky);

        Student anahi = new Student(1, "Anahi", 4);
        Student dulce = new Student(2, "Dulce Maria", 12);
        Student lupe = new Student(3, "Lupita", 5);

        List<Student> studentList = new ArrayList<>();
        studentList.add(anahi);
        studentList.add(dulce);
        studentList.add(lupe);

        School eliteWay = new School(teacherList, studentList);
        System.out.println("Elite Way School is a new school and has a balance of: $" + eliteWay.getTotalMoneyEarned());

        //addTeacher method
        Teacher joy = new Teacher(6, "Joy Huerta", 900);
        eliteWay.addTeacher(joy);

        anahi.payFees(5000);
        System.out.println("Elite Way School has earned: $" + eliteWay.getTotalMoneyEarned() + " from Anahi's payment.");

        dulce.payFees(6000);
        System.out.println("Elite Way School has earned $6000 more from Dulce's payment and has a balance of: $" + eliteWay.getTotalMoneyEarned());
        System.out.println("");

        System.out.println(" ----- Making Elite Way School Pay Salary ----- ");

        julieta.receiveSalary(julieta.getSalary());
        System.out.println("Elite Way has paid the salary for " + julieta.getName() + " \n " +
                "and now has a balance of $" + eliteWay.getTotalMoneyEarned());

        ana.receiveSalary(ana.getSalary());
        System.out.println("Elite Way has paid the salary for " + ana.getName() + " \n " +
                "and now has a balance of $" + eliteWay.getTotalMoneyEarned());
        System.out.println();

        //over riding toString method
        System.out.println(lupe);
        System.out.println();

        becky.receiveSalary(becky.getSalary());
        System.out.println(becky);


    }
}
