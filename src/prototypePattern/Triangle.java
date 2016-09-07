package prototypePattern;

/**
 * This class created on 2016/7/25.
 *
 * @author Osborn
 * @since Advanced FineBI Analysis 1.0
 */
public class Triangle extends Shape {
    public Triangle() {
        type = "Triangle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Triangle :: draw() method");
    }
}
