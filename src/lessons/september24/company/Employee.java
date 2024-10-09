package lessons.september24.company;

public class Employee {
    private String name;
    private int lengthOfWork;
    private int salary;

    public Employee(String name, int lengthOfWork, int salary) {
        this.name = name;
        this.lengthOfWork = lengthOfWork;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLengthOfWork() {
        return lengthOfWork;
    }

    public void setLengthOfWork(int lengthOfWork) {
        this.lengthOfWork = lengthOfWork;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", lengthOfWork=" + lengthOfWork +
                ", salary=" + salary +
                '}';
    }
}
