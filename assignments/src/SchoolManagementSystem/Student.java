package SchoolManagementSystem;

/*
* Created 5/12/23
* This class is responsible for keeping track of
* student name, id, grade, fees and feed paid.
* */

public class Student {
    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    //constructor is to create new object by initializing value
    /*
    * @param id - for student id - unique
    * @param name - name of student
    * @param grade - grade of the student
    * fees for every student is $30,000/yr
    * fees paid initially is 0
    * */
    public Student(int id, String name, int grade) {
        this.id =id;
        this.name = name;
        this.grade =grade;
        this.feesPaid = 0;
        this.feesTotal = 30000;
    }

}
