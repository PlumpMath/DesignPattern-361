package prototypePattern;

import junit.framework.TestCase;

/**
 * This class created on 2016/7/25.
 *
 * @author Osborn
 * @since Advanced FineBI Analysis 1.0
 */
public class ShapeCacheTest extends TestCase {
    public void testShapeCache() {
        ShapeCache.loadCachedShape();

        Shape circle = ShapeCache.getCachedShape(1);
        circle.draw();
        Shape triangle = ShapeCache.getCachedShape(2);
        triangle.draw();
        Shape square = ShapeCache.getCachedShape(3);
        square.draw();
    }
}
