package compositePattern;

import java.util.ArrayList;
import java.util.List;

/**
 * This class created on 2016/7/28.
 *
 * @author Osborn
 * @since Advanced FineBI Analysis 1.0
 */
public class Employee {

    private String name;
    private String dept;
    private double salary;
    private List<Employee> subordinates;


    public Employee(String name, String dept, double salary) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
        subordinates = new ArrayList<>();
    }


    public void add(Employee employee) {
        subordinates.add(employee);
    }

    public void remove(Employee employee) {
        subordinates.remove(employee);
    }

    public String getSubordinatesName() {
        String str= "";
        for (Employee employee : subordinates) {
            str += employee.getName()+"*";
        }
        return str;
    }

    public String toString() {
        return ("Employee: [ Name:"+name+", dept:"+dept+", salary:"+salary+", subordinates:"+getSubordinatesName()+" ]");
    }

    public String getName() {
        return this.name;
    }

    public List<Employee> getSubordinates() {
        return subordinates;
    }


}
