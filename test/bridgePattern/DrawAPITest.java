package bridgePattern;

import junit.framework.TestCase;


/**
 * This class created on 2016/7/27.
 *
 * @author Osborn
 * @since Advanced FineBI Analysis 1.0
 */
public class DrawAPITest extends TestCase {
    public void testDrawAPI() {
        Shape blackCircle = new Circle(1,0,0,new BlackCircle());
        blackCircle.draw();
        Shape whiteCircle = new Circle(1, 1, 1, new WhiteCircle());
        whiteCircle.draw();
    }
}
