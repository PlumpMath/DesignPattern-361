package adaptorPattern;

/**
 * This class created on 2016/7/26.
 *
 * @author Osborn
 * @since Advanced FineBI Analysis 1.0
 */
public class mp4Player implements AdvancedMediaPlayer {
    @Override
    public void advancedPlay(String fileName) {
        System.out.println("mp4Player plays :: " +fileName);
    }
}
