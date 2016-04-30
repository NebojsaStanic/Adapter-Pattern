
public class AdapterPatternDemo {

	public static void main(String[] args) {
		
		AudioPlayer audioPlayer = new AudioPlayer();
		
		audioPlayer.play("mp3", "HELLO.mp3");
		audioPlayer.play("mp4", "WORLD.mp4");
		audioPlayer.play("vlc", "Far away.vlc");
		audioPlayer.play("avi", "mind me.avi");

	}

}
