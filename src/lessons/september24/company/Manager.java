package lessons.september24.company;

public class Manager extends Employee {
    private String departure;


    public Manager(String name, int lengthOfWork, int salary, String departure) {
        super(name, lengthOfWork, salary);
        this.departure = departure;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    @Override
    public String toString() {
        return "Manager{" + "Name: " + super.getName() + "," +
                " LengthOfWork:" + super.getLengthOfWork() + "," +
                " Salary:" + super.getSalary() + "," +
                " departure='" + departure + '\'' +
                "} ";
    }
}
