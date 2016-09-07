package filterPattern;

import java.util.List;

/**
 * This class created on 2016/7/27.
 *
 * @author Osborn
 * @since Advanced FineBI Analysis 1.0
 */
public class OrCriteria implements Criteria {
    private Criteria criteria;
    private Criteria anotherCriteria;
    public OrCriteria(Criteria criteria, Criteria anotherCriteria) {
        this.criteria = criteria;
        this.anotherCriteria = anotherCriteria;
    }
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> persons1 = criteria.meetCriteria(persons);
        List<Person> persons2 = anotherCriteria.meetCriteria(persons);
        for (Person person : persons1) {
            if(!persons2.contains(person)){
                persons2.add(person);
            }
        }
        return persons2;
    }
}
