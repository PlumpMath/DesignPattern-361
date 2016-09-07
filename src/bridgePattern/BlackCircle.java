package bridgePattern;

/**
 * This class created on 2016/7/27.
 *
 * @author Osborn
 * @since Advanced FineBI Analysis 1.0
 */
public class BlackCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Draw Circle: [ Color:Black, Radius:" + radius + ", x:" + x + ", y:" + y+" ]");
    }
}
