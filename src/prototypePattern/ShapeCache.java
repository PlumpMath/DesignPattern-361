package prototypePattern;

import java.util.HashMap;

/**
 * This class created on 2016/7/25.
 *
 * @author Osborn
 * @since Advanced FineBI Analysis 1.0
 */
public class ShapeCache {
    private static HashMap<Integer, Shape> shapeMap = new HashMap<Integer, Shape>();

    public static void loadCachedShape() {

        Shape circle = new Circle();
        circle.setId(1);
        shapeMap.put(circle.getId(), circle);


        Shape triangle = new Triangle();
        triangle.setId(2);
        shapeMap.put(triangle.getId(), triangle);


        Shape square = new Square();
        square.setId(3);
        shapeMap.put(square.getId(), square);
    }

    public static Shape getCachedShape(int shapeId) {
        Shape cachedShape = shapeMap.get(shapeId);
        return (Shape) cachedShape.clone();
    }
}
