package prototypePattern;

/**
 * This class created on 2016/7/25.
 *
 * @author Osborn
 * @since Advanced FineBI Analysis 1.0
 */
public abstract class Shape implements Cloneable {
    private int id;
    protected String type;

    public abstract void draw();

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return this.type;
    }

    public void setType() {
        this.type = type;
    }

    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return clone;
    }
}
