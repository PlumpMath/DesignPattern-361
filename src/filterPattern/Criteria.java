package filterPattern;

import java.util.List;

/**
 * This class created on 2016/7/27.
 *
 * @author Osborn
 * @since Advanced FineBI Analysis 1.0
 */
public interface Criteria {
public List<Person> meetCriteria(List<Person> persons);
}
