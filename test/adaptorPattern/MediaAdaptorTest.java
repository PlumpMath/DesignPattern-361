package adaptorPattern;

import junit.framework.TestCase;

/**
 * This class created on 2016/7/26.
 *
 * @author Osborn
 * @since Advanced FineBI Analysis 1.0
 */
public class MediaAdaptorTest extends TestCase {
    public void testMediaAdaptor() {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "beyond the horizon.mp3");
        audioPlayer.play("mp4", "alone.mp4");
        audioPlayer.play("mkv", "far far away.mkv");
        audioPlayer.play("avi", "mind me.avi");
    }
}
