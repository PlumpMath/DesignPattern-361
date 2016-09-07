package filterPattern;

import java.util.List;

/**
 * This class created on 2016/7/27.
 *
 * @author Osborn
 * @since Advanced FineBI Analysis 1.0
 */
public class AndCriteria implements Criteria {
    private Criteria criteria;
    private Criteria anotherCriteria;
    public AndCriteria(Criteria criteria, Criteria anotherCriteria) {
        this.criteria = criteria;
        this.anotherCriteria = anotherCriteria;
    }
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> persons1 = criteria.meetCriteria(persons);
        List<Person> persons2 = anotherCriteria.meetCriteria(persons1);
        return  persons2;
    }
}
