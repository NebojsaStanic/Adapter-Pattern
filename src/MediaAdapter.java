
public class MediaAdapter implements MediaPlayer{
	
	AdvancedMediaPlayer advancedMediaPlayer;
	
	public MediaAdapter(String fileName) {
		
		if(fileName.equalsIgnoreCase("mp4")){
			advancedMediaPlayer = new Mp4Player();
		}
		
		else if(fileName.equalsIgnoreCase("vlc")){
			advancedMediaPlayer = new VlcPlayer();
		}
	}

	@Override
	public void play(String audioType, String fileName) {
		if(audioType.equalsIgnoreCase("vlc")){
			advancedMediaPlayer.playVlc(fileName);
		}
		else if(audioType.equalsIgnoreCase("mp4")){
			advancedMediaPlayer.playMp4(fileName);
		}
		
	}

}
