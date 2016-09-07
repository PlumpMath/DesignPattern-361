package decoratorPattern;

/**
 * This class created on 2016/7/29.
 *
 * @author Osborn
 * @since Advanced FineBI Analysis 1.0
 */
public class ShapeDecorator implements Shape {
    private Shape decoratorShape;

    public ShapeDecorator(Shape shape) {
        this.decoratorShape = shape;
    }

    @Override
    public void draw() {
        decoratorShape.draw();
        this.decorateShape();
    }

    public void decorateShape() {
        System.out.println("Shape border color : default black");
    }
}
