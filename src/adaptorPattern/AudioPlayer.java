package adaptorPattern;

/**
 * This class created on 2016/7/26.
 *
 * @author Osborn
 * @since Advanced FineBI Analysis 1.0
 */
public class AudioPlayer implements MediaPlayer {
    MediaPlayerAdaptor mediaPlayerAdaptor;
    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("mp3")) {
            System.out.println("AudioPlayer plays :: " + fileName);
        }else if(audioType.equalsIgnoreCase("mp4")||audioType.equalsIgnoreCase("mkv")) {
            mediaPlayerAdaptor = new MediaPlayerAdaptor(audioType);
            mediaPlayerAdaptor.play(audioType,fileName);
        }else {
            System.out.println("Invalid media. "+audioType+" format not supported");
        }
    }
}
