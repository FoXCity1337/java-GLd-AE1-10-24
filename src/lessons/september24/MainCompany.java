package lessons.september24;

import september24.company.Administrator;
import september24.company.Director;
import september24.company.Employee;
import september24.company.Manager;

public class MainCompany {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Семен",3,2100);
        System.out.println(employee1);
        Director director = new Director("Олег",10,5000,true);
        System.out.println(director);
        Administrator administrator = new Administrator("Марк",4,3000,"DB");
        System.out.println(administrator);
        Manager manager = new Manager("Елена", 3, 3000,"Sales");
        System.out.println(manager);
    }
}
