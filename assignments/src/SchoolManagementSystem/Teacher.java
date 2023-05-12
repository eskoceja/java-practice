package SchoolManagementSystem;

/*
* This class is responsible for keeping track
* of teachers name, id and salary*/

public class Teacher {
    private int id;
    private String name;
    private int salary;
    private int salaryEarned;

    /*Creates new object
    * @param id for the teacher
    * @param name of teacher
    * @param salary of the teacher */
    public Teacher(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.salaryEarned = 0;
    }
    //returns id
    public int getId() {
        return id;
    }
    //returns name
    public String getName() {
        return name;
    }
    //returns salary
    public int getSalary() {
        return salary;
    }
    //set the salary
    public void setSalary(int salary) {
        this.salary = salary;
    }

    //adds to the salary
    //removes from total money earned form school
    public void receiveSalary(int salary) {
        salaryEarned += salary;
        School.updateTotalMoneySpent(salary);
    }

    @Override
    public String toString() {
        return "Teacher name: " + name + " \n " +
                "Total Salary Earned So Far: $" + salaryEarned;
    }
}
