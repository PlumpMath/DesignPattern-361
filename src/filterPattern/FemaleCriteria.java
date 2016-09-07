package filterPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * This class created on 2016/7/27.
 *
 * @author Osborn
 * @since Advanced FineBI Analysis 1.0
 */
public class FemaleCriteria implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> personList = new ArrayList<>();
        for (Person person : persons) {
            if (person.getGender().equalsIgnoreCase("female")) {
                personList.add(person);
            }
        }
        return personList;
    }
}
