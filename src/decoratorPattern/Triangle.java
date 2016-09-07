package decoratorPattern;

/**
 * This class created on 2016/7/29.
 *
 * @author Osborn
 * @since Advanced FineBI Analysis 1.0
 */
public class Triangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Drawing Triangle");
    }

}
