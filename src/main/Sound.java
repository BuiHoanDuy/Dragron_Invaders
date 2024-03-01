package main;

import java.net.URL;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Sound {
	Clip clip;
	URL soundURL[] = new URL[30];
	
	public Sound() {
		soundURL[0] = getClass().getResource("/res/Dragon_Invader_Sound/background_music_loop.wav");
		soundURL[1] = getClass().getResource("/res/Dragon_Invader_Sound/dragon_hurt.wav");
		soundURL[2] = getClass().getResource("/res/Dragon_Invader_Sound/dragon_roar.wav");
		soundURL[3] = getClass().getResource("/res/Dragon_Invader_Sound/game_start.wav");
		soundURL[4] = getClass().getResource("/res/Dragon_Invader_Sound/level_up.wav");
		soundURL[5] = getClass().getResource("/res/Dragon_Invader_Sound/shoot2.wav");
		soundURL[6] = getClass().getResource("/res/Dragon_Invader_Sound/hurt.wav");
		soundURL[7] = getClass().getResource("/res/Dragon_Invader_Sound/game_over.wav");
		soundURL[8] = getClass().getResource("/res/Dragon_Invader_Sound/collect_coin.wav");
	}
	
	public void setFile(int i) {
		try {
			AudioInputStream ais = AudioSystem.getAudioInputStream(soundURL[i]);
			clip = AudioSystem.getClip();
			clip.open(ais);
		
		} catch (Exception e) {
		}
	}
	public void play() {
		clip.start();
	}
	public void loop() {
		clip.loop(Clip.LOOP_CONTINUOUSLY);
	}
	public void stop() {
		clip.stop();
	}
}
