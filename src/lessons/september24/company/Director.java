package lessons.september24.company;

public class Director extends Employee {
    boolean hasSecretary;

    public Director(String name, int lengthOfWork, int salary, boolean hasSecretary) {
        super(name, lengthOfWork, salary);
        this.hasSecretary = hasSecretary;

    }

    public boolean isHasSecretary() {
        return hasSecretary;
    }

    @Override
    public String toString() {
        return "Director{" + "Name: " + super.getName() + "," +
                " LengthOfWork: " + super.getLengthOfWork() + "," +
                " Salary: " + super.getSalary() + "," +
                " hasSecretary='" + isHasSecretary() + '\'' +
                "} ";
    }
}
