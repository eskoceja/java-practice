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
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.feesPaid = 0;
        this.feesTotal = 30000;
    }
    //not going to alter student's id
    /*Used to updates the student's grade
    * @param grade new grade of student */
    public void setGrade(int grade) {
        this.grade = grade;
    }
    /* keep adding fees to fees paid field
    fees paid = 10,000 + 5,000 + 15,000
    Add fees to fees paid
    School is going to receive funds
    @param fees the fees that the student pays
    */
    public void payFees(int fees) {
        feesPaid += fees;
        School.updateTotalMoneyEarned(feesPaid);
    }
    //returns id
    public int getId() {
        return id;
    }
    //returns name
    public String getName() {
        return name;
    }
    //returns grade level
    public int getGrade() {
        return grade;
    }
    //returns fees paid
    public int getFeesPaid() {
        return feesPaid;
    }
    //returns fees total
    public int getFeesTotal() {
        return feesTotal;
    }
    //return remaining fees
    public int getRemainingFees() {
        return feesTotal -= feesPaid;
    }

    @Override
    public String toString() {
        return "Student name: " + name + " \n" +
                "Total fees paid so far: $" + feesPaid ;
    }
}
