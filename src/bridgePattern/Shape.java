package bridgePattern;

/**
 * This class created on 2016/7/27.
 *
 * @author Osborn
 * @since Advanced FineBI Analysis 1.0
 */
public abstract class Shape {
    protected DrawAPI drawAPI;

    public Shape(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }

    public abstract void draw();
}
