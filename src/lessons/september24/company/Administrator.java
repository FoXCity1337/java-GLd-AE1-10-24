package lessons.september24.company;

public class Administrator extends Employee {
    private String scope;

    public Administrator(String name, int lengthOfWork, int salary, String scope) {
        super(name, lengthOfWork, salary);
        this.scope = scope;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    @Override
    public String toString() {
        return "Administrator{" + "Name: " + super.getName() + "," +
                " LengthOfWork:" + super.getLengthOfWork() + "," +
                " Salary:" + super.getSalary() + "," +
                " scope='" + getScope()+ '\'' +
                "} ";
    }
}
