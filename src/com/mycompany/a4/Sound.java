package com.mycompany.a4;
import java.io.InputStream;
import com.codename1.media.Media;
import com.codename1.media.MediaManager;
import com.codename1.ui.Display;

public class Sound {
	// FIELDS********************************
	private Media m;
	// CONSTRUCTORS********************************
	public Sound(String fileName) {
		try 
		{
			InputStream is = Display.getInstance().getResourceAsStream(
					getClass(), "/" + fileName);
			m = MediaManager.createMedia( is , "audio/wav");
		} 
		catch (Exception err)
		{ 
			err.printStackTrace();
		}
	}
	// METHODS********************************
	public void play() {
		m.setTime(0);
		m.play();
	}

}
