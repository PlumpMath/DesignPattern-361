package decoratorPattern;

/**
 * This class created on 2016/7/29.
 *
 * @author Osborn
 * @since Advanced FineBI Analysis 1.0
 */
public class BlueShapeDecorator extends ShapeDecorator {
    public BlueShapeDecorator(Shape shape) {
        super(shape);
    }

    public void decorateShape() {
        System.out.println("Shape border color : blue");
    }
}
