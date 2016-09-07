package prototypePattern;


/**
 * This class created on 2016/7/25.
 *
 * @author Osborn
 * @since Advanced FineBI Analysis 1.0
 */
public class Square extends Shape {
    public Square() {
        type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("Inside Square :: draw() method");
    }
}
