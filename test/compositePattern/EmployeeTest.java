package compositePattern;

import junit.framework.TestCase;

/**
 * This class created on 2016/7/28.
 *
 * @author Osborn
 * @since Advanced FineBI Analysis 1.0
 */
public class EmployeeTest extends TestCase {
    public void testEmployee() {
        Employee CEO = new Employee("John","CEO", 30000d);

        Employee headSales = new Employee("Robert","Head Sales", 20000d);

        Employee headMarketing = new Employee("Michel","Head Marketing", 20000d);

        Employee clerk1 = new Employee("Laura","Marketing", 10000d);
        Employee clerk2 = new Employee("Bob","Marketing", 10000d);

        Employee salesExecutive1 = new Employee("Richard","Sales", 10000d);
        Employee salesExecutive2 = new Employee("Rob","Sales", 10000d);


        CEO.add(headSales);
        CEO.add(headMarketing);

        headSales.add(salesExecutive1);
        headSales.add(salesExecutive2);

        headMarketing.add(clerk1);
        headMarketing.add(clerk2);


        System.out.println(CEO+"\n\n");
        for (Employee headEmployee : CEO.getSubordinates()) {
            System.out.println(headEmployee+"\n");
            for (Employee employee : headEmployee.getSubordinates()) {
                System.out.println(employee);
            }
            System.out.println("\n");
        }
    }
}
