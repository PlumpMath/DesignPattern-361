package adaptorPattern;

/**
 * This class created on 2016/7/26.
 *
 * @author Osborn
 * @since Advanced FineBI Analysis 1.0
 */
public class MediaPlayerAdaptor implements MediaPlayer {
    AdvancedMediaPlayer advancedMediaPlayer;

    public MediaPlayerAdaptor(String advancedMediaPlayerType) {
        if (advancedMediaPlayerType.equalsIgnoreCase("mp4")) {
            advancedMediaPlayer = new mp4Player();
        } else if (advancedMediaPlayerType.equalsIgnoreCase("mkv")) {
            advancedMediaPlayer = new mkvPlayer();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        advancedMediaPlayer.advancedPlay(fileName);
    }
}
