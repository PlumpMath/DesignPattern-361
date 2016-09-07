package builderPattern;

/**
 * This class created on 2016/7/25.
 *
 * @author Osborn
 * @since Advanced FineBI Analysis 1.0
 */
public interface Item {
    String getName();

    Packing getPacking();

    double getPrice();
}
