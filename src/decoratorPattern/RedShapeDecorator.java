package decoratorPattern;

/**
 * This class created on 2016/7/29.
 *
 * @author Osborn
 * @since Advanced FineBI Analysis 1.0
 */
public class RedShapeDecorator extends ShapeDecorator {
    public RedShapeDecorator(Shape shape) {
        super(shape);
    }
    public void decorateShape() {
        System.out.println("Shape border color : red");
    }
}
