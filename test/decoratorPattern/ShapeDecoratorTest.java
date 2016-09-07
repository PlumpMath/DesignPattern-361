package decoratorPattern;

import junit.framework.TestCase;

/**
 * This class created on 2016/7/29.
 *
 * @author Osborn
 * @since Advanced FineBI Analysis 1.0
 */
public class ShapeDecoratorTest extends TestCase {
    public void testShapeDecorator() {
        Shape circle = new Circle();
        Shape triangle = new Triangle();

        ShapeDecorator redCircle = new RedShapeDecorator(circle);
        ShapeDecorator blueTriangle = new BlueShapeDecorator(triangle);

        System.out.println("normal shape draw:");
        circle.draw();
        triangle.draw();

        System.out.println("\ndecorator shape draw:");
        redCircle.draw();
        blueTriangle.draw();

    }
}
