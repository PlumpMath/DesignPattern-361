package builderPattern;

/**
 * This class created on 2016/7/25.
 *
 * @author Osborn
 * @since Advanced FineBI Analysis 1.0
 */
public abstract class Burger implements Item {
    public Packing getPacking() {
        return new Wrapper();
    }
}
