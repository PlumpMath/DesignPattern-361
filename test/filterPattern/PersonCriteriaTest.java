package filterPattern;

import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.List;

/**
 * This class created on 2016/7/27.
 *
 * @author Osborn
 * @since Advanced FineBI Analysis 1.0
 */
public class PersonCriteriaTest extends TestCase {
    public void testPersonCriteria() {
        List<Person> persons = new ArrayList<Person>();

        persons.add(new Person("Robert","Male", false));
        persons.add(new Person("John","Male", true));
        persons.add(new Person("Laura","Female", true));
        persons.add(new Person("Diana","Female", false));
        persons.add(new Person("Mike","Male", false));
        persons.add(new Person("Bobby","Male", false));

        Criteria male = new MaleCriteria();
        Criteria female = new FemaleCriteria();
        Criteria single = new SingleCriteria();
        Criteria singleMale = new AndCriteria(single, male);
        Criteria singleOrFemale = new OrCriteria(single, female);


        System.out.println("Males: ");
        printPersons(male.meetCriteria(persons));

        System.out.println("\nFemales: ");
        printPersons(female.meetCriteria(persons));

        System.out.println("\nSingle Males: ");
        printPersons(singleMale.meetCriteria(persons));

        System.out.println("\nSingle Or Females: ");
        printPersons(singleOrFemale.meetCriteria(persons));
    }

    private void printPersons(List<Person> persons) {
        for (Person person : persons) {
            person.print();
        }
    }
}
